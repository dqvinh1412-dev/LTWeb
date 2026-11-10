package murach.business;

import java.io.Serializable;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String dateOfBirth;
    private String hearAbout;
    private boolean wantsAnnouncements;
    private boolean wantsCdReleases;
    private String contactVia;

    public User() {
        firstName = "";
        lastName = "";
        email = "";
        dateOfBirth = "";
        hearAbout = "";
        contactVia = "";
    }

    public User(String firstName, String lastName, String email) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public User(String firstName, String lastName, String email, String dateOfBirth,
                String hearAbout, boolean wantsAnnouncements, boolean wantsCdReleases,
                String contactVia) {
        this(firstName, lastName, email);
        this.dateOfBirth = dateOfBirth;
        this.hearAbout = hearAbout;
        this.wantsAnnouncements = wantsAnnouncements;
        this.wantsCdReleases = wantsCdReleases;
        this.contactVia = contactVia;
    }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(String dateOfBirth) { this.dateOfBirth = dateOfBirth; }

    public String getHearAbout() { return hearAbout; }
    public void setHearAbout(String hearAbout) { this.hearAbout = hearAbout; }

    public boolean isWantsAnnouncements() { return wantsAnnouncements; }
    public void setWantsAnnouncements(boolean wantsAnnouncements) {
        this.wantsAnnouncements = wantsAnnouncements;
    }

    public boolean isWantsCdReleases() { return wantsCdReleases; }
    public void setWantsCdReleases(boolean wantsCdReleases) {
        this.wantsCdReleases = wantsCdReleases;
    }

    public String getContactVia() { return contactVia; }
    public void setContactVia(String contactVia) { this.contactVia = contactVia; }
}
