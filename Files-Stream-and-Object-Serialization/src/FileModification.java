import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FileModification {
    private static Formatter output;

    public static void main(String arg[]) {
        openFile();
        addRecord();
        closeFile();
    }

    public static void openFile() {

        try {
            output = new Formatter("student-details.txt");
        } catch (SecurityException securityException) {
            System.out.println("Permission not granted to access file");
            System.exit(1);
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("File does not exist");
            System.exit(1);
        }

    }

    public static void addRecord() {
        Scanner input = new Scanner(System.in);
        System.out.printf("%s%n%s%n? ", "Enter Student Id, First Name, Last Name and Department.",
                "Enter end of file indicator to end input.");
        while (input.hasNext()) {
            try {
                output.format("%d %s %s %s %n", input.nextInt(), input.next(), input.next(), input.next());
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

    public static void closeFile() {
        if (output != null)
            output.close();

    }
}
