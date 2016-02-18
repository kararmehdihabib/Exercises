import java.util.ArrayList;
import java.util.Scanner;

public class WordsInReverseOrder {
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
       for(int i=words.size()-1;i>=0;i--){
           System.out.println(words.get(i));
       }
    }
}
