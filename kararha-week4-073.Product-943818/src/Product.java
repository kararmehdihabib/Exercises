/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kararmehdihabib
 */
public class Product {
    
    private String productName;
    private double price;
    private int amount;
    public Product(String name,double Price,int Amount){
        this.productName=name;
        this.price=Price;
        this.amount=Amount;
    }

  public void printProduct(){
      System.out.print(productName+", price "+price+", amount "+amount);
  }
    
    
}
