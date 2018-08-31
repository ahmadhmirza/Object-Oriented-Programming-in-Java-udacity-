import java.util.Scanner;

public class NumberGame {

    public static void main(String [] args){
        int randomNumber = (int) (Math.random() * 100);  //Type cast to int
        boolean correctGuess=false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("A random number has been chosen between 1-100");
        System.out.println("Try to guess it");

        for(int i=10; i>0;i--){                         //Gives user 10 tries to guess the number

            System.out.println("You have "+ i + " guess(es) left");
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            if (randomNumber<guess){
                System.out.println("Its smaller than "+ guess);
            }
            else if(randomNumber>guess){
                System.out.println("Its larger than "+ guess);
            }
            else{
                correctGuess=true;
                break;
            }
        }

        if(correctGuess==true){
            System.out.println("CORRECT...YOU WON!");
        }
        else{
            System.out.println("The number was"+randomNumber+"...You Lost :(");

        }

    }
}
