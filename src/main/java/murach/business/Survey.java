package murach.business;

import java.io.Serializable;

public class Survey implements Serializable {
    private User user;
    private String hearAbout;
    private boolean wantsAnnouncements;
    private boolean wantsCdReleases;
    private String contactVia;

    public Survey() {
        hearAbout = "";
        contactVia = "";
    }

    public Survey(User user, String hearAbout, boolean wantsAnnouncements,
                  boolean wantsCdReleases, String contactVia) {
        this.user = user;
        this.hearAbout = hearAbout;
        this.wantsAnnouncements = wantsAnnouncements;
        this.wantsCdReleases = wantsCdReleases;
        this.contactVia = contactVia;
    }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

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
