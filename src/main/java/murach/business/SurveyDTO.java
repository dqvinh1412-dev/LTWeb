package murach.business;

import java.io.Serializable;

public class SurveyDTO implements Serializable {
    private User user;
    private Survey survey;

    public SurveyDTO() {
    }

    public SurveyDTO(User user, Survey survey) {
        this.user = user;
        this.survey = survey;
    }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public Survey getSurvey() { return survey; }
    public void setSurvey(Survey survey) { this.survey = survey; }
}
