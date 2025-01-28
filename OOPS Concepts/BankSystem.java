// Create a Java program that simulates a simple banking system using inheritance. The system should include the following:
//  A base class BankAccount with attributes for account number and balance, and methods for depositing and withdrawing money.
//  A derived class SavingsAccount that extends BankAccount with an additional attribute for interest rate and a method to apply interest.
//  A derived class CheckingAccount that extends BankAccount with an additional attribute for overdraft limit and an overridden method for withdrawing money to account for the overdraft limit.
//  A main class to create instances of SavingsAccount and CheckingAccount, and demonstrate the functionality of deposit, withdraw, and other specific methods.


// BankAccount.java
class BankAccount {
    protected String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

// SavingsAccount.java
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest Applied: " + interest + ", New Balance: " + balance);
    }

    public double getInterestRate() {
        return interestRate;
    }
}

// CheckingAccount.java
class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Insufficient funds or overdraft limit exceeded.");
        }
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}

// BankSystem.java
public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("S123", 1000.0, 5.0);
        CheckingAccount checkingAccount = new CheckingAccount("C123", 500.0, 200.0);

        // Demonstrate deposit
        savingsAccount.deposit(200);
        checkingAccount.deposit(150);

        // Demonstrate withdraw
        savingsAccount.withdraw(100);
        checkingAccount.withdraw(600);

        // Apply interest to savings account
        savingsAccount.applyInterest();

        // Attempt to withdraw beyond overdraft limit in checking account
        checkingAccount.withdraw(200);

        // Display final balances
        System.out.println("Final Savings Account Balance: " + savingsAccount.getBalance());
        System.out.println("Final Checking Account Balance: " + checkingAccount.getBalance());
    }
}
