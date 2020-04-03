package usta.sistemas;

import java.util.Scanner;

public class Main {
    /*
        Author: Jaider Pérez
        Date: 26/03/2020
        Description: This program determinate thi time it takes a person to get from one city to another by bicycle
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int speed, distance;
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("This program determinate the time of arrived of a person transported by bicycle");
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Enter the distance between the cities in Km");
        distance = keyboard.nextInt();
        System.out.println("Enter the speed in the travel in km/h");
        speed = keyboard.nextInt();
        System.out.println("The time of the travel in hours is: " + arrived(speed,distance)+"h");
    }
    public static double arrived(double velocity, double route){
        double time = route / velocity;
        return time;
    }
}
