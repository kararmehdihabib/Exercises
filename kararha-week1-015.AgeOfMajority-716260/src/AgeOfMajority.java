
import java.util.Scanner;

public class AgeOfMajority {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("How old are you? ");
        int number1=Integer.parseInt(reader.nextLine());
        if(number1<18){
            System.out.println("\nYou have not reached the age of majority yet!");
            
        }
        else{
            System.out.println("\nYou have reached the age of majority!");
        }
        // Type your program here 
    }
}
