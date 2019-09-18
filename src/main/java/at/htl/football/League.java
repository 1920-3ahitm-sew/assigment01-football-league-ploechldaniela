package at.htl.football;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League {

    private List<Team> teams = new ArrayList<>();

    public void addMatchResult(Match match){

            Team homeTeam = findOrCreateTeam(match.getHomeName());
            Team guestTeam = findOrCreateTeam(match.getGuestName());
            homeTeam.addMatch(match);
            guestTeam.addMatch(match);

    }

    private Team findOrCreateTeam(String team){

        for (Team t : teams){
            if (t.getName().equals(team)){
                return t;
            }
        }

        teams.add(new Team(team));
        return teams.get(teams.size() - 1);
    }

    public List<Team> getTable(){

        Collections.sort(teams);

        return teams;
    }

}
