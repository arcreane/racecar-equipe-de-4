package com.company;

import java.util.Random;

public class RaceLoop {
    public static int RaceDistance = 10000;
    public static int nombreTours = 0;
    public static int vitesse;
    public static Random rdm = new Random();
    public static int t;

    /***
     * Initialise le paramètre de vitesse
     */
    public static void init(){
        if (menu.Car == "FAST"){
            vitesse = 280;
        }
        else if (menu.Car == "SLOW"){
            vitesse = 140;
        }
    }

    /***
     * La boucle de course, qui calcule la vitesse, la distance, les tours, et les évenements
     * @throws InterruptedException
     */
    public static void Race() throws InterruptedException {
        if (menu.Car == "FAST"){
            if(time.n%3 == 2){
                breaking.IsCarBroken();
            }
        }
        if (menu.Car == "SLOW"){
            if (time.n%1 == 0 && RaceLoop.vitesse == 140){
                int nombreAléatoire = rdm.nextInt(4);
                if (nombreAléatoire%4 == 0){
                    boost.BoostCar();
                    t = time.n;
                }
            }
            if (time.n == t+5){
                vitesse = 140;
                System.out.println("BOOST FINI");
            }
        }
        RaceDistance = RaceDistance - vitesse;
        if (RaceDistance <= 0){
            RaceDistance = 10000 + RaceDistance;
            nombreTours++;
        }
        if (nombreTours == 5){
            Main.end();
        }
    }
}
