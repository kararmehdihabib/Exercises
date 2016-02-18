
public class NumberStatistics {
    private int amountOfNumbers;
    private int suma=0;
    public NumberStatistics() {
        
  
    }

    public void addNumber(int number) {
        // code here
        suma=suma+number;
        this.amountOfNumbers=this.amountOfNumbers+1;
      
    }

    public int amountOfNumbers() {
        // code here
        return amountOfNumbers;
    }
      public int sum() {
        // code here
          return this.suma;
    }
      
      public double average() {
        // code here
          double ave;
          if(this.amountOfNumbers!=0){
          double sum=(double)(this.suma);
          double amount=(double)(this.amountOfNumbers);
          ave= (sum)/(amount);
          return ave;
          }
          else{
              ave=0;
              return ave;
          }
    }
    

}
