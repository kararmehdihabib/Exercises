/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kararmehdihabib
 */
public class LyyraCard {
    private double balance;

    public LyyraCard(double balanceAtStart) {
        // write code here
        this.balance=balanceAtStart;
    }

    public String toString() {
        // write code here
        return "The card has "+this.balance+" euros";
    }
    
    public void payEconomical(){
        if(this.balance>=2.50){
        this.balance=this.balance-2.50;
        }
    }
    
      public void payGourmet(){
          if(this.balance>=4.00){
        this.balance=this.balance-4.00;
          }
          
          
    }
      
      public void loadMoney(double amount) {
    // write code here
          this.balance=this.balance+amount;
          if(this.balance>=150){
              this.balance=150;
          }
          if(amount<0){
              this.balance=this.balance-amount;
          }
}
}

   