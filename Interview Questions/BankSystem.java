//Design a simple Banking System where:
// There is a BankAccount class that holds account number, account holder name, and balance.
// The class should have methods for deposit, withdraw, and displaying balance.
// Create a SavingsAccount class that inherits from BankAccount and has an additional feature: interest rate.
// Implement method overriding for withdrawing money in the SavingsAccount class where withdrawal should not allow the balance to go below ₹1000.

// Base class representing a Bank Account
class BankAccount {
    protected String accountNumber;
    protected String accountHolder;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: ₹" + balance);
    }
}

// Derived class: SavingsAccount (inherits BankAccount)
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= 1000) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Withdrawal denied! Balance cannot go below ₹1000.");
        }
    }

    public void addInterest() {
        double interest = (balance * interestRate) / 100;
        balance += interest;
        System.out.println("Interest added: ₹" + interest);
    }
}

// Main class to test functionality
public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount myAccount = new SavingsAccount("123456", "Rahul Sharma", 5000, 5.0);

        myAccount.displayBalance();
        myAccount.deposit(2000);
        myAccount.withdraw(3000);
        myAccount.withdraw(4000); // Should be denied due to minimum balance
        myAccount.addInterest();
        myAccount.displayBalance();
    }
}
