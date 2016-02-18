
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First: ");
        int i=Integer.parseInt(reader.nextLine());
        System.out.print("Second: ");
        int j=Integer.parseInt(reader.nextLine());
        int sum=0;
        int jw=Math.min(i, j);
        int t=Math.max(i, j);
        
        while(jw<=t){
            
            sum+=jw;
            jw++;
        }
        System.out.println("Sum is "+sum);
        // Write your code here
        
        
    }
}
