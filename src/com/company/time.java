package com.company;

public class time extends Thread{
    public static int n;
    public static int m;
    public static boolean canPrint = true;

    public time(String name){
        super(name);
    }

    /***
     * Le thread qui permet de créer le temps
     */
    public void run(){
        n = 0;
        m = 0;
        while (true){
            try {
                n++;
                Display.Print();
                RaceLoop.Race();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
