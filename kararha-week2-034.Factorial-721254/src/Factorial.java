import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int a=Integer.parseInt(reader.nextLine());
        int i=1;
        int fac=1;
       while(i<=a){
            fac*=i;
            i++;
            
        }
        System.out.println("Factorial is "+fac);
    }
}
