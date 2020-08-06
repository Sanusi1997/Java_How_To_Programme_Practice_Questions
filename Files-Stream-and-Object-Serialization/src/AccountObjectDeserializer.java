import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AccountObjectDeserializer {
    private static ObjectInputStream input;

    public static void main(String args[]) {
        openFile();
        readFile();
        closeFile();

    }

    public static void openFile() {
        try {
            input = new ObjectInputStream(Files.newInputStream(Paths.get("Account_holders.txt")));
        } catch (IOException e) {
            System.err.println("File not opened successfully. Terminating...");
            System.exit(1);
        }
    }

    public static void readFile() {
        System.out.printf("%-20s%-15s%-15s%10s%n", "Account Number", "First Name", "Last Name", "Account Balance");


        try {
            while (true) {
                Account record = (Account) input.readObject();
                System.out.printf("%-20s%-15s%-15s%10.2f%n", record.getAccount(), record.getFirstName(),
                        record.getLastName(), record.getBalance());
            }
        } catch (EOFException e) {
            System.err.println("End of file. No more records");
        } catch (IOException e) {
            System.err.println("Not able to read file properly. Terminating programme...");
        } catch (ClassNotFoundException e) {
            System.err.println("Object type not compatible. Terminating..");
        }
    }

    public static void closeFile() {
        try {
            if (input != null)
                input.close();
        } catch (IOException e) {
            System.err.println("Unable to close file properly. Terminating...");
        }
    }

}
