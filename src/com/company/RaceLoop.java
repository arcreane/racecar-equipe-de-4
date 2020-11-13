package com.company;

public class RaceLoop {
    public static int RaceDistance = 20000;
    public static boolean FastCar;
    private static int vitesse;

    public static void init(){
        if (FastCar = true){
            vitesse = 100;
        }
        else{
            vitesse = 50;
        }
    }
    public static void Race() throws InterruptedException {
        if (FastCar){
            if(time.n%3 == 2){
                breaking.IsCarBroken();
            }
        }
        RaceDistance = RaceDistance - vitesse;
    }
}
