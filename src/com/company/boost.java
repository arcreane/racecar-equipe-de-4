package com.company;

import java.time.Duration;
import java.time.Instant;
import java.util.Random;
import java.util.Scanner;

public class boost {
    public static void BoostCar(){
        Instant start = Instant.now();
        Random rd = new Random();
        Scanner scanner = new Scanner(System.in);
        String message = "vitesse";
        String melange = "";
        StringBuilder sb = new StringBuilder(message);
        for (int i = 0;i < message.length(); i++){
            int index= rd.nextInt(sb.length());
            melange += sb.charAt(index);
            sb.deleteCharAt(index);
        }
        System.out.println(melange);
        System.out.println("Réécris exactement le même message pour avoir un boost de vitesse pendant 5 cycles");
        String motJoueur = scanner.nextLine();
        if(!(motJoueur.equals(melange))){
            System.out.println("Tu t'es trompé quelque part. Tant pis pour toi");
        }
        else {
            System.out.println("Bien joué! Tu as un boost de 300% de ta vitesse pendant 5 cycles");
            RaceLoop.vitesse = RaceLoop.vitesse*4;
        }
        Instant end = Instant.now();
        Duration interval = Duration.between(start, end);
        time.n = (int) (time.n + interval.getSeconds());
        time.canPrint = true;
    }
}
