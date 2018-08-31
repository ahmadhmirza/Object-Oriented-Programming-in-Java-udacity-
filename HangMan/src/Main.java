import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.util.Random;

public class Main {

    public static void main(String [] args){
        WordGenerator gen = new WordGenerator("wordlist.txt");
        String word = gen.generate();
        String newWord = "";
        boolean status=false;

        System.out.print("You are guessing: ");

        for(int i=0;i<word.length();i++) {
            newWord=newWord + "-";
        }

        System.out.print(newWord);
        System.out.println("");
        System.out.print("Do you wish to start the game (Y/N) :");
        Scanner scanner = new Scanner(System.in);
        String start = scanner.nextLine();

            if (start.equals("Y") || start.equals("y"))
            {
                HangMan game = new HangMan(word,newWord);
                status=game.startgame();
                if (status==true){
                    System.out.print("YOU WON!!!");
                }
                else if (status==false){
                    System.out.print("YOU LOST!!!");
                }
            }
            else
            {
                System.out.print("Ok bye!");
            }
    }


}
