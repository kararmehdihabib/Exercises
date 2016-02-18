
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
             String secret="Karar";
        while(true){
            
            
        System.out.print("Type the password: ");
        String password1=reader.nextLine();
        
        if(password1.equals(password)){
            System.out.println("Right!");
            System.out.print("\nThe secret is: "+secret);
        
            break;
        }else{
            System.out.println("Wrong!");
        }
        // Type your program here

        // NOTE:
        // Parity of a value can be easily checked with modulo-operator %.
        // Test the following:
        // System.out.println( 1%2 );
        // System.out.println( 2%2 );
        // System.out.println( 3%2 );
        // System.out.println( 4%2 );
        // System.out.println( 5%2 );
        // System.out.println( 6%2 );
        // System.out.println( 7%2 );
        // int value = 8
        // System.out.println( value%2 );

    }
        // Write your code here
    }
}
