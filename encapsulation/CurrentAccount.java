package encapsulation;

//create CurrentAccount class that extends BankAccount class
public class CurrentAccount extends BankAccount {
    public static void main(String[] args) {

        // create current account object
        CurrentAccount account = new CurrentAccount();

        // check balance on current account
        System.out.println(account.check_balance());

        // deposit some amount into the current account using the deposit method
        // inherited from Bank account class
        account.deposit(100);

        // check new balance
        System.out.println(account.check_balance());

        // withdraw some amount from the balance
        account.withdraw(50);

        System.out.println(account.check_balance());
    }
}
