import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random = new Random();
 
    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()
       
        int i=0;
        int number=0;
        while(i<7){
            number=this.random.nextInt(39)+1;
            
            if(!this.containsNumber(number)){
            this.numbers.add(number);
            i++;
            }
        }
    }

    public boolean containsNumber(int number1) {
        //Test here if the number is already in the drawn numbers
        
        return this.numbers.contains(number1);
    }
}
