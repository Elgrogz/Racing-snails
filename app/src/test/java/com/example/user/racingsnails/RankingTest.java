package com.example.user.racingsnails;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by user on 12/12/2016.
 */
public class RankingTest {

    Snail snail1;
    Snail snail2;
    Snail snail3;
    Ranking rankings;

    @Before
    public void before() {
        snail1 = new Snail("Jeff Snailington", "The Destroyer", 1);
        snail2 = new Snail("Jemima Slugsworth", "The Fastest Slug in the West", 2);
        snail3 = new Snail("Sliminho", "Snail Pele", 3);
        ArrayList<Snail> snails = new ArrayList<Snail>();
        snails.add(snail1);
        snails.add(snail2);
        rankings = new Ranking(snails);
    }

    @Test
    public void canCountSnails() {
        assertEquals(2, rankings.countSnails());
    }

    @Test
    public void canAddSnail() {
        rankings.addSnail(snail3);
        assertEquals(3, rankings.countSnails());
    }

    @Test
    public void canGetSnailByRank() {
        assertEquals("Name: Jeff Snailington, Nickname: The Destroyer, Current Rank: 1", rankings.getSnailByRanking(1));
        System.out.println(rankings.getSnailByRanking(2));
    }


}
