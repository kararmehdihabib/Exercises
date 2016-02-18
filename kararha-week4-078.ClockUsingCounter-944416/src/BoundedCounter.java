/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kararmehdihabib
 */
public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        // write code here
        this.upperLimit=upperLimit;
      
      
    }

    public void next() {
        // write code here
    
        this.value++;
       while(this.value==upperLimit+1){
            
                this.value=-1;
                
              this.value++;
            
        }
    }
    
    
    public String toString() {
        // write code here
        String lessThanTen= "0"+this.value;
        String moreThanTen=""+this.value;
        if(this.value<10){
        return lessThanTen;
    }
            return moreThanTen;
        
}
    public int getValue(){
        return this.value;
    }
    public void setValue(int val){
      
        if(val>0){   
       
        this.value=val;
        
        }
        if(val>upperLimit){
            this.value=0;
        }
    }
}