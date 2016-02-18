
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList 
        String input;
        ArrayList<String> words = new ArrayList<String>();
       while(true){
           System.out.print("Type a word: ");
           input=reader.nextLine();
           
        if(words.contains(input)){
               System.out.print("You typed the word "+input+" twice");
               break;
           }
        else{
            words.add(input);
        }
           
       }
      
        
    }
}
