import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String input;
        ArrayList<String> words = new ArrayList<String>();
       do{
           System.out.print("Type a word: ");
           input=reader.nextLine();
           words.add(input);
           
       }while(input.length()!=0);
        System.out.print("You typed the following words:");
      Collections.sort(words);
      for(String words1: words){
          System.out.println(words1);
      }
    }
}