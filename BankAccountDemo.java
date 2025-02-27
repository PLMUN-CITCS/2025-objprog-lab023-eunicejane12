// Define the BankAccount class
class BankAccount {
    // Attributes with different access modifiers
    public String accountHolder;  // public - accessible from anywhere
    private double balance;       // private - accessible only within this class
    protected String accountType; // protected - accessible within the same package and subclasses

    // Constructor to initialize the attributes
    public BankAccount(String accountHolder, double balance, String accountType) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountType = accountType;
    }

    // Method to deposit an amount into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;  // Increase balance if amount is positive
        }
    }

    // Method to withdraw an amount from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;  // Decrease balance if amount is positive and less than or equal to balance
        }
    }

    // Method to get the current balance (accessor)
    public double getBalance() {
        return balance;  // Return the balance
    }
}

// Main class to run the program
public class BankAccountDemo {
    public static void main(String[] args) {
        // Create a BankAccount object named myAccount using the constructor
        BankAccount myAccount = new BankAccount("Alice", 1000.0, "Checking");

        // Deposit some money into the account
        myAccount.deposit(250.0);

        // Withdraw some money from the account
        myAccount.withdraw(100.0);

        // Access and print account details
        System.out.println("Account Holder: " + myAccount.accountHolder);      // Access public attribute
        System.out.println("Account Type: " + myAccount.accountType);        // Access protected attribute
        System.out.println("Current Balance: $" + myAccount.getBalance());   // Access balance via public method
    }
}
