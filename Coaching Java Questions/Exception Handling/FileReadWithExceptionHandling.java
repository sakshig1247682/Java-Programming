//Write a Java program that reads the contents of a text file and prints it to the console. The program should handle exceptions for file not found, file reading errors, and any other general I/O exceptions. Display appropriate error messages for each type of exception.p

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadWithExceptionHandling {
    public static void main(String[] args) {
        String fileName = "example.txt";
        BufferedReader reader = null;
        
        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (java.io.FileNotFoundException e) {
            System.out.println("File not found! Please check the file path and name.");
        } catch (IOException e) {
            System.out.println("Error reading the file. Please try again.");
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing the file reader.");
            }
            System.out.println("Program execution completed.");
        }
    }
}

