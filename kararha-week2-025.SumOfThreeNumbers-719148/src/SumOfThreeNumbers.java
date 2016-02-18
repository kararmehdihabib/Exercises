
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read; // store numbers read form user in this variable
        int number1=Integer.parseInt(reader.nextLine());
        System.out.print("Type the first number: ");
        sum= 0+number1;
        int number2=Integer.parseInt(reader.nextLine());
        System.out.print("Type the second number: ");
        sum=number1+number2;
        int number3=Integer.parseInt(reader.nextLine());
        System.out.print("Type the third number: ");
        sum+=number3;

        // Write your program here
        // Use only variables sum and read

        System.out.println("Sum: " + sum);
        

        // Write your program here
        // Use only variables sum and read

        
    }
}
