package com.company;
import java.util.Random;

public class breaking {
    public static void IsCarBroken() throws InterruptedException {
        Random rand = new Random();
        int breaking = rand.nextInt(35);
        for (int n = 1; n <= 35; n++) {
            if (n == breaking) {
                time.canPrint = false;
                System.out.println("Oh oh, quelque chose ne va pas...");
                WhatPartIsBroken();
            }
        }
    }
    private static void WhatPartIsBroken() throws InterruptedException {
        Random rand = new Random();
        int Part = rand.nextInt(5);
        if(Part == 0){
            System.out.println("De la fumée sort du moteur");
            time.timer();
        }
        if(Part == 1){
            System.out.println("La roue avant gauche a un problème");
            time.timer();
        }
        if(Part == 2){
            System.out.println("La roue avant droite a un problème");
            time.timer();
        }
        if(Part == 3){
            System.out.println("La roue arrière gauche a un problème");
            time.timer();
        }
        if(Part == 4){
            System.out.println("La roue arrière droite a un problème");
            time.timer();
        }
        time.canPrint = true;
    }

}
