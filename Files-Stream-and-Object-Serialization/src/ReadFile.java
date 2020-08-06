import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadFile {
    private static Scanner input;

    public static void main(String args[]){

    openFile();
    readFile();
    closeFile();
    }
    public static void openFile(){
        try {
            input = new Scanner(Paths.get("student-details.txt"));
        }
        catch(IOException e){
            System.err.println("Unable to open file. Terminating program.....");
            System.exit(1);
        }
    }
    public static void readFile(){
        try {
            System.out.printf("%-15s%-15s%-15s%-30s%n", "Student id", "First Name","Last Name", "Department");
            while(input.hasNext()){
                System.out.printf("%- 15d%-15s%-15s%-30s%n", input.nextInt(), input.next(), input.next(), input.next());
            }
        }
        catch(NoSuchElementException e){
            System.err.println("File improperly formed. Terminating program.....");
        }
        catch(IllegalStateException e){
            System.err.println("Error reading from file. Terminating program.....");
        }
    }
    public static void closeFile(){
        if(input != null)
            input.close();
    }

}
