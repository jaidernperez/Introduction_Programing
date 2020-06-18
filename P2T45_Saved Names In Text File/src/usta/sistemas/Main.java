package usta.sistemas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

/**
 * Description: This program saves the names of n person in a text file (the names must have a minimum of five words)
 *
 * @author Jaider Pérez
 * @version 02/06/2020
 */
public class Main {
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        menu();
        String number;
        int numberOfNames = 0;
        try {
            do {
                System.out.println("Enter the number of persons to save them names (the value can not negative): ");
                number = reader.readLine();
                numberOfNames = Integer.parseInt(number);
            } while (numberOfNames < 0);
        } catch (IOException e) {
            System.out.println("The software has finished because: ");
            e.printStackTrace();
        }

        String[] names = getNames(numberOfNames);
        boolean successfulProcess = saveNamesInTextFile(names);
        if (successfulProcess) {
            System.out.println("The process has finished successfully");
        }
    }

    /**
     * This function shows the menu
     */
    public static void menu() {
        System.out.println("╔═════════════════════════════════════════════════╗");
        System.out.println("╠-------------------Saved Names-------------------╣");
        System.out.println("║═════════════════════════════════════════════════║");
        System.out.println("║  Version: 1.0     Date: 02/06/2020              ║");
        System.out.println("║═════════════════════════════════════════════════║");
        System.out.println("║           Created by: Jaider Pérez              ║");
        System.out.println("╚═════════════════════════════════════════════════╝");
    }

    /**
     * This function gets the names of the people and saves them in an Array
     *
     * @param numberOfNames Integer representing total names
     * @return Array containing the names of the people
     * @throws IOException BufferedReader exception
     */
    public static String[] getNames(int numberOfNames) throws IOException {
        String[] names = new String[numberOfNames];
        String name;
        for (int i = 0; i < numberOfNames; i++) {
            System.out.println("Enter the name of the person " + (i + 1) + ":");
            name = reader.readLine();
            while (name.length() < 5) {
                System.out.println("re-enter name, This should have a minimum of five letters: ");
                name = reader.readLine();
            }
            names[i] = name;
        }
        return names;
    }

    /**
     * This function saves the information contained in the Array names in a text file
     *
     * @param names Array containing the names of the people
     * @return boolean that represents the success of the process
     */
    public static boolean saveNamesInTextFile(String[] names) {
        boolean successfulProcess = false;
        try {
            PrintWriter fileNames = new PrintWriter("C:/Users/JaiderPerez/Documents/fileNames.txt", StandardCharsets.UTF_8);
            for (String name : names) {
                fileNames.println(name);
            }
            fileNames.close();
            successfulProcess = true;
        } catch (Exception e) {
            System.err.println("Error, the process has not completed, tis error is: ");
            e.printStackTrace();
        }
        return successfulProcess;
    }
}
