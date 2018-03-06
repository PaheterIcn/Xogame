/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author 5543
 */
public class Player {
    boolean playerIsAtive = false;
    private int score;
    String name = XOMenu.isNickname();
    
    
    public void setPlayerIsAtive(boolean playerIsAtive) {
        playerIsAtive = playerIsAtive;
    }
    public boolean isPlayerIsAtive() {
        return playerIsAtive;
    }
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    

    public String getName() {
        return name;
    }
}
