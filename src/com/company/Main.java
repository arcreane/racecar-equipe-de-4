package com.company;

import org.fusesource.jansi.AnsiConsole;

import java.util.Scanner;

import static org.fusesource.jansi.Ansi.Color.*;
import static org.fusesource.jansi.Ansi.ansi;

public class Main {

    public static void main(String[] args) {
        AnsiConsole.systemUninstall();

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        char choix;
        char couleur;

        System.out.println(" | ---------------------------- | ");
        System.out.println(ansi().eraseScreen().fg(MAGENTA).a("    Bienvenu dans Race Car").reset());
        System.out.println(" | ---------------------------- | ");

        System.out.println(" Choisir entre 2 voiture ");
        System.out.println(" ");
        System.out.println(" Type 1, voiture rapide, mais 30% de chance de casse: ");
        System.out.println(" Type 2, voiture lente, mais 50% de chance d'obtenir un boost ");
        System.out.println(" ");

        choix = scanner.next().charAt(0);

        if (choix == '1') {
            System.out.println("Vous avez choisi la voiture rapide");
            System.out.println("Choisir une couleur");

            couleur = scanner.next().charAt(0);

            if (couleur == '3') {
                System.out.println(ansi().eraseScreen().fg(YELLOW).a("Vous avez choisi la voiture jaune" + choix).reset());
            }
            if (couleur == '4') {
                System.out.println(ansi().eraseScreen().fg(BLUE).a("Vous avez choisi la voiture bleu").reset());
            }
            if (couleur == '5') {
                System.out.println(ansi().eraseScreen().fg(BLACK).a("Vous avez choisi la voiture noire").reset());
            }}

        else{ // si l'utilisateur entre le chiffre 2
            System.out.println("Vous avez choisi la voiture lente");

            System.out.println("Choisir une couleur");
            couleur = scanner.next().charAt(0);

            if (couleur == '3') {
                System.out.println(ansi().eraseScreen().fg(YELLOW).a("Vous avez choisi la voiture jaune").reset());
            }
            if (couleur == '4') {
                System.out.println(ansi().eraseScreen().fg(BLUE).a("Vous avez choisi la voiture bleu").reset());
            }
            if (couleur == '5') {
                System.out.println(ansi().eraseScreen().fg(BLACK).a("Vous avez choisi la voiture noire").reset());
            }
        }
    }
}

