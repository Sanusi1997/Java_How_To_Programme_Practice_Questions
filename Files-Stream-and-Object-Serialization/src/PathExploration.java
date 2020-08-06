import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class PathExploration {
    public static void main(String ...args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter file path: ");
        Path path = Paths.get(input.nextLine());

        if(Files.exists(path)){
            System.out.printf("%s exists%n", path.getFileName());
            System.out.println(path);
            try {
                System.out.printf("Last modified: %s%n",Files.getLastModifiedTime(path));
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.printf("%s an absolute path%n", path.isAbsolute() ? "is" : "is not");
            System.out.printf("%s a directory%n", Files.isDirectory(path) ? "is" : "is not");
            try {
                System.out.println("File size: " + Files.size(path));
            } catch (IOException e) {
                e.printStackTrace();
            }

            if(Files.isDirectory(path)){

                try {
                    System.out.printf("%nDirectory's contents: %n");
                    DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path);

                    for(Path files : directoryStream)
                        System.out.println(files);


                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        }
        else{
            System.err.println("No such file exists");
        }


    }



}
