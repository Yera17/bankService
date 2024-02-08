public abstract class Account {
    private double balance;

    public Account() {
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    abstract void pay(int amount);
    abstract  void transfer(Account account, int amount);
    abstract void addMoney(int amount);
    abstract void display();
}
