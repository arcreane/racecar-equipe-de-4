package com.company;

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

    public static void timer() throws InterruptedException {
        sleep(10000);
        System.out.println("TimeOut");
        n = n+10;
    }
    public void run(){
        n = 0;
        while (true){
            try {
                n++;
                Print(n);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (n == 5){
                try {
                    breaking.IsCarBroken();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
