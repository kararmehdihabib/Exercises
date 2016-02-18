
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here. 
        while(true){
        System.out.println("Give a number: ");
        double value=Double.parseDouble(reader.nextLine());
        // Graph is used as follows:
      
        if(value>-30 && value<40){
        Graph.addNumber(value);
        }
        // Remove or comment out these lines above before trying to run the tests.
    }
}
}