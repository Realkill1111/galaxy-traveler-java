package com.rk.gxtv.galaxytravellerjava.game;

public class Case {
    private boolean hasCoin;
    private Ship marked;

    public Case(boolean coin){
        hasCoin=coin;
    }

    public void markIt(Ship ship){
        marked = ship;
    }


    @Override
    public String toString() {
        if (marked == null) return (hasCoin) ? "*" : " ";
        else return "-";
    }
}
