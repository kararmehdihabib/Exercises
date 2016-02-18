
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // write here code to ensure that BoundedCounter works as expected
        // before starting 78.3 remove the extra code and use the skeleton shown
        // in the assignment
   /* BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        int i = 0;
        while ( i < 121 ) {
            System.out.println( hours + ":" + minutes);   // the current time printed
            // advance minutes
            // if minutes become zero, advance hours
            minutes.next();
            i++;
            
           
           if(minutes.getValue()==0){
               hours.next();
               
           }
            
        }*/
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        System.out.print("seconds: ");
        int s = reader.nextInt();// read the initial value of seconds from the user
        System.out.print("minutes: ");
        int m =reader.nextInt(); // read the initial value of minutes from the user
        System.out.print("hours: ");
        int h = reader.nextInt();// read the initial value of hours from the user

        seconds.setValue(s);
     
        minutes.setValue(m);
        hours.setValue(h);

        int i = 0;
        while ( i < 400) {
            // like in previous but seconds taken into account
              System.out.println( hours + ":" + minutes+":"+seconds);   // the current time printed
            // advance minutes
            // if minutes become zero, advance hours
            seconds.next();
            i++;
            
           
           if(seconds.getValue()==0 ){
               minutes.next();
               
           }
           if(seconds.getValue()==0 && minutes.getValue()==0){
               hours.next();
           }
          
          

          
        }
BoundedCounter counter = new BoundedCounter(4); counter.setValue(5); counter.next(); System.out.println(counter); 
    }
}
