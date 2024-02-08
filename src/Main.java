public class Main {
    public static void main(String[] args) {
        Account savingsAccount = new SavingsAccount();
        Account creditAccount = new CreditAccount();
        Account checkingAccount = new CheckingAccount();

        savingsAccount.addMoney(700);
        creditAccount.addMoney(1000);
        checkingAccount.addMoney(5000);

        savingsAccount.display();
        creditAccount.display();
        checkingAccount.display();

        savingsAccount.pay(200);
        creditAccount.pay(1000);
        checkingAccount.pay(1000);

        savingsAccount.display();
        creditAccount.display();
        checkingAccount.display();

        savingsAccount.transfer(checkingAccount, 500);
        creditAccount.transfer(checkingAccount, 500);
        checkingAccount.transfer(creditAccount, 1000);

        savingsAccount.display();
        creditAccount.display();
        checkingAccount.display();

    }
}