package com.company;

import java.util.TimerTask;

public class time extends Thread{
    public static int n;
    public static int m;
    public static boolean canPrint = true;

    public time(String name){
        super(name);
    }

    /***
     * @throws InterruptedException
     */
    public void Print() throws InterruptedException {
        if (canPrint){
            if (n>=60){
                m++;
                n = n-60;
            }
            System.out.println(m + " minute(s)"+" et "+ n + " seconde(s)");
            System.out.println(RaceLoop.RaceDistance + " mètres");
            System.out.println("Tour numéro : " + RaceLoop.nombreTours + "/5");
            sleep(1000);
            for(int m  = 0; m<10; m++){
                System.out.println(" ");
            }
        }
    }

    public void run(){
        n = 0;
        m = 0;
        while (true){
            try {
                n++;
                Print();
                RaceLoop.Race();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
