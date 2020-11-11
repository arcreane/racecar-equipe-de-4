package com.company;

public class time extends Thread{
    public time(String name){
        super(name);
    }
    public void run(){
        int n = 0;
        while (true){
            System.out.println(n);
            n++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
