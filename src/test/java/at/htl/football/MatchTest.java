package at.htl.football;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.Matchers.greaterThan;

@TestMethodOrder(MethodOrderer.Alphanumeric.class)
class MatchTest {

    @Test
    public void Match(){

        Match m = new Match("Salzburg", "Deutschland", 5, 1);

        assertThat(m.getHomeName(), is("Salzburg"));
        assertThat(m.getGuestName(), is("Deutschland"));
        assertThat(m.getHomeGoals(), is(5));
        assertThat(m.getGuestGoals(), is(1));

    }

}