
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account MattsAccount= new Account("Matt's account",1000);
        Account MyAccount= new Account("My account",0.0);
        MattsAccount.withdrawal(100.0);
        MyAccount.deposit(100.0);
        System.out.println(MattsAccount);
        System.out.print(MyAccount);
        
    }

}
