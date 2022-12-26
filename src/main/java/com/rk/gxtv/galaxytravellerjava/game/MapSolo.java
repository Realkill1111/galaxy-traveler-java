package com.rk.gxtv.galaxytravellerjava.game;

import java.util.ArrayList;
import java.util.Random;

public class MapSolo {
    private Case[][] plateau;

    private Ship player;

    private int marketMaxQuantity;
    private int marketCurrentQuantity = 0;

    public MapSolo(int size, int difficulty, String skin){
        plateau= new Case[size][size];
        marketMaxQuantity=size-difficulty;
        int marketspacing = (size+difficulty-2)/2;
        ArrayList<int[]> placedMarkets = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                int rand =(new Random()).nextInt(100);
                if(marketMaxQuantity>marketCurrentQuantity
                        && rand >=(90-marketMaxQuantity+marketCurrentQuantity)){
                    int k =0;
                    while (k<placedMarkets.size()
                            && Math.abs((i+j)-(placedMarkets.get(k)[0]+ placedMarkets.get(k)[1]))>marketspacing){
                        k++;
                    }
                    if (k>=placedMarkets.size()) {
                        plateau[i][j] = new CaseMarket();
                        marketCurrentQuantity++;
                        //System.out.println("added market " + marketCurrentQuantity + " : " + i + ", " + j);
                        placedMarkets.add(new int[]{i, j});
                    }else{
                        plateau[i][j] = new Case(false);
                    }
                } else if (rand<(90-5*difficulty)) plateau[i][j] = new Case(true);
                else plateau[i][j] = new Case(false);
            }
        }
        player = new Ship(difficulty, skin);
        player.setPosition(new int[]{size/2, size/2});
    }


    @Override
    public String toString() {
        int[] pos = player.getPosition();
        String rt = "";
        for (int i = 0; i < plateau.length; i++) rt += "____";
        rt += "\n";
        for (int i = 0; i < plateau.length; i++) {
            for (int j = 0; j < plateau.length; j++) {
                rt += (pos[0]==i && pos[1]==j) ? player.toString() : plateau[i][j].toString();
                rt+=((j<plateau.length-1) ? " | " : "");
            }
            rt +="\n";
        }
        for (int i = 0; i < plateau.length; i++) rt += "____";
        return rt;
    }
}
