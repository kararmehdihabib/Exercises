import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
		String text=reader.nextLine();
		System.out.print( "In reverse order: ");
				for(int i=text.length()-1;i>=0;i--){
		System.out.print(text.charAt(i));
	
				
	}
    }
}
