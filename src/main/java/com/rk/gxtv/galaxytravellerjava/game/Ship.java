package com.rk.gxtv.galaxytravellerjava.game;

public class Ship {
    private int fuel;
    private int coins;

    public Ship(int difficulty){
        fuel=10-difficulty;
        coins=10-difficulty;
    }
}
