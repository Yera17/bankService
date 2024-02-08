public class CreditAccount extends Account{
    @Override
    void pay(int amount) {
        setBalance(getBalance() - amount);
        System.out.println("Оплата совершена успешна.");
    }
    @Override
    void transfer(Account account, int amount) {
        System.out.println("Невозможно совершить перевод c этого счета!");
    }
    @Override
    void addMoney(int amount) {
        if (getBalance() + amount <= 0) {
            setBalance(getBalance() + amount);
            System.out.println("Пополнение баланса прошло успешно.");
            System.out.printf("Баланс: %.2f тг.\n", getBalance());
        } else {
            System.out.println("Невозможно пополнить больше чем "
                    + (getBalance() * 1));
        }
    }
    @Override
    void display() {
        System.out.printf("Кредитный счет:\n Баланс: %.2f тг.\n", getBalance());
    }
}
