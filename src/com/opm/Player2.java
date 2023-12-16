package com.opm;

public class Player2 extends Player1{
    private int health;
    private boolean armour;

    public Player2(String name, String weapon, int health, boolean armour){
        super(name, weapon, health);
        this.health = health;
        this.armour = armour;
    }

    @Override
    public void heal(){
        if(this.health == 0){
            System.out.println(getName()+" is dead heal not possible");
        }else {
            this.health = 300;
            System.out.println(getName()+" is healed now the current health is : "+this.health);
        }
    }

    public void setArmour(boolean armour) {
        this.armour = armour;
    }

    @Override
    public void damageByGun1(){
        if(armour){
            if(this.health < 20){
                this.health = 0;
            } else {
                this.health -= 20;
            }
            System.out.println("Armour on, got hit by Gun1 and health reduced by 20.");
            System.out.println("new health is : "+this.health);
            if(this.health == 0){
                System.out.println(getName()+" is dead");
            }
        } else {
            if(this.health < 30){
                this.health = 0;
            } else {
                this.health -= 30;
            }
            System.out.println("Armour off, got hit by Gun1 and health reduced by 30.");
            System.out.println("new health is : "+this.health);
            if(health == 0){
                System.out.println(getName()+" is dead");
            }
        }
    }


    @Override
    public void damageByGun2(){
        if(armour){
            if(this.health < 40){
                this.health = 0;
            } else {
                this.health -= 40;
            }
            System.out.println("Armour on, got hit by Gun2 and health reduced by 40.");
            System.out.println("new health is : "+this.health);
            if(health == 0){
                System.out.println(getName()+" is dead");
            }
        } else {
            if(this.health < 50){
                this.health = 0;
            } else {
                this.health -= 50;
            }
            System.out.println("Armour off, got hit by Gun2 and health reduced by 50.");
            System.out.println("new health is : "+this.health);
            if(health == 0){
                System.out.println(getName()+" is dead");
            }
        }
    }

}
