package com.rk.gxtv.galaxytravellerjava.game;

public class Ship {
    private int fuel;
    private int coins;
    private int[] position;

    private String skin;
    public Ship(int difficulty, String skin){
        fuel=10-difficulty;
        coins=10-difficulty;
        this.skin= skin;
    }

    public void setPosition(int[] position) {
        this.position = position;
    }
    public int[] getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return skin;
    }
}
