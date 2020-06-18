package usta.sistemas;

import java.io.File;
import java.util.Scanner;

/**
 * Description: This program read the content text file
 *
 * @author Jaider Pérez
 * @version 01/06/2020
 */
public class Main {

    public static void main(String[] args) {
        try {
            Scanner readFile = new Scanner(new File("C:/Users/JaiderPerez/Documents/test.txt"));
            while (readFile.hasNextLine()) {
                System.out.println(readFile.nextLine());
            }
            readFile.close();
        } catch (Exception e) {
            System.out.println("The software has finished because: ");
            e.printStackTrace();
        }
    }
}
