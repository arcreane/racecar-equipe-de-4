package com.company;

public class time extends Thread{

    public static boolean canPrint = true;

    public time(String name){
        super(name);
    }

    public void Print(int n) throws InterruptedException {
        if (canPrint){
            System.out.println(n);
            Thread.sleep(1000);
            for(int m  = 0; m<10; m++){
                System.out.println(" ");
            }
        }
    }
    public void run(){
        int n = 0;
        while (true){
            try {
                Print(n);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (n == 5){
                breaking.IsCarBroken();
            }
            n++;
        }
    }
}
