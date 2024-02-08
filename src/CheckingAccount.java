public class CheckingAccount extends Account{
    @Override
    void pay(int amount) {
        if (getBalance() - amount >= 0) {
            setBalance(getBalance() - amount);
            System.out.println("Оплата совершена успешна.");
        } else {
            System.out.println("Невозможно совершить покупку. " +
                    "Не хватает средства.");
        }
    }
    @Override
    void transfer(Account account, int amount) {
        if (getBalance() - amount >= 0) {
            account.setBalance(account.getBalance() + amount);
            setBalance(getBalance() - amount);
            System.out.println("Перевод прошел успешно.");
        } else{
            System.out.println("Невозможно совершить перевод. "
                    + "Нехватает средства.");
        }
    }
    @Override
    void addMoney(int amount) {
        setBalance(getBalance() + amount);
        System.out.println("Пополнение баланса прошло успешно.");
    }
    @Override
    void display() {
        System.out.printf("Расчетный счет:\n Баланс: %.2f тг.\n", getBalance());
    }
}
