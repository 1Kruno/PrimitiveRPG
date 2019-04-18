/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygame;

import javax.swing.JOptionPane;

/**
 *
 * @author kruno
 */
public class Enemy {
    
    static int ehealth = 4;
    static int espeech = 2;
    static int espeed = 1;
    static int einvestigation = 1;
    static int eattack = 1;
    static int edefense = 2;
    
    static int enemyLevel = 1;
    
    public Enemy(){
        
    }
    
    public Enemy(int health, int speech, int speed, int investigation, int attack, int defense){
        this.ehealth = health;
        this.espeech = speech;
        this.espeed = speed;
        this.einvestigation = investigation;
        this.eattack = attack;
        this.edefense = defense;
    }

    public int getEHealth() {
        return ehealth;
    }

    public void setEHealth(int ehealth) {
        this.ehealth = ehealth;
    }

    public int getESpeech() {
        return espeech;
    }

    public void setESpeech(int espeech) {
        this.espeech = espeech;
    }

    public int getESpeed() {
        return espeed;
    }

    public void setESpeed(int espeed) {
        this.espeed = espeed;
    }

    public int getEInvestigation() {
        return einvestigation;
    }

    public void setEInvestigation(int einvestigation) {
        this.einvestigation = einvestigation;
    }

    public int getEAttack() {
        return eattack;
    }

    public void setEAttack(int eattack) {
        this.eattack = eattack;
    }

    public int getEDefense() {
        return edefense;
    }

    public void setEDefense(int edefense) {
        this.edefense = edefense;
    }
    
    public void setEnemyLevel(){
        String userLvlInput = JOptionPane.showInputDialog(null, "");
        int lvlInput = Integer.valueOf(userLvlInput);
        enemyLevel = lvlInput;
    }
    
    public void setEnemyLevelCharacteristics(){
        Enemy e = new Enemy();
        eattack=1;
        edefense=2;
        ehealth=4;
        einvestigation=1;
        espeech=2;
        espeed=1;
        if(enemyLevel == 2){
            e.setEAttack(eattack+2);
            e.setEDefense(edefense+4);
            e.setEHealth(ehealth+5);
            e.setEInvestigation(einvestigation+3);
            e.setESpeech(espeech+2);
            e.setESpeed(espeed+2);
        }
        else if(enemyLevel == 3){
            e.setEAttack(eattack+4);
            e.setEDefense(edefense+5);
            e.setEHealth(ehealth+8);
            e.setEInvestigation(einvestigation+5);
            e.setESpeech(espeech+4);
            e.setESpeed(espeed+4);
        }
        else{
            e.setEAttack(eattack);
            e.setEDefense(edefense);
            e.setEHealth(ehealth);
            e.setEInvestigation(einvestigation);
            e.setESpeech(espeech);
            e.setESpeed(espeed);
        }
    }
    
     public void saveEnemyStats(){
        Enemy e = new Enemy();
        e.setEAttack(eattack);
        e.setEDefense(edefense);
        e.setEHealth(ehealth);
        e.setEInvestigation(einvestigation);
        e.setESpeech(espeech);
        e.setESpeed(espeed);
    }
    
    public void loadEnemyStats(){
        Enemy e = new Enemy();
        e.getEAttack();
        e.getEDefense();
        e.getEHealth();
        e.getEInvestigation();
        e.getESpeech();
        e.getESpeed();
    }
    
     public String Estats(){
        return "Enemhy stats are: "+"\n"+"Health: "+getEHealth()+"\n"+"Attack: "+getEAttack()+"\n"+"Defense: "+getEDefense()+"\n"+"Speech: "+getESpeech()+"\n"+"Investigation: "+getEInvestigation()+"\n"+"Speed: "+getESpeed();
    }
    
}
