//Implement a system where a class BankAccount stores private balance details, and another class BankManager (which is not a subclass of BankAccount) can access and modify the balance.

// 1.The balance of the BankAccount should be private.
// 2.The BankManager should be able to check and modify the balance.
// 3.The friend function concept should be simulated without breaking encapsulation.

// Class representing a bank account
class BankAccount {
    private double balance; // Private balance (not directly accessible)

    // Constructor to initialize balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to get balance (simulating friend function)
    public double getBalance() {
        return balance;
    }

    // Method to allow a BankManager to modify balance
    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }
}

// Class representing a Bank Manager who can check and modify account balance
class BankManager {
    // Method that acts as a "friend function" to check account balance
    public void checkBalance(BankAccount account) {
        System.out.println("Current Balance: $" + account.getBalance());
    }

    // Method that acts as a "friend function" to modify balance
    public void updateBalance(BankAccount account, double newBalance) {
        account.setBalance(newBalance);
        System.out.println("Balance updated to: $" + newBalance);
    }
}

// Main class to test the functionality
public class FriendFunctionExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000.00); // Creating an account with $5000
        BankManager manager = new BankManager(); // Creating a bank manager

        // Checking the initial balance
        manager.checkBalance(account);

        // Updating the balance through the manager
        manager.updateBalance(account, 7500.00);

        // Checking the updated balance
        manager.checkBalance(account);
    }
}
