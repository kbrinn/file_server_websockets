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
            String fileName = input.substring(instructionIndex + 1);
            if  (input.equals(exitMode)) {
                System.out.println(fileLibrary);
                break;
            } switch(instruction) {
                case "add":
                    fileLibrary.addFile(fileName);
                    break;
                case "delete":
                    fileLibrary.deleteFile(fileName);
                    break;
                case "send":
                    fileLibrary.sendFile(fileName);
                    break;
                    case "show":
                    System.out.println(fileLibrary);
                default:
                    System.out.println("Invalid instruction");
            }
        }
    }
}