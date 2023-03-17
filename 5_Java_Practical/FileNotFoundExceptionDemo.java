import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileNotFoundExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Initialization of Try Block...");
        try {
            File file = new File("invalidFile.txt");
            Scanner sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException: " + e.getMessage());
        }
        System.out.println("Out Side of Try and Catch Block.");
    }
}
