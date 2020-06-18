package usta.sistemas;

import java.io.*;
import java.util.Objects;

/**
 * Description: This program contains the methods of the File class
 *
 * @author Jaider Pérez
 * @version 04/06/2020
 */
public class Main {
    public static String FILEPATH = "C:/Users/JaiderPerez/Documents/filesDirectory/fileNames.txt";

    public static void main(String[] args) throws IOException {
        File myFile = new File(FILEPATH);
        System.out.println("file.exists(): " + myFile.exists());
        // To find out if the directory exists, return true or false
        System.out.println("file.isDirectory(): " + myFile.isDirectory());
        // To know the modification date
        System.out.println("file.lastModified(): " + myFile.lastModified());
        // To know the file name
        System.out.println("file.getName(): " + myFile.getName());
        // To find out the file path
        System.out.println("file.getPath(): " + myFile.getPath());
        // To find out the size in bytes it occupies on disk
        System.out.println("file.length(): " + myFile.length() + " bytes");
        // To find out if it is read, return true or false
        System.out.println("file.canRead():" + myFile.canRead());

        File newFolder = new File("C:/Users/JaiderPerez/Documents/filesDirectory/newFolder");
        System.out.println(newFolder.mkdir());
        // Delete the file or directory (must be empty), return true or false
        System.out.println(newFolder.delete());

        File folder = new File("C:/Users/JaiderPerez/Documents/filesDirectory");
        System.out.println("Files that contains the folder filesDirectory: ");
        for (String files : Objects.requireNonNull(folder.list())) {
            System.out.println(files);
        }

        // Add a new line with the method FileWriter and BufferedWriter
        FileWriter file = new FileWriter(FILEPATH, true);
        BufferedWriter dataFile = new BufferedWriter(file);
        dataFile.write("This is a new name: Jaider ");
        dataFile.close();

        // Add a new line with the method FileWriter and BufferedWriter optimized
        BufferedWriter dataFile2 = new BufferedWriter(new FileWriter(FILEPATH, true));
        dataFile2.write("This is a new name: Nicolás");
        dataFile2.close();

        // Add a new line with the method FileWriter and BufferedWriter super optimized
        PrintWriter dataFile3 = new PrintWriter(new BufferedWriter(new FileWriter(FILEPATH, true)));
        dataFile3.println("This is a new name: Maria ");
    }
}
