package com.example.user.racingsnails;

import java.util.ArrayList;

/**
 * Created by user on 12/12/2016.
 */
public class Ranking {

    private ArrayList<Snail> rankings;

    public Ranking(ArrayList<Snail> snails) {
        this.rankings = new ArrayList<Snail>(snails);
    }

    public int countSnails() {
        return this.rankings.size();
    }

    public void addSnail(Snail snail) {
        this.rankings.add(snail);
    }

    public String getSnailByRanking(int ranking) {
        int index = ranking - 1;
        Snail snail = this.rankings.get(index);
        return snail.toString();
    }

}
