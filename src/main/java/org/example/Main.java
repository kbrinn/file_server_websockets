package org.example;

import org.example.file_server.FileLibrary;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FileLibrary fileLibrary = new FileLibrary();
        Scanner scanner = new Scanner(System.in);
        String exitMode = "exit";
        while (true) {
            String input = scanner.nextLine();
            int instructionIndex = input.indexOf(" ");
            String instruction = input.substring(0, instructionIndex);
            if  (input.equals(exitMode)) {
                break;
            } else if (instruction.equals("add")) {
                String fileName = input.substring(instructionIndex + 1);
                fileLibrary.addFile(fileName);

            } else if (instruction.equals("delete")) {
                String fileName = input.substring(instructionIndex + 1);
                fileLibrary.deleteFile(fileName);
            } else if (instruction.equals("send")) {
                String fileName = input.substring(instructionIndex + 1);
                fileLibrary.sendFile(fileName);
            }
        }
    }
}