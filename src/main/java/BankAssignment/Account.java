package BankAssignment;

public class Account {
    double balance;

    public Account() {
        this.balance = 0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            throw new IllegalArgumentException("Amount must be positive");
        }
    }

    public double withdraw(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid withdrawal amount");
        } else if (amount <= balance) {
            balance -= amount;
            return amount;
        } else {
            return 0;
        }
    }

    public double getBalance() {
        return balance;
    }
}
