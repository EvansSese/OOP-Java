package encapsulation;

public class Bank {
    //create class variables
    private double int_rate = 0.12;
    private int balance = 0;

    //create a constructor class for Bank class
    public Bank(){

    }

    //private method to calculate interest on balance
    private double interest(){
        return balance*int_rate;
    }

    //setter methods
    public void deposit(int amount){
        balance = balance + amount;
    }

    //getter method
    public int checkBalance(){
        return balance;
    }

    public double get_interest(){
        return interest();
    }

    public void withdraw(int amount){
        if(amount > balance){
            System.out.println("Insufficient funds");
        }
        balance = balance - amount;
        System.out.print("You have withdrawn "+ amount + ". Your new balance is "+balance+".");
    }
}

class Account extends Bank {
    
    public static void main(String[] args) {
        Account acc = new Account();
        acc.deposit(100);
        System.out.println(acc.get_interest());
    }
}
