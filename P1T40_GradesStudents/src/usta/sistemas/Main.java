package usta.sistemas;

import java.util.Scanner;

public class Main {
    /*
        Author: Jaider Pérez
        Date: 24/03/2020
        Description: this program calculate the semester end note
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double note1, note2, note3, note4, result;
        System.out.println("Software GRADE-STUDENTS: calculate the semester end note according with 4 notes");
        System.out.println("Enter the first note (20%)");
        note1 = keyboard.nextDouble();
        System.out.println("Enter the second note (25%)");
        note2 = keyboard.nextDouble();
        System.out.println("Enter the third note (25%)");
        note3 = keyboard.nextDouble();
        System.out.println("Enter the four note (30%)");
        note4 = keyboard.nextDouble();

        if (note1 >= 0 && note1 <= 5 || note2 >= 0 && note2 <= 5 || note3 >= 0 && note3 <= 5 || note4 >= 0 && note4 <= 5) {
            result = note1 * 0.20 + note2 * 0.25 + note3 * 0.25 + note4 * 0.30;
            System.out.println("The semester end note is: " + result);
        } else {
            System.out.println("Error, variables are out of range");
        }

    }
}
