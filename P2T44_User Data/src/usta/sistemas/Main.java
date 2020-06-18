package usta.sistemas;

import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * Description: This program saves the ask information in a text file
 *
 * @author Jaider Pérez
 * @version 02/06/2020
 */
public class Main {
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
        System.out.println("Enter your name: ");
        String name = keyboard.nextLine();
        System.out.println("Enter your biography: ");
        String biography = keyboard.nextLine();
        System.out.println("Enter your email address: ");
        String email = keyboard.nextLine();
        System.out.println("Enter your cellphone number: ");
        String phone = keyboard.nextLine();

        boolean successfulText = saveData(name, biography, email, phone);
        if (successfulText) {
            System.out.println("Your information has been saved successfully ");
        }
    }

    /**
     * This function shows the menu
     */
    public static void menu() {
        System.out.println("╔═══════════════════════════════════════════════╗");
        System.out.println("╠-------------------Data User-------------------╣");
        System.out.println("║═══════════════════════════════════════════════║");
        System.out.println("║  Version: 1.0     Date: 01/06/2020            ║");
        System.out.println("║═══════════════════════════════════════════════║");
        System.out.println("║          Created by: Jaider Pérez             ║");
        System.out.println("╚═══════════════════════════════════════════════╝");
    }

    /**
     * This function saves the information that enters as a parameter in a text file
     *
     * @param name      String representing the user's name
     * @param biography String representing the user's biography
     * @param email     String representing the user's email
     * @param cellphone String representing the user's cellphone
     * @return boolean that represents the success of the process
     */
    public static boolean saveData(String name, String biography, String email, String cellphone) {
        boolean successfulText = false;
        try {
            PrintWriter createFile = new PrintWriter("C:/Users/JaiderPerez/Documents/Data.txt", StandardCharsets.UTF_8);
            createFile.println(name);
            createFile.println(biography);
            createFile.println(email);
            createFile.println(cellphone);
            createFile.close();
            successfulText = true;
        } catch (Exception e) {
            System.err.println("Error, could not save information in text file, the error is: ");
            e.printStackTrace();
        }
        return successfulText;
    }
}
