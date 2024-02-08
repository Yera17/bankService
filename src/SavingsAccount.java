public class SavingsAccount extends Account {
    @Override
    void pay(int amount) {
        System.out.println("Невозможно совершить оплату с этого счета!");
    }
    @Override
    void transfer(Account account, int amount) {
        if (getBalance() - amount >= 0) {
            account.setBalance(account.getBalance() + amount);
            setBalance(getBalance() - amount);
            System.out.println("Перевод прошел успешно.");
        } else {
            System.out.println("Невозможно совершить перевод. Нехватает средства.");
        }
    }
    @Override
    void addMoney(int amount) {
        setBalance(getBalance() + amount);
        System.out.println("Пополнение баланса прошло успешно.");
    }
    @Override
    void display() {
        System.out.printf("Сберегательный счет:\n Баланс: %.2f тг. \n", getBalance());
    }
}
