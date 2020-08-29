package com.fileMatchingSerializer;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateDataSerializer {
    private static ObjectOutputStream oldOutput;
    private static ObjectOutputStream transOutput;

    public static void main(String... args) {
        Scanner collect = new Scanner(System.in);
        boolean choiceState = true;
        while(choiceState) {
            try {
                System.out.println("Enter 1 to enter account details, 2 to enter transaction details:");
                int userChoice = collect.nextInt();
                if (userChoice == 1) {
                    openAccountRecordFile();
                    writeToAccountRecordFile();
                    closeAccountRecordFile();
                } else if (userChoice == 2) {
                    openTransactionRecordFile();
                    writeToTransactionRecordFile();
                    closeTransactionRecordFile();
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
            oldOutput = new ObjectOutputStream(Files.newOutputStream(Paths.get("oldMast.ser")));
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Unable to open file. Programme terminating...");
            System.exit(1);
        }
    }

    public static void openTransactionRecordFile() {
        try {
            transOutput = new ObjectOutputStream(Files.newOutputStream(Paths.get("trans.ser")));
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Unable to open file. Programme terminating...");
            System.exit(1);
        }
    }


    public static void writeToAccountRecordFile() {
        Scanner accountInput = new Scanner(System.in);
        System.out.printf("%s%n%s%n?", "Enter Account Number, first name, last name and balance",
                "Enter end of file indicator(<ctrl> + d) to stop");

        while (accountInput.hasNext()) {
            try {
                AccountRecord account = new AccountRecord(accountInput.nextInt(), accountInput.next(), accountInput.next(),
                        accountInput.nextDouble());
                oldOutput.writeObject(account);
            } catch (NoSuchElementException e) {
                e.printStackTrace();
                System.err.println(" Invalid input..try again");
                accountInput.nextLine();
            } catch (IOException ioException) {
                ioException.printStackTrace();
                System.err.println("Unable to serialize object. Program terminating...");
                break;
            }
            System.out.print("?");
        }

    }

    public static void writeToTransactionRecordFile() {
        Scanner transactInput = new Scanner(System.in);
        System.out.printf("%s%n%s%n?", "Enter Account Number and transaction amount",
                "Enter end of file indicator(<ctrl> + d) to stop");

        while (transactInput.hasNext()) {
            try {
                TransactionRecord transact = new TransactionRecord(transactInput.nextInt(), transactInput.nextDouble());
                transOutput.writeObject(transact);
            } catch (NoSuchElementException e) {
                e.printStackTrace();
                System.err.println(" Invalid input..try again");
               transactInput.nextLine();
            } catch (IOException ioException) {
                ioException.printStackTrace();
                System.err.println("Unable to serialize object. Program terminating...");
                break;
            }
            System.out.print("?");
        }

    }

    public static void closeAccountRecordFile() {
        if (oldOutput != null)
            try {
                oldOutput.close();
            } catch (IOException ioException) {
                System.err.println("Unable to closeFile properly");
            }

    }
    public static void closeTransactionRecordFile() {
        if (transOutput != null)
            try {
                transOutput.close();
            } catch (IOException ioException) {
                System.err.println("Unable to closeFile properly");
            }

    }

}
