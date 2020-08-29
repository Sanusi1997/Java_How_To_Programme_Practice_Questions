package com.fileMatching;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FileMatching {
    private static Scanner inOldMaster;
    private static Scanner inTransaction;
    private static Formatter outNewMaster;
    private static Formatter outLogFile;

    public static void main(String... args) {

        openFile();
        matchFile();
        closeScanner();

        closeFormatter();

    }

    public static void openFile() {

        try {
            inOldMaster = new Scanner(Paths.get("oldMast.txt"));
            inTransaction = new Scanner(Paths.get("trans.txt"));

        } catch (IOException ioException) {
            System.err.println("Failure to open file. terminating programme....");
            System.exit(1);
        }
    }

    public static void matchFile() {

        try {
            outNewMaster = new Formatter("newMast.txt");
            outLogFile = new Formatter("log.txt");
        } catch (FormatterClosedException | FileNotFoundException e) {
            e.printStackTrace();
            System.err.println("Error processing file. Program terminating...");
            System.exit(-1);

        }
        while (inTransaction.hasNext()) {

            try {
                Account account = new Account(inOldMaster.nextInt(), inOldMaster.next(),
                        inOldMaster.next(), inOldMaster.nextDouble());
                TransactionRecord transact = new TransactionRecord(inTransaction.nextInt(), inTransaction.nextDouble());

                if (account.getAccount() == transact.getAccountNumber()) {
                    System.out.println("In new master file.....");
                    outNewMaster.format("%-10d%-30s%-15.2f%n", account.getAccount(),
                            (account.getFirstName() + ", " + account.getLastName()),
                            account.combine(transact));
                } else if (account.getAccount() != transact.getAccountNumber()) {
                    outNewMaster.format("%-10d%-30s%-15.2f%n", account.getAccount(),
                            (account.getFirstName() + ", " + account.getLastName()),
                            account.getBalance());
                    System.out.println("New Master file processed successfully...");
                }
                if (transact.getAccountNumber() != account.getAccount()) {
                    System.out.println("In log file.....");
                    outLogFile.format("Unmatched +transaction record for %d(fill in the account number from the transaction record).%n",
                            transact.getAccountNumber());
                    System.out.println("Log file processed successfully...");
                }

            } catch (NoSuchElementException e) {
                e.printStackTrace();
                System.err.println("Unable to process file properly");
                break;
            }
        }
    }

    public static void closeScanner() {
        if (inOldMaster != null && inTransaction != null) {
            inOldMaster.close();
        }
    }
    public static  void closeFormatter(){
        if(outNewMaster != null && outLogFile !=null){
            outNewMaster.close();
            outLogFile.close();
        }
    }

}