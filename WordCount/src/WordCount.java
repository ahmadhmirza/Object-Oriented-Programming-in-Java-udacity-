import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class WordCount {
    public static void main(String [] args) {
        File inputFile = new File("TextFile.txt");
        try {
            Scanner scanner = new Scanner(inputFile);
            int wordCount = 0;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                wordCount = wordCount + line.split(" ").length;
            }
            System.out.println("The file contains: " + wordCount + " words");
        }
        catch(FileNotFoundException e){
            System.out.println("File Not Found!");
        }
    }
}
