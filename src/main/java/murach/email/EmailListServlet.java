package murach.email;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import murach.business.User;
import murach.business.Survey;
import murach.business.SurveyDTO;
import murach.data.UserDB;

import java.io.IOException;
import java.time.LocalDate;

@WebServlet({"/emailList", "/survey"})
public class EmailListServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        String url = "/index.jsp";
        String action = request.getParameter("action");

        if (action == null) {
            action = "join";
        }

        if (action.equals("join")) {
            url = "/index.jsp";
        } else if (action.equals("add")) {
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            String dateOfBirth = request.getParameter("dateOfBirth");

            if (firstName == null || firstName.trim().isEmpty()
                    || lastName == null || lastName.trim().isEmpty()
                    || email == null || email.trim().isEmpty()
                    || dateOfBirth == null || dateOfBirth.trim().isEmpty()) {
                request.setAttribute("message", "Please fill out all fields.");
                url = "/index.jsp";
            } else {
                String hearAbout = request.getParameter("hearAbout");
                boolean wantsAnnouncements = "YES".equals(request.getParameter("wantsAnnouncements"));
                boolean wantsCdReleases = "YES".equals(request.getParameter("wantsCdReleases"));
                String contactVia = request.getParameter("contactVia");

                User user = new User(firstName, lastName, email, LocalDate.parse(dateOfBirth));
                Survey survey = new Survey(hearAbout, wantsAnnouncements,
                        wantsCdReleases, contactVia);
                SurveyDTO surveyDTO = new SurveyDTO(user, survey);
                UserDB.insert(surveyDTO);

                request.setAttribute("surveyDTO", surveyDTO);
                url = "/thanks.jsp";
            }
        }

        System.out.println(action);
        log(action);

        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}
