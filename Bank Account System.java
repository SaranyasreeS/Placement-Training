import java.util.*;

class BankAccount{
    int account_num;
    String name;
    double balance = 0;
    void deposit(int acc, String n, int amount){
        System.out.println("--------------------------------------------------");
        System.out.println("Account Number: "+acc);
        System.out.println("Account holder: "+n);
        System.out.println(amount + " was deposited successfully...");
        balance = balance + amount;
        System.out.println("Your account balance is "+balance);
        System.out.println("--------------------------------------------------");
    }
    void withdraw(int ac, String name, int cash){
        System.out.println("--------------------------------------------------");
        System.out.println("Account Number: "+ac);
        System.out.println("Account holder: "+name);
        System.out.println("Your cash "+cash+" was withdrawed successfully...");
        balance = balance - cash;
        System.out.println("Your account balance is "+balance);
        System.out.println("--------------------------------------------------");
    }
}
public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your account number: ");
        int ac = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter account holder name: ");
        String n = scan.nextLine();
        int amount;
        BankAccount ba = new BankAccount();
        while(true) {
            System.out.println("Enter what you are going to do...(withdraw or deposit):");
            String type = scan.next();
            if (type.equals("withdraw")) {
                System.out.println("Enter the amount to withdraw: ");
                amount = scan.nextInt();
                ba.withdraw(ac, n, amount);
            } else {
                System.out.println("Enter the amount to be deposited: ");
                amount = scan.nextInt();
                ba.deposit(ac, n, amount);
            }
        }
    }
}
