package java_objects;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        if (initialBalance < 0) {
            this.balance = 0.0;
            System.out.println("Warning: Initial balance cannot be negative. Set to 0.");
        } else {
            this.balance = initialBalance;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountHolderName(String name) {
        this.accountHolderName = name;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    public double calculateLoan() {
        if (balance < 10000) {
            return balance * 0.10;
        } else if (balance >= 11000 && balance <= 60000) {
            return balance * 0.25;
        } else {
            return balance * 0.30;
        }
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + accountHolderName);
        System.out.println("Balance: $" + balance);
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("001", "Alice", 5000);
        BankAccount acc2 = new BankAccount("002", "Bob", 20000);
        BankAccount acc3 = new BankAccount("003", "Charlie", 70000);

        acc1.deposit(1000);
        acc2.withdraw(5000);
        acc3.deposit(2000);

        acc1.displayDetails();
        acc2.displayDetails();
        acc3.displayDetails();

        System.out.println("Loan for Alice: $" + acc1.calculateLoan());
        System.out.println("Loan for Bob: $" + acc2.calculateLoan());
        System.out.println("Loan for Charlie: $" + acc3.calculateLoan());
    }
}
