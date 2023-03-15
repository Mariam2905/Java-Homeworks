package org.example.homeworks.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {

    /**
     * 4. Write a program that reads a file name from the user and prints its contents to the console.
     * If the file does not exist or cannot be opened,
     * the program should throw an exception and print an error message.
     * <p>
     * This method read a file name.
     */

    void readFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

//    C:\Users\User\Desktop\Java Academic\Practic\Homework_(Exceptions).docx

    public static void main(String[] args) {
        ReadFile obj = new ReadFile();
        obj.readFile();
    }
}
