package usta.sistemas;

import java.util.Scanner;

public class Main {
    /*
        Author: Jaider Pérez
        Date: 30/03/2020
        Description: This program ask, validates and performs operations on a name
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name, changedName = "";
        int lengthWords;
        System.out.println("╔======================================╗");
        System.out.println("║ StringSoft 2020                      ║");
        System.out.println("║ Versión 1.0                          ║");
        System.out.println("║ Creado por: Jaider Nicolás Pérez     ║");
        System.out.println("╚======================================╝");

        System.out.println("Enter your full name: ");
        name = keyboard.nextLine();
        lengthWords = name.length();
        if (lengthWords >= 6) {
            if (lengthWords <= 20) {
                changedName = changedName + name;
                changedName = changedName.toLowerCase();
                changedName = changedName.replace("a", "@").replace("e", "3").replace("i", "1").replace("o", "0");
                System.out.println(changedName);
                System.out.println(name);
            } else {
                System.out.println("Error, the name is very long, you must enter your full name (name and last names)");
            }
        } else {
            System.out.println("Error, the name is very short, you must enter your full name (name and last names)");
        }

    }
}
