import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        int num=0;
        int sum=0;
        int sum2;
        int count=0;
        int count2;
        int even=0;
        int odd2=0;
        
        int odd=0;
        float average;
        System.out.println("Type numbers:");
        while (num!=-1){
            count++;
            num =Integer.parseInt(reader.nextLine());
            if(num%2 ==0){
                even++;
            }
            else if(num%2 !=0){
                odd++;
            }
            
            sum+=num;
        }
        count2=count-1;
        sum2=sum+1;
        odd2=odd-1;
        
        average=(float)sum2/count2;
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is "+sum2);
        System.out.println("How many numbers: "+count2);
        System.out.println("Average: "+average);
        System.out.println("Even numbers: "+even);
        System.out.println("Odd numbers: "+odd2);
        
        
    }
}
