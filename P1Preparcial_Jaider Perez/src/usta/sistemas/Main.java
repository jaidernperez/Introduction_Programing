package usta.sistemas;

import java.util.Scanner;

public class Main {
    /*
        Author: Jaider Pérez
        Date: 15/03/2020
        Description: This software help determine if you have coronavirus COVID-19
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int cough, painBody, breathe, fever, age;

        System.out.println("-------------------------------------------------------------");
        System.out.println("                   Dr.Coronavirus                            ");
        System.out.println("-------------------------------------------------------------");
        System.out.println("This software help determine if you have coronavirus COVID-19");
        System.out.println("-------------------------------------------------------------");
        System.out.println("Created by: Jaider Pérez");
        System.out.println("-------------------------------------------------------------");

        System.out.println("Do you have a dry cough? enter 1 if true or 0 if false");
        cough = keyboard.nextInt();
        System.out.println("Do you have body pain? enter 1 if true or 0 if false");
        painBody = keyboard.nextInt();
        System.out.println("Do you have trouble breathing? enter 1 if true or 0 if false");
        breathe = keyboard.nextInt();
        System.out.println("what is your body temperature? enter the value in degrees celsius");
        fever = keyboard.nextInt();
        System.out.println("How old are you? enter the value in years");
        age = keyboard.nextInt();


        if (cough == 1 && painBody == 1 && breathe == 1 && fever > 38) {
            System.out.println("you are a possible case of coronavirus, please stay isolated and follow the health instructions");
            if (age > 1 && age < 120) {
                if (age >= 60) {
                    System.out.println("You should immediately contact your EPS");
                }
            } else {
                System.out.println("The age is out in the range");
            }
        } else {
            if (cough == 0 || painBody == 0 || breathe == 0 || fever < 38) {
                System.out.println("May not be present coronavirus in your body, please stay home");
            } else {
                System.out.println("Error, enter the number in the established range");
            }
        }
    }
}
