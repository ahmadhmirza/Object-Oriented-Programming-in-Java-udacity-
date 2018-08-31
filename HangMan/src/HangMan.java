import java.util.Scanner;

public class HangMan {
    private String word;
    private String newWord;

    HangMan(String word,String newWord){
        this.word=word;
        this.newWord=newWord;
    }

    public boolean startgame(){
        Scanner charInput = new Scanner(System.in);
        String guess="";
        char guess_cast;
        int index=0;
        int chances=10;


        char[] newWordChar = newWord.toCharArray();

        while(chances>0) {

            System.out.print("Guess a letter : ");
            guess = charInput.nextLine();

            if (word.contains(guess)) {
                for (int i =0;i<word.length();i++){
                    if (Character.toString(word.charAt(i)).equals(guess)){
                        guess_cast=guess.charAt(0);
                        if (newWordChar[i]==guess_cast) {
                            System.out.print("You already guessed that letter!");
                        }
                        else{
                            newWordChar[i] = guess_cast;
                            index++;
                        }
                    }
                    if (index==word.length()){
                        return true;
                    }
                }
            }
            else
            {
                chances--;
                System.out.println("NO, you have "+ chances +" tries left");
            }

            System.out.println();
            System.out.println(newWordChar);

            }
            return false;
        }


}
