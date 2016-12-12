package com.example.user.racingsnails;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 12/12/2016.
 */
public class SnailTest {

    Snail snail1;
    Snail snail2;

    @Before
    public void before() {
        snail1 = new Snail("Jeff Snailington", "The Destroyer", 1);
        snail2 = new Snail("Jemima Slugsworth", "The Fastest Slug in the West", 2);
    }

    @Test
    public void canGetName() {
        assertEquals("Jeff Snailington", snail1.getName());
    }

    @Test
    public void canGetNickname() {
        assertEquals("The Destroyer", snail1.getNickname());
    }

    @Test
    public void canGetCurrentRanking() {
        assertEquals(1, snail1.getCurrentRank());
    }

    @Test
    public void canSetName() {
        snail1.setName("Geoff");
        assertEquals("Geoff", snail1.getName());
    }

    @Test
    public void canSetNickname() {
        snail1.setNickname("of House Geoff");
        assertEquals("of House Geoff", snail1.getNickname());
    }

    @Test
    public void canSetCurrentRanking() {
        snail1.setCurrentRank(3);
        assertEquals(3, snail1.getCurrentRank());
    }

    @Test
    public void canGetSnailToString() {
        assertEquals("Name: Jeff Snailington, Nickname: The Destroyer, Current Rank: 1", snail1.toString());
    }

}
