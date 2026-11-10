<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Murach's Java Servlets and JSP</title>
    <link rel="stylesheet" href="main.css">
</head>
<body>
<main>
    <img src="images/murach_logo.jpg" alt="Murach Logo" class="logo">

    <h1>Thanks for completing our survey</h1>
    <p>Here is the information that you entered:</p>

    <p>
        <strong>Email:</strong>
        <span class="data">${user.email}</span><br>

        <strong>First Name:</strong>
        <span class="data">${user.firstName}</span><br>

        <strong>Last Name:</strong>
        <span class="data">${user.lastName}</span><br>

        <strong>Date of Birth:</strong>
        <span class="data">${user.dateOfBirth}</span><br>

        <strong>How did you hear about us?</strong>
        <span class="data">${user.hearAbout}</span><br>

        <strong>Announcements:</strong>
        <span class="data">${user.wantsAnnouncements ? 'Yes' : 'No'}</span><br>

        <strong>New CD releases:</strong>
        <span class="data">${user.wantsCdReleases ? 'Yes' : 'No'}</span><br>

        <strong>Contact me by:</strong>
        <span class="data">${user.contactVia}</span>
    </p>

    <p>To complete another survey, click the Return button below.</p>

    <form action="emailList" method="get">
        <input type="hidden" name="action" value="join">
        <input type="submit" value="Return">
    </form>
</main>
</body>
</html>
