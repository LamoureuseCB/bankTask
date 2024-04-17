package accounts;

public class SavingsAccount extends Account{
//    со счета нельзя платить и нельзя уходить в минус

    int balance;

    public SavingsAccount(int balance) {
        super(balance);
    }

    @Override
    public void pay(int amount) {
        System.out.println("Нельзя проводить оплату со сберегательного счета");

    }


    @Override
    public void transfer(Account account, int amount) {
        if(balance - amount < 0){
            System.out.println("Операция невозможна! Баланс на сберегательном счете всегда должен быть больше 0");
        }
        balance -= amount;
        account.addMoney(amount);


    }

    @Override
    public void addMoney(int amount) {
        balance += amount;

    }
}
