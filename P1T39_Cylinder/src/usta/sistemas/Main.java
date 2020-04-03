package usta.sistemas;

import java.util.Scanner;

public class Main {
    /*
        Author: Jaider Pérez
        Date: 19/03/2020
        Description: This software calculate the volume of a cylinder
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double height, radius, pi=3.1416, volume;
        System.out.println("This software calculate the volume of a cylinder, input the radius and the height in cm: ");
        height = keyboard.nextInt();
        radius = keyboard.nextInt();
        volume = (pi * radius * radius * height);
        System.out.println("The volume of this cylinder is; " + volume + " cm");

    }
}
