package com.fileMatching;

import java.io.FileNotFoundException;
import java.util.*;

public class CreateData {

    private static Formatter output;
    private static Formatter transOutput;

    public static void main(String arg[]) {
        Scanner collect = new Scanner(System.in);
        boolean choiceState = true;
        while(choiceState) {
            try {
                System.out.println("Enter 1 to enter account details, 2 to enter transaction details:");
                int userChoice = collect.nextInt();
                if (userChoice == 1) {
                    openAccountRecordFile();
                    addAccountRecord();
                    closeAccountRecordFile();
                } else if (userChoice == 2) {
                    openTransactFile();
                    addTransactRecord();
                    closeTransactFile();
                } else {
                    System.err.println("Invalid option. Program terminating...");
                }
                choiceState = false;
            } catch (InputMismatchException e) {
                System.err.println("Input must be of type int. Try again to input valid type");
                collect.nextLine();
            }
        }
    }

    public static void openAccountRecordFile() {

        try {
            output = new Formatter("oldMast.txt");
        } catch (SecurityException securityException) {
            System.out.println("Permission not granted to access file");
            System.exit(1);
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File does not exist");
            System.exit(1);
        }

    }
    public static void openTransactFile() {

        try {
            transOutput = new Formatter("trans.txt");
        } catch (SecurityException securityException) {
            System.out.println("Permission not granted to access file");
            System.exit(1);
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File does not exist");
            System.exit(1);
        }

    }


    public static void addAccountRecord() {
        Scanner input = new Scanner(System.in);
        System.out.printf("%s%n%s%n? ", "Enter Account, First Name, Last Name and Balance.",
                "Enter end of file indicator to end input.");
        while (input.hasNext()) {
            try {
                output.format("%d %s %s %.2f %n", input.nextInt(), input.next(), input.next(), input.nextDouble());
            } catch (FormatterClosedException e) {
                System.err.println("Error writing to file. Terminating!");
                break;
            } catch (NoSuchElementException e) {
                System.err.println("Invalid input! Please try again");
                input.nextLine();
            }
            System.out.print("? ");
        }
    }

    public static void addTransactRecord() {

        Scanner transInput = new Scanner(System.in);
        System.out.printf("%s%n%s%n? ", "Enter Account Number, transaction.",
                "Enter end of file indicator to end input.");
        while (transInput.hasNext()) {
            try {
                transOutput.format("%d %.2f  %n", transInput.nextInt(), transInput.nextDouble());
            } catch (FormatterClosedException e) {
                System.err.println("Error writing to file. Terminating!");
                break;
            } catch (NoSuchElementException e) {
                System.err.println("Invalid input! Please try again");
                transInput.nextLine();
            }
            System.out.print("? ");
        }

    }

    public static void closeAccountRecordFile() {
        if (output != null )
            output.close();

    }

    public static void closeTransactFile() {
        if (transOutput != null)
            transOutput.close();
    }
}


