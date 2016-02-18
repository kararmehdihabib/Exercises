
import java.util.Scanner;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
       System.out.print("Type your name: ");
       String name1=reader.nextLine();
       System.out.print("Type your age: ");
        int number1=Integer.parseInt(reader.nextLine());
       System.out.print("\nType your name: ");
       String name2=reader.nextLine();
       System.out.print("Type your age: ");
        int number2=Integer.parseInt(reader.nextLine());
        
        int sum=number1+number2;
        String toprint="\n"+name1+" and "+name2+" are "+sum+" years old in total.";
        System.out.println(toprint);

        // Implement your program here
    }
}
