package com.opm;

public class Player1 {
    private String name;
    private String weapon;
    private int health;

    public Player1 (String name, String weapon, int health){
        this.name = name;
        this.weapon = weapon;
        if(health < 0 || health > 500){
            this.health = 500;
        }else this.health = health;
    }

    public void heal(){
        if(this.health == 0){
            System.out.println(getName()+" is dead heal not possible");
        }else {
            this.health = 300;
            System.out.println(getName()+" is healed now the current health is : "+getHealth());
        }
    }


    public void damageByGun1(){
        if(health < 30){
            this.health = 0;
        }else {
            this.health -= 30;
        }
        System.out.println("got hit by Gun1 and health reduced by 30.");
        System.out.println("new health is : " + this.health);

        if(health == 0){
            System.out.println(getName()+" is dead.");
        }
    }

    public void damageByGun2(){
        if(health < 50){
            this.health = 0;
        }else {
            this.health -= 50;
        }
        System.out.println("got hit by Gun2 and health reduced by 50.");
        System.out.println("new health is : "+this.health);

        if(health == 0){
            System.out.println(getName()+" is dead.");
        }
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}
