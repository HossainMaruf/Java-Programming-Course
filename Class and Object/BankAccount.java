// import java.util.Scanner;

public class BankAccount {
   private String ownerName;
   private String accountNo; 
   private float balance = 0.0f;
   void setOwnerName(String name) { ownerName = name; }
   String getOwnerName() { return ownerName; }
   void setAccountNo(/* private can not be used */String accountNo ) { this.accountNo = accountNo; }
   String getAccountNo() { return accountNo; }
   void setBalance(float balance) { this.balance = balance; }
   float getBalance() { return balance; }
}

class Main {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // input.(all things are methods, no instance variable)
        // input.close();
        BankAccount b = new BankAccount();
        b.setOwnerName("Maruf Hossain");
        b.setAccountNo("10100003451");
        b.setBalance(100);
        System.out.println(b.getOwnerName() + "\t" + b.getAccountNo() + "\t" + b.getBalance());
    }
}