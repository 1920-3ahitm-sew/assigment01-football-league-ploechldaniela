package at.htl.football;

public class Match {

    private String homeName;
    private String guestName;
    private int homeGoals;
    private int guestGoals;
    private int homePoints;
    private int guestPoints;

    public Match(String homeName, String guestName, int homeGoals, int guestGoals){
        this.homeName = homeName;
        this.guestName = guestName;
        this.homeGoals = homeGoals;
        this.guestGoals = guestGoals;
    }


    public String getGuestName() {
        return guestName;
    }

    public String getHomeName(){
        return homeName;
    }

    public int getHomeGoals() {
        return homeGoals;
    }

    public int getGuestGoals() {
        return guestGoals;
    }

    public int getHomePoints(){
        return homePoints;
    }

    public int getGuestPoints(){
        return guestPoints;
    }
}
