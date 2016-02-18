
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a word: ");

		String text=reader.nextLine();
		System.out.print("Length of the first part: ");
		int length=reader.nextInt();
		
		String firstpart=text.substring(0,length);
		int sizeOfPart=firstpart.length();
		
		System.out.print("Result: "+firstpart);
				
    }
}
