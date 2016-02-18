import java.util.ArrayList;
import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private String alphabet="abcdefghijklmnopqrstuvwxyz";
    private Random random;
char symbol;

private int i;
int j;
ArrayList list=new ArrayList();
String password;



    public PasswordRandomizer(int length) {
        // Initialize the variable
       this.i=length;
       this.random=new Random();
        
    }

    public String createPassword() {
        // write code that returns a randomized password
        list.clear();
        for(j=0;j<this.i;j++){  
        this.symbol=this.alphabet.charAt(this.random.nextInt(this.alphabet.length()));
     
        list.add(this.symbol);
        }
    this.password=this.list.toString();
    this.password = this.password.replace("[", "");
    this.password = this.password.replace("]", "");
    this.password = this.password.replace(",", "");
    this.password = this.password.replace(" ", "");
       return this.password;
    }
        
}
