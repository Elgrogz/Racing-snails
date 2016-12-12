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
    Snail snail11;
    Ranking rankings;

    @Before
    public void before() {
        snail1 = new Snail("Jeff Snailington", "Speed Merchant", 1);
        snail2 = new Snail("Wendy Slugsworth", "The Fastest Slug in the West", 2);
        snail3 = new Snail("Sliminho", "O Caracol Lindo", 3);
        snail4 = new Snail("Slimy Susie", "Slowpoke", 4);
        snail5 = new Snail("Wesley Slimes", "Blade", 5);
        snail6 = new Snail("Gustav von Hammarschlug", "Der Schnecke", 6);
        snail7 = new Snail("Usain Slug", "The Red Stripe", 7);
        snail8 = new Snail("Shellz", "The Snail Formerly Known As", 8);
        snail9 = new Snail("Terry Tentacles", "Four Eyes", 9);
        snail10 = new Snail("Billy the Bastard", "The Horny Helix", 10);
        snail11 = new Snail("Pistol Pete", "The Outcast", 11);
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

    // Earlier test to make sure ArrayList was working
//    @Test
//    public void canAddSnail() {
//        rankings.addSnail(snail3);
//        assertEquals(3, rankings.countSnails());
//    }

    //Can show all snails if needed
//    @Test
//    public void canShowSnails() {
//        rankings.showAllSnails();
//    }

    @Test
    public void canGetSnailByRank() {
        assertEquals("Name: Jeff Snailington, Nickname: Speed Merchant, Current Rank: 1", rankings.getSnailByRanking(1));
    }

    @Test
    public void canGetTenth() {
        rankings.promoteSnailToTenth(snail11);
        assertEquals("Name: Pistol Pete, Nickname: The Outcast, Current Rank: 10", rankings.getSnailByIndex(9).toString());
    }

    @Test
    public void canGetSnailInListByName() {
        assertEquals("Name: Sliminho, Nickname: O Caracol Lindo, Current Rank: 3", rankings.findSnailByName("Sliminho"));
    }

    @Test
    public void canPromoteSnailByOne() {
        assertEquals("Name: Wesley Slimes, Nickname: Blade, Current Rank: 5", rankings.getSnailByRanking(5));
        rankings.promoteSnailByOne(snail5);
        assertEquals("Name: Wesley Slimes, Nickname: Blade, Current Rank: 4", rankings.getSnailByRanking(4));
    }

    @Test
    public void canDemoteSnailByOne() {
        assertEquals("Name: Wesley Slimes, Nickname: Blade, Current Rank: 5", rankings.getSnailByRanking(5));
        rankings.demoteSnailByOne(snail5);
        assertEquals("Name: Gustav von Hammarschlug, Nickname: Der Schnecke, Current Rank: 5", rankings.getSnailByRanking(5));
        rankings.showAllSnails();
    }
}
