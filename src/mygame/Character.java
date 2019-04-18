/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame;

/**
 *
 * @author kruno
 */


public class Character {
   // int statsCounter = 10;
    static int xhealth = 1;
    static int xspeech = 1;
    static int xspeed = 1;
    static int xinvestigation = 1;
    static int xattack = 1;
    static int xdefense = 1;
    
    public Character(){
        
    }
    
    public Character(int health, int speech, int speed, int investigation, int attack, int defense){
        this.xhealth = health;
        this.xspeech = speech;
        this.xspeed = speed;
        this.xinvestigation = investigation;
        this.xattack = attack;
        this.xdefense = defense;
    }

    public int getHealth() {
        return xhealth;
    }

    public void setHealth(int health) {
        this.xhealth = health;
    }

    public int getSpeech() {
        return xspeech;
    }

    public void setSpeech(int speech) {
        this.xspeech = speech;
    }

    public int getSpeed() {
        return xspeed;
    }

    public void setSpeed(int speed) {
        this.xspeed = speed;
    }

    public int getInvestigation() {
        return xinvestigation;
    }

    public void setInvestigation(int investigation) {
        this.xinvestigation = investigation;
    }

    public int getAttack() {
        return xattack;
    }

    public void setAttack(int attack) {
        this.xattack = attack;
    }

    public int getDefense() {
        return xdefense;
    }

    public void setDefense(int defense) {
        this.xdefense = defense;
    }
    
    public String stats(){
        return "Character stats are: "+"\n"+"Health: "+getHealth()+"\n"+"Attack: "+getAttack()+"\n"+"Defense: "+getDefense()+"\n"+"Speech: "+getSpeech()+"\n"+"Investigation: "+getInvestigation()+"\n"+"Speed: "+getSpeed();
    }
    
    public void saveCharacterStats(){
        Character c = new Character();
        c.setAttack(xattack);
        c.setDefense(xdefense);
        c.setHealth(xhealth);
        c.setInvestigation(xinvestigation);
        c.setSpeech(xspeech);
        c.setSpeed(xspeed);
    }
    
    public void loadCharacterStats(){
        Character c = new Character();
        c.getAttack();
        c.getDefense();
        c.getHealth();
        c.getInvestigation();
        c.getSpeech();
        c.getSpeed();
    }
}
