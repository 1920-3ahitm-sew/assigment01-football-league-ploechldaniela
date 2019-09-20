package at.htl.football;

public class Team implements Comparable<Team> {

    private String name;
    private int points;
    private int wins;
    private int draws;
    private int defeats;
    private int goalsShot;
    private int goalsReceived;

    public Team(String name){
        this.name = name;
    }

    public void addMatch(Match match){

        if (this.getName().equals(match.getHomeName())){

            if (match.getHomeGoals() > match.getGuestGoals()){
                this.wins = this.wins + 1;
                this.points = this.points + 3;
                this.goalsShot = this.goalsShot + match.getHomeGoals();
                this.goalsReceived = this.goalsReceived + match.getGuestGoals();
            }else if (match.getHomeGoals() == match.getGuestGoals()){
                this.points = this.points + 1;
                this.draws = this.draws + 1;
                this.goalsShot = this.goalsShot + match.getHomeGoals();
                this.goalsReceived = this.goalsReceived + match.getGuestGoals();
            }else if (match.getHomeGoals() < match.getGuestGoals()){
                this.defeats = this.defeats + 1;
                this.goalsShot = this.goalsShot + match.getHomeGoals();
                this.goalsReceived = this.goalsReceived + match.getGuestGoals();
            }

        }else if (this.getName().equals(match.getGuestName())){

            if (match.getGuestGoals() > match.getHomeGoals()){
                this.wins = this.wins + 1;
                this.points = this.points + 3;
                this.goalsShot = this.goalsShot + match.getGuestGoals();
                this.goalsReceived = this.goalsReceived + match.getHomeGoals();
            }else if (match.getGuestGoals() == match.getHomeGoals()){
                this.points = this.points + 1;
                this.draws = this.draws + 1;
                this.goalsShot = this.goalsShot + match.getGuestGoals();
                this.goalsReceived = this.goalsReceived + match.getHomeGoals();
            }else if (match.getGuestGoals() < match.getHomeGoals()){
                this.defeats = this.defeats + 1;
                this.goalsShot = this.goalsShot + match.getGuestGoals();
                this.goalsReceived = this.goalsReceived + match.getHomeGoals();
            }

        }

    }

    public String getName(){
        return name;
    }

    public int getPoints() {
        return points;
    }

    public int getWins() {
        return wins;
    }

    public int getDraws() {
        return draws;
    }

    public int getDefeats() {
        return defeats;
    }

    public int getGoalsShot() {
        return goalsShot;
    }

    public int getGoalsReceived() {
        return goalsReceived;
    }

    public int compareTo(Team t){

        if (t.getPoints() - this.getPoints() == 0) {
            return (t.goalsShot - t.goalsReceived) - (this.goalsShot - this.goalsReceived);
        }

        return t.getPoints() - this.getPoints();
    }
}
