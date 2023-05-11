import java.util.Scanner;

class BankAccount {

    long accountnumber;
    double balance;
    String accountholdername;

    public BankAccount(long accountnumber, double balance, String accountholdername) {
        super();
        this.accountnumber = accountnumber;
        this.balance = balance;
        this.accountholdername = accountholdername;
    }

    public long getAccountnumber() {
        return accountnumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountholdername() {
        return accountholdername;
    }

    public void Deposit(double amount) {
        balance += amount;
        System.out.println("The available balance is " + balance);

    }

    public void Withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("your with draw is successfully done,the available balance is " + balance);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void Displaydetails() {
        System.out.println("The account holder name is " + accountholdername);
        System.out.println("The account number is " + accountnumber);
        System.out.println("the available balance is " + balance);
    }

    // write code for getter method for three variables
    // deposite method which takes amount as parameter
    // withdraw method which takes amount as parameter
    // Display account details method

}

class CheckingAccount extends BankAccount {

    double monthlyfee;

    public CheckingAccount(long accountnumber, double balance, String accountholdername, double monthlyfee) {
        super(accountnumber, balance, accountholdername);
        this.monthlyfee = monthlyfee;
    }

    public double getMonthlyfee() {
        return monthlyfee;
    }

   // @Override
    public void Withdraw(double amount) {
        if (balance >= amount + monthlyfee) {
            balance = balance - (amount + monthlyfee);
            System.out.println("Withdraw is sucessfully done,display the balance " + balance);
        } else {
            System.out.println("Insufficient funds ");
        }
    }

   // @Override
    public void Displaydetails() {
        super.Displaydetails();
        System.out.println("monthlyfees " + monthlyfee);
    }
    // getter method for monthly fee
    // override withdraw method
    // override diplay method

}

class SavingAccount extends BankAccount {

    double intrestrate;

    public SavingAccount(long accountnumber, double balance, String accountholdername, double intrestrate) {
        super(accountnumber, balance, accountholdername);
        this.intrestrate = intrestrate;
    }

    public double getIntrestrate() {
        return intrestrate;
    }

    public void addInterest() {
        double intrest = balance * (intrestrate / 100);
        balance += intrest;
        System.out.println("your interest is added,new balance " + balance);
    }

   // @Override
    public void Displaydetails() {
        super.Displaydetails();
        System.out.println("Your interestrate is " + intrestrate);
    }

    // getter method for intrest rate
    // add intrest method
    // over ride display

}

class CreditAccount extends BankAccount {

    double creditlimit;

    public CreditAccount(long accountnumber, double balance, String accountholdername, double creditlimit) {
        super(accountnumber, balance, accountholdername);
        this.creditlimit = creditlimit;
    }

    public double getCreditlimit() {
        return creditlimit;
    }

   // @Override
    public void Withdraw(double amount) {
        if (balance + creditlimit >= amount) {
            balance -= amount;
            System.out.println(" you Succesfully withdraw the amount " + balance);
        } else {
            System.out.println("Insufficient funds");
        }
    }

   // @Override
    public void Displaydetails() {
        super.Displaydetails();
        System.out.println("The credit limit is " + creditlimit);
    }

    // getter method for credit limit
    // over ride withdraw and display

}

public class Bank1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the account number");
        long re = sc.nextLong();
        System.out.println("Enter the amount");
        double fr = sc.nextDouble();
        System.out.println("enter the account holder name");
        String de = sc.next();
        BankAccount ba = new BankAccount(re, fr, de);
        System.out.println("Enter the deposit amount want to deposit ");
        double ry = sc.nextDouble();
        ba.Deposit(ry);
        System.out.println("Enter the amount want to withdraw");
        double hj = sc.nextDouble();
        ba.Withdraw(hj);
        ba.Displaydetails();
        System.out.println("*****--------*****");
        System.out.println("Enter monthly fee ");
        double a = sc.nextDouble();
        CheckingAccount hg = new CheckingAccount(re, ry, de, a);
        System.out.println("Enter the amount you want to with draw the checking account");
        double b = sc.nextDouble();
        hg.Withdraw(b);
        hg.Displaydetails();
        System.out.println("*****--------*****");
        System.out.println("Specify interestrate");
        double j = sc.nextDouble();
        SavingAccount gy = new SavingAccount(re, b, de, j);
        gy.addInterest();
        gy.Displaydetails();
        System.out.println("*****--------*****");
        System.out.println("Specify credit limit");
        double q = sc.nextDouble();
        CreditAccount ca = new CreditAccount(re, fr, de, q);
        System.out.println("Enter the you want to with draw the credit account");
        double f = sc.nextDouble();
        ca.Withdraw(f);
        ca.Displaydetails();

    }
}