package usta.sistemas.classes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * Description: This class contains the functions of reading and writing text files
 *
 * @author Jaider Pérez
 * @version 18/06/2020
 */
public class FileValoresPecuniarios {

    private static final String FILE_PATH = "C:/Users/JaiderPerez/Documents/filesDirectory/fileValoresPecuniarios.txt";
    private static final File FILE_VP = new File(FILE_PATH);
    private static final String SEPARATOR = ";";

    /**
     * This function gets the information and saves it in a text file
     *
     * @param code    String representing the contents of the textCode text field on the form
     * @param name    String representing the contents of the textName text field on the form
     * @param faculty String representing the contents of the textFaculty text field on the form
     * @param value   String representing the contents of the textValue text field on the form
     * @return Boolean that represents the success of the process
     */
    public static boolean addValoresPecuniarios(String code, String name, String faculty, String value) {
        try {
            if (FILE_VP.exists()) {
                FileWriter dataFile = new FileWriter(FILE_VP, true);
                BufferedWriter writeData = new BufferedWriter(dataFile);
                writeData.write(code + SEPARATOR + name + SEPARATOR + faculty + SEPARATOR + value + "\n");
                writeData.close();
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * This function gets each of the data from the text file and saves it in a matrix
     *
     * @return Matrix containing the data generated in the text file
     */
    public static String[][] getValoresPecuniarios() {
        try {
            int totalLines = countFileLines();
            int count = 0;

            Scanner readFile = new Scanner(FILE_VP);

            String[][] matrix = new String[totalLines][4];
            while (readFile.hasNextLine()) {
                matrix[count++] = readFile.nextLine().split(SEPARATOR);
            }
            return matrix;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * This function counts the lines present in the text file
     *
     * @return Integer representing the number of lines
     */
    private static int countFileLines() {
        int linesText = 0;
        try {
            if (FILE_VP.exists()) {
                Scanner readFile = new Scanner(FILE_VP);
                while (readFile.hasNextLine()) {
                    linesText++;
                    readFile.nextLine();
                }
                readFile.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return linesText;
    }

}

