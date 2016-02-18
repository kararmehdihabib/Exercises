import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum=0;
        for(int i=0;i<list.size();i++){
            sum=sum+list.get(i);
        }
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double sum=(double)((sum(list)));
        double ave=sum/(list.size());
        return ave;
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double ave=average(list);
        double variance=0;
        for(int i=0;i<list.size();i++){
            double var=Math.pow((list.get(i)-ave),2);
            variance+=Math.pow((list.get(i)-ave),2);
        }
        double result=variance/(list.size()-1);
        return result;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
