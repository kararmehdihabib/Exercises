
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Up to what number? ");
        int number=Integer.parseInt(reader.nextLine());
        int i=0;
        int j=0;
        for(i=1;i<=number;i++){
            j=0+i;
            System.out.println(j);
        }
        
        // Write your code here
        
    }
}
