package com.rk.gxtv.galaxytravellerjava.game;

public class CaseMarket extends Case{
    private float price;
    private int fuelQuantity;

    public CaseMarket() {
        super(false);
    }

    public void buy(int quantity){
        fuelQuantity -= quantity;
    }

    @Override
    public String toString() {
        return " $ ";
    }
}
