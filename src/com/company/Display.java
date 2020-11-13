package com.company;

public class Display {
    /***
     * @throws InterruptedException
     */
    public static void Print() throws InterruptedException {
        if (time.canPrint){
            if (time.n>=60){
                time.m++;
                time.n = time.n-60;
            }
            System.out.println(time.m + " minute(s)"+" et "+ time.n + " seconde(s)");
            System.out.println(RaceLoop.RaceDistance + " mètres");
            System.out.println("Tour numéro : " + RaceLoop.nombreTours + "/5");
            time.sleep(1000);
            for(int m  = 0; m<10; m++){
                System.out.println(" ");
            }
        }
    }
}
