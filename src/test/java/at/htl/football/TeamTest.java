package at.htl.football;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.Matchers.greaterThan;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
class TeamTest {

    @Test
    public void Team(){

        Team t = new Team("Salzburg");

        assertThat(t.getName(), is("Salzburg"));

    }

    @Test
    public void addMatch(){

        Team t1 = new Team("Salzburg");
        Team t2 = new Team("Deutschland");
        Match m = new Match("Salzburg", "Deutschland", 5, 1);

        t1.addMatch(m);
        t2.addMatch(m);

        assertThat(t1.getWins(), is(1));
        assertThat(t1.getDefeats(), is(0));
        assertThat(t1.getDraws(), is(0));
        assertThat(t1.getPoints(), is(3));
        assertThat(t1.getGoalsShot(), is(5));
        assertThat(t1.getGoalsReceived(), is(1));

        assertThat(t2.getWins(), is(0));
        assertThat(t2.getDefeats(), is(1));
        assertThat(t2.getDraws(), is(0));
        assertThat(t2.getPoints(), is(0));
        assertThat(t2.getGoalsShot(), is(1));
        assertThat(t2.getGoalsReceived(), is(5));

    }

    @Test
    public void compareTo(){

//        Team t = new Team("Salzburg");
//        Team thisTeam = new Team("Deutschland");
//        Match salzburgDeutschlandPoints = new Match("Salzburg", "Deutschland", 5, 1);
//        t.addMatch(salzburgDeutschlandPoints);
//        thisTeam.addMatch(salzburgDeutschlandPoints);
//
//        assertThat(thisTeam.compareTo(t), is(4));

    }



}
