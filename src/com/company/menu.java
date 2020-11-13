package com.company;
import org.fusesource.jansi.AnsiConsole;
import static org.fusesource.jansi.Ansi.Color.*;
import static org.fusesource.jansi.Ansi.ansi;

public class menu {
    public static String Car;

    /**
     * Affiche le menu, ou l'utilisateur peut choisir une voiture
     */
    public static void menu(){
        AnsiConsole.systemUninstall();

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        char choix;

        System.out.println(" | ---------------------------- | ");
        System.out.println(ansi().eraseScreen().fg(MAGENTA).a("    Bienvenue dans Race Car").reset());
        System.out.println(" | ---------------------------- | ");

        System.out.println(" Choisissez votre voiture ");
        System.out.println(" ");
        System.out.println("(1) Voiture rapide, mais 35% de chance de casse: ");
        System.out.println("(2) Voiture lente, mais 25% de chance d'obtenir un boost ");
        System.out.println(" ");

        choix = scanner.next().charAt(0);

        if (choix == '1') { // Si l'utilisateur entre le chiffre 1
            System.out.println("Vous avez choisi la voiture rapide");
            Car = "FAST";
        }

        else if (choix == '2'){ // si l'utilisateur entre le chiffre 2
            System.out.println("Vous avez choisi la voiture lente");
            Car = "SLOW";
        }
        else{ // Si ce qui est entré est incorrect
            System.out.println("Erreur, veuillez réessayer");
            menu();
        }
        couleur();
    }

    /**
     * Permet à l'utilisateur de choisir une couleur
     */
    private static void couleur(){
        char couleur;
        System.out.println("Choisissez une couleur : (1) Jaune , (2) Bleu , (3) Noire ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        couleur = scanner.next().charAt(0);
            if (couleur == '1') {//Si l'utilisateur entre le chiffre 1
                System.out.println(ansi().eraseScreen().fg(YELLOW).a("Vous avez choisi la voiture jaune").reset());

            }
            if (couleur == '2') {//Si l'utilisateur entre le chiffre 2
                System.out.println(ansi().eraseScreen().fg(BLUE).a("Vous avez choisi la voiture bleu").reset());
            }
            if (couleur == '3') {//Si l'utilisateur entre le chiffre 3
                System.out.println(ansi().eraseScreen().fg(BLACK).a("Vous avez choisi la voiture noire").reset());
            }
            else{//Si l'utilisateur se trompe
                System.out.println("Veuillez entrer une commande valide");
                couleur();
            }
        }
    }
