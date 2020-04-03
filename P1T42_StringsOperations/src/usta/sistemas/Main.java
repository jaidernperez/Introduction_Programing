package usta.sistemas;

import java.util.Scanner;

public class Main {
    /*
        Author: Jaider Pérez
        Date: 26/03/2020
        Description: This program realize some operations in a chain
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        System.out.println("Enter your name");
        name = keyboard.nextLine();

        if (name.contains("gomez")) {
            System.out.println("The last name gomez is in the string");
        }else {
            System.out.println("The last name gomez is not in the string");
        }

        System.out.println(name.toUpperCase());
        name= setCharAt(name,2, "@");
        System.out.println(name);
        name = name.substring(7,12);
        System.out.println(name);

    }
    //This function  replaces the character in the determined position with another character
    public static String setCharAt(String chain, int index, String replace) {
        int length = chain.length();
        String data = "";
        for (int i = 0; i < length; i++) {
            if (i == index) {
                data = data + replace;
            } else {
                data = data + chain.charAt(i);
            }
        }
        return data;
    }
}
