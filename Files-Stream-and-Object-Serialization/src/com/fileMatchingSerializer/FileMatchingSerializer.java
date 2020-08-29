package com.fileMatchingSerializer;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileMatchingSerializer {
    private static ObjectInputStream accountInput;
    private static ObjectInputStream transInput;
    private static ObjectOutputStream newAccountOutput;
    private static ObjectOutputStream logOutput;

    public static void main(String... args) {

        openFiles();
        modifyFiles();
        closeFiles();

    }

    private static void openFiles() {
        try {
            accountInput = new ObjectInputStream(Files.newInputStream(Paths.get("oldMast.ser")));
            transInput = new ObjectInputStream(Files.newInputStream(Paths.get("trans.ser")));
        } catch (IOException e) {
            System.err.println("Unable to open file. Program terminating...");
        }

    }

    private static void modifyFiles() {

        AccountRecord newAccount;

        try {
            newAccountOutput = new ObjectOutputStream(Files.newOutputStream(Paths.get("newMast.ser")));
            logOutput = new ObjectOutputStream(Files.newOutputStream(Paths.get("log.ser")));
            while (true) {

                AccountRecord account = (AccountRecord) accountInput.readObject();
                account.getAccount();
                account.getFirstName();
                account.getLastName();
                account.getBalance();


                TransactionRecord transact = (TransactionRecord) transInput.readObject();
                transact.getAccountNumber();
                transact.getTransactionAmount();

                if (account.getAccount() == transact.getAccountNumber()) {
                    System.out.println("In new master file.....");
                    newAccount = new AccountRecord(account.getAccount(), account.getFirstName(),
                            account.getLastName(), account.combine(transact));
                    newAccountOutput.writeObject(newAccount);
                } else if (account.getAccount() != transact.getAccountNumber()) {
                    newAccount = new AccountRecord(account.getAccount(), account.getFirstName(),
                            account.getLastName(), account.getBalance());
                    newAccountOutput.writeObject(newAccount);
                    System.out.println("New Master file processed successfully...");
                }
                if (transact.getAccountNumber() != account.getAccount()) {
                    System.out.println("In log file.....");
                    newAccount = new AccountRecord("Unmatched +transaction record: ", account.getBalance());
                    logOutput.writeObject(newAccount);
                    System.out.println("Log file processed successfully...");
                }
            }
        } catch (EOFException eofException) {
            eofException.printStackTrace();
            System.err.println("No more records to read");
        } catch (IOException ioException) {
            ioException.printStackTrace();
            System.err.println("Unable to process files properly...Program terminating");
            System.exit(1);
        } catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
            System.err.println("Incompatible class types. Program Terminating....");
        }

    }

    private static void closeFiles() {
        if (transInput != null)
            try {
                logOutput.close();

                newAccountOutput.close();
                transInput.close();
                accountInput.close();
            } catch (IOException e) {
                e.printStackTrace();
                System.err.println("Unable to close file successfully");
            }
    }
}

