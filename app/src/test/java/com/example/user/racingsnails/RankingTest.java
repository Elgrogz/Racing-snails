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
    Snail snail4;
    Snail snail5;
    Snail snail6;
    Snail snail7;
    Snail snail8;
    Snail snail9;
    Snail snail10;
    Ranking rankings;

    @Before
    public void before() {
        snail1 = new Snail("Jeff Snailington", "The Destroyer", 1);
        snail2 = new Snail("Jemima Slugsworth", "The Fastest Slug in the West", 2);
        snail3 = new Snail("Sliminho", "Snail Pele", 3);
        snail4 = new Snail("Samuel Snail", "Slowpoke", 4);
        snail5 = new Snail("Jimmy Thunder", "Speedster", 5);
        snail6 = new Snail("Random snail", "a snail", 6);
        snail7 = new Snail("Usain Slug", "The Red Stripe", 7);
        snail8 = new Snail("Shellz", "The Snail Formerly Known As", 8);
        snail9 = new Snail("Terry Tentacles", "Four Eyes", 9);
        snail10 = new Snail("Billy the Bastard", "Bawjaws", 10);
        ArrayList<Snail> snails = new ArrayList<Snail>();
        snails.add(snail1);
        snails.add(snail2);
        snails.add(snail3);
        snails.add(snail4);
        snails.add(snail5);
        snails.add(snail6);
        snails.add(snail7);
        snails.add(snail8);
        snails.add(snail9);
        snails.add(snail10);
        rankings = new Ranking(snails);
    }

    @Test
    public void canCountSnails() {
        assertEquals(10, rankings.countSnails());
    }

//    @Test
//    public void canAddSnail() {
//        rankings.addSnail(snail3);
//        assertEquals(3, rankings.countSnails());
//    }

    @Test
    public void canShowSnails() {
        rankings.showAllSnails();
    }

    @Test
    public void canGetSnailByRank() {
        assertEquals("Name: Jeff Snailington, Nickname: The Destroyer, Current Rank: 1", rankings.getSnailByRanking(1));
    }


}
