package com.rk.gxtv.galaxytravellerjava.game;

import java.util.Random;

public class Map {
    private Case[][] plateau;

    private int[][] positionPlayers;

    private int marketMaxQuantity;
    private int marketCurrentQuantity = 0;

    public Map(int size, int difficulty){
        plateau= new Case[size][size];
        marketMaxQuantity=size-difficulty;
        int marketspacing = (size+difficulty)/2;
        int[] lastMarket= {-size, 0};
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                int rand =(new Random()).nextInt(100);
                if(marketMaxQuantity>marketCurrentQuantity
                        && rand >=(90-marketMaxQuantity+marketCurrentQuantity)
                        && Math.abs((i+j)-(lastMarket[0]+ lastMarket[1]))>marketspacing) {
                    plateau[i][j] = new CaseMarket();
                    marketCurrentQuantity++;
                    System.out.println("added market : "+marketCurrentQuantity);
                    lastMarket = new int[]{i, j};
                } else if (rand<(90-5*difficulty)) plateau[i][j] = new Case(true);
                else plateau[i][j] = new Case(false);
            }
        }

    }


    @Override
    public String toString() {
        String rt = "";
        for (int i = 0; i < plateau.length; i++) rt += " _ ";
        rt += "\n";
        for (int i = 0; i < plateau.length; i++) {
            for (int j = 0; j < plateau.length; j++) {
                rt += plateau[i][j].toString() + ((j<=plateau.length-1) ? "|" : "");
            }
            rt +="\n";
        }
        for (int i = 0; i < plateau.length; i++) rt += " _ ";
        return rt;
    }
}
