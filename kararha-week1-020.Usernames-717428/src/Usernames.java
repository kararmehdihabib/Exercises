
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
         System.out.print("Type your username: ");
        String name1=reader.nextLine();
        System.out.print("Type your password: ");
        String password=reader.nextLine();
       
        if(name1.equals("emily") && password.equals("cat") ||name1.equals("alex") && password.equals("mightyducks")  ){
          System.out.println("You are now logged into the system!");
        }
        else{
            System.out.println("Your username or password was invalid!");
        }

    }
}
