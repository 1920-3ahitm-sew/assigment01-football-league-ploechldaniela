package at.htl.football;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.Matchers.greaterThan;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
class LeagueTest {

    @Test
    public void addMatchResult(){

        League l = new League();
        Match m1 = new Match("Salzburg", "Deutschland", 5, 1);
        Match m2 = new Match("Österreich", "Deutschland", 5, 1);

        l.addMatchResult(m1);
        l.addMatchResult(m2);

        List<Team> t = l.getTable();

        assertThat(t.get(0).getName(), is("Salzburg"));
        assertThat(t.get(1).getName(), is("Österreich"));

    }

}