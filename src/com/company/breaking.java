package com.company;
import java.time.Duration;
import java.time.Instant;
import java.util.Random;
import java.util.Scanner;

public class breaking {
    /***
     * Teste si la Voiture est cassée, il y a 35% de chance qu'elle le soit
     * Si elle est cassée, elle appelle la fonction WhatPartIsBroken;
     */
    public static void IsCarBroken() throws InterruptedException {
        Random rand = new Random();
        int breaking = rand.nextInt(100);
        for (int n = 1; n <= 35; n++) {
            if (n == breaking) {
                time.canPrint = false;
                System.out.println("Oh oh, quelque chose ne va pas...");
                rand = new Random();
                int Part = rand.nextInt(5);
                WhatPartIsBroken(Part);
            }
        }
    }

    /***
     * @param inputString La variable de type String a modifier
     * @return la variable mélangée
     */
    public static String StringRandom(String inputString) {
        Random random = new Random();
        //Convert your string into a simple char array:
        char a[] = inputString.toCharArray();

        //Scramble the letters using the standard Fisher-Yates shuffle,
        for( int i=0 ; i<a.length ; i++ )
        {
            int j = random.nextInt(a.length);
            //Swap letters
            char temp = a[i]; a[i] = a[j];  a[j] = temp;
        }
        String b = new String(a);
        b = b.substring(5);
        return b;
    }

    /***
     * @param Part La partie cassée de la voiture
     * @throws InterruptedException
     */
    private static void WhatPartIsBroken(int Part) throws InterruptedException {
        Instant start = Instant.now();
        if(Part == 0){
            System.out.println("De la fumée sort du moteur");
            String InputString = breaking.StringRandom("0123456789");
            System.out.println("Recopiez cette suite de chiffres");
            System.out.println(InputString);
            Thread.sleep(2000);
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            if (input.equals(InputString)){
                System.out.println("Le moteur est réparé");
            }

        }
        if(Part == 1){
            System.out.println("La roue avant gauche a un problème");
            System.out.println("Sortez de la voiture ('Q')");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            if(input.equals("Q")){
                System.out.println("Réparez la roue ('R')");
                scanner = new Scanner(System.in);
                input = scanner.next();
                if (input.equals("R")){
                    Thread.sleep(1000);
                    System.out.println("La roue est réparée");
                    Thread.sleep(1000);
                }
                else{
                    System.out.println("ERREUR");
                    WhatPartIsBroken(Part);
                }
            }
            else{
                System.out.println("ERREUR");
                WhatPartIsBroken(Part);
            }
        }

        if(Part == 2){
            System.out.println("La roue avant droite a un problème");
            System.out.println("Sortez de la voiture ('Q')");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            if(input.equals("Q")){
                System.out.println("Allez à droite (D)");
                scanner = new Scanner(System.in);
                input = scanner.next();
                if (input.equals("D")){
                    Thread.sleep(1000);
                    System.out.println("Réparez la roue ('R')");
                    scanner = new Scanner(System.in);
                    input = scanner.next();
                    if (input.equals("R")){
                        Thread.sleep(1000);
                        System.out.println("La roue est réparée");
                        Thread.sleep(1000);
                    }
                }
                else{
                    System.out.println("ERREUR");
                    WhatPartIsBroken(Part);
                }
            }
            else{
                System.out.println("ERREUR");
                WhatPartIsBroken(Part);
            }
        }
        if(Part == 3){
            System.out.println("La roue arrière gauche a un problème");
            System.out.println("Sortez de la voiture ('Q')");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            if(input.equals("Q")){
                System.out.println("Allez vers l'arrière de la voiture (S)");
                scanner = new Scanner(System.in);
                input = scanner.next();
                if (input.equals("S")){
                    Thread.sleep(1000);
                    System.out.println("Réparez la roue ('R')");
                    scanner = new Scanner(System.in);
                    input = scanner.next();
                    if (input.equals("R")){
                        Thread.sleep(1000);
                        System.out.println("La roue est réparée");
                        Thread.sleep(1000);
                    }
                }
                else{
                    System.out.println("ERREUR");
                    WhatPartIsBroken(Part);
                }
            }
            else{
                System.out.println("ERREUR");
                WhatPartIsBroken(Part);
            }
        }
        if(Part == 4){
            System.out.println("La roue arrière droite a un problème");
            System.out.println("Sortez de la voiture ('Q')");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            if(input.equals("Q")){
                System.out.println("Allez à droite (D)");
                scanner = new Scanner(System.in);
                input = scanner.next();
                if (input.equals("D")){
                    System.out.println("Allez vers l'arrière de la voiture (S)");
                    scanner = new Scanner(System.in);
                    input = scanner.next();
                    if (input.equals("S")) {
                        Thread.sleep(1000);
                        System.out.println("Réparez la roue ('R')");
                        scanner = new Scanner(System.in);
                        input = scanner.next();
                        if (input.equals("R")) {
                            Thread.sleep(1000);
                            System.out.println("La roue est réparée");
                            Thread.sleep(1000);
                        }
                    }
                }
                else{
                    System.out.println("ERREUR");
                    WhatPartIsBroken(Part);
                }
            }
            else{
                System.out.println("ERREUR");
                WhatPartIsBroken(Part);
            }
        }
        Instant end = Instant.now();
        Duration interval = Duration.between(start, end);
        time.n = (int) (time.n + interval.getSeconds());
        time.canPrint = true;
    }

}
