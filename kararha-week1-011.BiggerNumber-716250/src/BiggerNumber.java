
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
            System.out.print("Type a number: ");
        int number1=Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        int number2=Integer.parseInt(reader.nextLine());
        if(number1>number2){
            String toprint="\nThe bigger number of the two numbers given was: "+number1;
        System.out.println(toprint);
        }
        else{
             String toprint="\nThe bigger number of the two numbers given was: "+number2;
        System.out.println(toprint);
        }
        
        // Implement your program here. Remember to ask the input from user
    }
}
