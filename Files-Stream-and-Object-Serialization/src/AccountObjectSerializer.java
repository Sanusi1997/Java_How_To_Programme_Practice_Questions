import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class AccountObjectSerializer {
    private static ObjectOutputStream output;

    public static void main(String args[]) {
        openFile();
        writeFile();
        closeFile();

    }

    public static void openFile() {
        try {
            output = new ObjectOutputStream(Files.newOutputStream(Paths.get("Account_holders.txt")));
        } catch (IOException e) {
            System.err.println("Unable  to open file....program terminating!");
            System.exit(1);
        }

    }

    public static void writeFile() {
        Scanner input = new Scanner(System.in);
        System.out.printf("%s%n%s%n?", "Enter Account, First Name, Last Name and Account Balance",
                "Enter end of file indicator to stop");
        while (input.hasNext()) {
            try {
                Account record = new Account(input.nextInt(), input.next(), input.next(), input.nextDouble());
                output.writeObject(record);
            } catch (NoSuchElementException e) {
                System.err.println("Wrong input. Please try again");
                input.nextLine();
            } catch (IOException e) {
                System.err.println("Error writing to fule. Program terminating...");
                break;
            }
            System.out.print("? ");

        }

    }

    public static void closeFile() {
        try {
            if (output != null)
                output.close();
        } catch (IOException e) {
            System.err.println("Unable to close file properly. Terminating...");
        }
    }

}
