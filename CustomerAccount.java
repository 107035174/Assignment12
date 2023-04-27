package Assignment12;

public class CustomerAccount {
    private String cusName;
    private String accNo;
    private double balance;

    public CustomerAccount(String cusName, String accNo, double balance) {
        this.cusName = cusName;
        this.accNo = accNo;
        this.balance = balance;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean withdraw(double amount) throws InsufficientBalanceException, NegativeAmountException {
        if (amount < 0) {
            throw new NegativeAmountException("Withdrawal amount cannot be negative.");
        }
        if (balance - amount < 100) {
            throw new InsufficientBalanceException("Withdrawal amount exceeds the minimum balance limit.");
        }
        balance -= amount;
        return true;
    }

    public double getBalance() {
        return balance;
    }
}






