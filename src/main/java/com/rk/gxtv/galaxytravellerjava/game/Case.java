package com.rk.gxtv.galaxytravellerjava.game;

public class Case {
    private boolean hasCoin;

    public Case(boolean coin){
        hasCoin=coin;
    }

    @Override
    public String toString() {
        return (hasCoin) ? " . " : "   ";
    }
}
