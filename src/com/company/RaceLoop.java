package com.company;

public class RaceLoop {
    public static int RaceDistance = 10000;
    public static int nombreTours = 0;
    public static int vitesse;

    public static void init(){
        if (menu.Car == "FAST"){
            vitesse = 28;
        }
        else if (menu.Car == "SLOW"){
            vitesse = 14;
        }
    }
    public static void Race() throws InterruptedException {
        if (menu.Car == "FAST"){
            if(time.n%3 == 2){
                breaking.IsCarBroken();
            }
        }
        RaceDistance = RaceDistance - vitesse;
        if (RaceDistance <= 0){
            RaceDistance = 10000;
            nombreTours++;
        }
        if (nombreTours == 5){
            Main.end();
        }
    }
}
