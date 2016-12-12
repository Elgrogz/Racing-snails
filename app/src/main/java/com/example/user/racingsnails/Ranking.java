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

    public void showAllSnails() {
        for (Snail snail : rankings) {
            System.out.println(snail.toString());
        }
    }

    public Snail getSnailByIndex(int index) {
        return this.rankings.get(index);
    }

    public String getSnailByRanking(int ranking) {
        int index = ranking - 1;
        Snail snail = this.rankings.get(index);
        return snail.toString();
    }

    public void promoteSnailToTenth(Snail snail) {
        this.rankings.remove(9);
        this.rankings.add(snail);
        snail.setCurrentRank(10);
    }

}
