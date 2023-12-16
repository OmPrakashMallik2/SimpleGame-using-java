package com.opm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player1 player1 = new Player1("OPM", "M4", 200);
//        System.out.println(player1.getName());
//        System.out.println(player1.getWeapon());
//        System.out.println(player1.getHealth());

//        player1.damageByGun1();
//        player1.damageByGun2();
//        player1.damageByGun1();
//        player1.damageByGun2();
//        player1.damageByGun1();
//        player1.damageByGun2();

        Player2 player2 = new Player2("OPM2", "AKM", 250,false);
        System.out.println(player2.getName());
        System.out.println(player2.getWeapon());
        System.out.println(player2.getHealth());
        player2.damageByGun1();
        player2.damageByGun2();
        player2.setArmour(false);
        player2.damageByGun2();
        player2.damageByGun2();
        player2.damageByGun2();
        player2.damageByGun1();
        player2.heal();
    }
}