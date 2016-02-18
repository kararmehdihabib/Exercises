
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the radius: ");
        int number1=Integer.parseInt(reader.nextLine());
        double cir=2*Math.PI*number1;
        String toprint="\nCircumference of the circle: "+cir;
        System.out.println(toprint);
        // Program your solution here 
    }
}
