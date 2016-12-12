package com.example.user.racingsnails;

/**
 * Created by user on 12/12/2016.
 */
public class Snail {

    private String name;
    private String nickname;
    private int currentRank;

    public Snail (String name, String nickname, int currentRank) {
        this.name = name;
        this.nickname = nickname;
        this.currentRank = currentRank;
    }

    public String getName() {
        return this.name;
    }

    public String getNickname() {
        return this.nickname;
    }

    public int getCurrentRank() {
        return this.currentRank;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setCurrentRank(int rank) {
        this.currentRank = rank;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", Nickname: " + getNickname() + ", Current Rank: " + getCurrentRank();
    }
}
