

public class YourFirstAccount {

    public static void main(String[] args) {
        Account myaccount = new Account("mine",100.0);
        myaccount.deposit(20.0);
        System.out.println(myaccount);
        
    }
}
