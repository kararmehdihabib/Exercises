
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First: ");
        int number1=Integer.parseInt(reader.nextLine());
        System.out.print("Last: ");
        int number2=Integer.parseInt(reader.nextLine());
        int i;
        int j;
        if(number1<number2){
        for(i=number1-1;i<number2;i++){
            j=i+1;
            System.out.println(j);
        }
        // write your code here

    }
        else if(number1>number2){
            System.out.println();
        }
        else if(number1==number2){
            System.out.println(number1);
        }
}
    }
