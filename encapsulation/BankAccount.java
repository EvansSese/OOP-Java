package encapsulation;

public class BankAccount {
    private int balance = 0;

    public BankAccount() {

    }

    // setters
    public void deposit(int amount) {
        this.balance = balance + amount;
    }

    public void withdraw(int amount) {
        if (amount <= balance) {
            this.balance = balance - amount;
        }
    }

    // getters
    public int check_balance() {
        return balance;
    }
}
