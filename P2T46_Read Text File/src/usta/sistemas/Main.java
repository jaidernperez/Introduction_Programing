package usta.sistemas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * Description: This program reads, adds new names and deletes the contents of a names file
 *
 * @author Jaider Pérez
 * @version 02/06/2020
 */
public class Main {
    public static Scanner keyboard = new Scanner(System.in);
    public static String FILEPATH = "C:/Users/JaiderPerez/Documents/filesDirectory/fileNames.txt";

    public static void main(String[] args) throws FileNotFoundException {
        menu();

        int option = getOption();
        while (option != 0) {
            switch (option) {
                case 1 -> showNames();
                case 2 -> enterNewNames();
                case 3 -> deleteInformation();
                default -> System.err.println("Error, option no valid! ");
            }
            option = getOption();
        }
    }

    /**
     * This function shows the menu
     */
    public static void menu() {
        System.out.println("╔════════════════════════════════════════════════╗");
        System.out.println("╠-------------------Read Names-------------------╣");
        System.out.println("║════════════════════════════════════════════════║");
        System.out.println("║  Version: 1.0     Date: 02/06/2020             ║");
        System.out.println("║════════════════════════════════════════════════║");
        System.out.println("║           Created by: Jaider Pérez             ║");
        System.out.println("╚════════════════════════════════════════════════╝");
    }

    /**
     * This function displays the options menu and asks to enter an option (this must be in a range of 0 to 3)
     *
     * @return Integer representing the entered option
     */
    public static int getOption() {
        System.out.println("╔════════════════════════════════════════════════╗");
        System.out.println("╠---------------------options--------------------╣");
        System.out.println("║   1. Show the names.                           ║");
        System.out.println("║   2. Enter new names.                          ║");
        System.out.println("║   3. Delete the names.                         ║");
        System.out.println("║   0. Exit of this process.                     ║");
        System.out.println("╚════════════════════════════════════════════════╝");
        int option = 0;
        try {
            do {
                System.out.println("Enter the option that do you want realize \n" +
                        "(this should be in a range of 0 to 3 ): ");
                option = keyboard.nextInt();
            } while (option < 0 || option > 3);
        } catch (Exception e) {
            System.out.println("There was an error, this is: ");
            e.printStackTrace();
        }
        return option;
    }

    /**
     * This function reads the file that contains the names
     *
     * @throws FileNotFoundException Signals that an attempt to open the file denoted by a specified pathname has failed
     */
    public static void showNames() throws FileNotFoundException {
        Scanner readFile = new Scanner(new File(FILEPATH));
        try {
            while (readFile.hasNextLine()) {
                System.out.println(readFile.nextLine());
            }
        } catch (Exception e) {
            System.out.println("There was an error, this is: ");
            e.printStackTrace();
        }
    }

    /**
     * This function reads the content of the file and saves it in an Array
     *
     * @return Array containing the content of the file
     * @throws FileNotFoundException Signals that an attempt to open the file denoted by a specified pathname has failed
     */
    public static String[] getNames() throws FileNotFoundException {
        Scanner readFile = new Scanner(new File(FILEPATH));
        int totalLines = 0, i = 0;

        while (readFile.hasNextLine()) {
            readFile.nextLine();
            totalLines++;
        }

        readFile = new Scanner(new File(FILEPATH));
        String[] names = new String[totalLines];
        try {
            while (readFile.hasNextLine()) {
                names[i++] = readFile.nextLine();
            }
        } catch (Exception e) {
            System.out.println("There was an error, this is: ");
            e.printStackTrace();
        }
        return names;
    }

    /**
     * This function replaces the file with a new empty one
     */
    public static void deleteInformation() {
        try {
            PrintWriter myFile = new PrintWriter(FILEPATH, StandardCharsets.UTF_8);
            myFile.println("");
            myFile.close();
            System.out.println("The information has deleted successfully ");
        } catch (Exception e) {
            System.out.println("The software has finished because: ");
            e.printStackTrace();
        }
    }

    /**
     * This function adds new names or lines to the file
     */
    public static void enterNewNames() {
        Scanner inputKeyboard = new Scanner(System.in);
        try {
            String[] names = getNames();
            PrintWriter myFile = new PrintWriter(FILEPATH, StandardCharsets.UTF_8);

            System.out.println("Enter the name that do you want add: ");
            myFile.println(inputKeyboard.nextLine());

            for (String name : names) {
                myFile.println(name);
            }
            myFile.close();
        } catch (Exception e) {
            System.out.println("There was an error, this is: ");
            e.printStackTrace();
        }
    }
}
