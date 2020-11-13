package com.company;

import java.util.Scanner;

public class Main {
    public static void end(){
        System.out.println("La partie est finie");
        System.out.println("Votre temps est de :");
        System.out.println(time.m + " minute(s)"+" et "+ time.n + " seconde(s)");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Entrez sur une touche pour quitter");
        Scanner scanner = new Scanner(System.in);
        scanner.next();
        System.exit(0);
    }

    public static void main(String[] args) {
        menu.menu();
        RaceLoop.init();
        time t1 = new time("Thread");
        t1.start();

    }
}

