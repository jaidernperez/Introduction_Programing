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
public class FileDataStudent {

    private static final String FILE_PATH = "C:/Users/JaiderPerez/Documents/filesDirectory/fileStudent.txt";
    private static final File FILE_STUDENT = new File(FILE_PATH);
    private static final String SEPARATOR = ";";

    /**
     * This function gets the information and saves it in a text file
     *
     * @param name     String representing the contents of the textName text field on the form
     * @param lastName String representing the contents of the textLastName text field on the form
     * @param faculty  String representing the contents of the textFaculty text field on the form
     * @return Boolean that represents the success of the process
     */
    public static boolean addStudent(String name, String lastName, String faculty) {
        try {
            if (FILE_STUDENT.exists()) {
                FileWriter dataFile = new FileWriter(FILE_STUDENT, true);
                BufferedWriter writeData = new BufferedWriter(dataFile);
                writeData.write(name + SEPARATOR + lastName + SEPARATOR + faculty + "\n");
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
    public static String[][] getAllData() {
        try {
            int totalLines = countFileLines();
            int count = 0;

            Scanner readFile = new Scanner(FILE_STUDENT);

            String[][] matrix = new String[totalLines][3];
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
            if (FILE_STUDENT.exists()) {
                Scanner readFile = new Scanner(FILE_STUDENT);
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