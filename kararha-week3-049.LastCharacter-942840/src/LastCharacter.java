import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
		String text=reader.nextLine();
        System.out.print("Last character: "+lastCharacter(text));
    }
    public static char lastCharacter(String text) {
	    // write your code here
		
	   return text.charAt(text.length()-1);
		
		
	
	}
}
