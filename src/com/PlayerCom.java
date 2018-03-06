/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.util.Random;

/**
 *
 * @author 5543
 */
public class PlayerCom {
    private Random random;
    int score;
    int x;
    String name = "COMPUTER";
    boolean playerIsAtiveCom = false;
    
    
    public void setPlayerIsAtiveCom(boolean playerIsAtiveCom) {
        playerIsAtiveCom = playerIsAtiveCom;
    }
    public boolean isPlayerIsAtiveCom() {
        return playerIsAtiveCom;
    }
    
    
    int question() {
        random = new Random();
        x =  random.nextInt(9);
        return x;
    }


    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
}
