import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.util.Random;

public class WordGenerator {
    private int titlesCount;
    private String word ;
    String pathName;
    //Constructor
    WordGenerator(String pathName)
    {
        titlesCount=0;
        word="";
        this.pathName=pathName;
    }

    public String generate() {

        File inputFile = new File(pathName);
        try {
            Scanner scanner = new Scanner(inputFile);
            Scanner scanner1 = new Scanner(inputFile);
            String[] titles;

            //Count how many words are available in the file
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                titlesCount++;
            }
            int titleNumber = randomNumberInRange(0, titlesCount);
            int count = 0;
            scanner.close();

            while (scanner1.hasNextLine() && count <= titleNumber) {
                count = count + 1;
                String line = scanner1.nextLine();
                word = line;
            }

            System.out.println("Number of Lines are = " + titlesCount);
            System.out.println("Number of title is = " + titleNumber);
            System.out.println("Chosen word is " + word);
        }

        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    return word;
    }


    public static int randomNumberInRange(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

}
