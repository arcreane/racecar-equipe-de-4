package com.company;
public class Main {

    public static void main(String[] args) {
        menu.menu();
        RaceLoop.init();
        time t1 = new time("Thread");
        t1.start();
    }
}

