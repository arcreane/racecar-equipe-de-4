package com.company;

import java.util.Random;
import java.util.stream.LongStream;

public class time extends Thread{
    public static int n;
    public static boolean canPrint = true;

    public time(String name){
        super(name);
    }

    public void Print(int n) throws InterruptedException {
        if (canPrint){
            System.out.println(n);
            sleep(1000);
            for(int m  = 0; m<10; m++){
                System.out.println(" ");
            }
        }
    }

    public void run(){
        n = 0;
        while (true){
            try {
                n++;
                Print(n);
                breaking.IsCarBroken();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
