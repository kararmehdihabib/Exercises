
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
         System.out.print("Type the points [0-60]: ");
        int number1=Integer.parseInt(reader.nextLine());
        
        
        if(number1>=0 && number1<=29){
            System.out.println("\nGrade: failed");
        }
        if(number1>=30 && number1<=34){
            System.out.println("\nGrade: 1");
        }
        if(number1>=35 && number1<=39){
            System.out.println("\nGrade: 2");
        }
        if(number1>=40 && number1<=44){
            System.out.println("\nGrade: 3");
        }
        if(number1>=45 && number1<=49){
            System.out.println("\nGrade: 4");
        }
        if(number1>=50 && number1<=60){
            System.out.println("\nGrade: 5");
        }
    }
}
