
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int i=Integer.parseInt(reader.nextLine());
        int j=0;
        int sum=0;
        while(j<=i){
            int result=(int)Math.pow(2,j);
            sum+=result;
            j++;
            
        }
        System.out.println(sum);
    }
}
