public class Main {
    
   
    public static void main(String[] args) {
       Counter count =new Counter(900,false);
       System.out.print(count.value());
       count.decrease(7);
       System.out.print(count.value());
    }
    
}
