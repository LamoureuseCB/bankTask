package accounts;

public class CreditAccount extends Account{
//    нельзя иметь сумму выше 0,и если ушел в минус нужно пополнить чтобы выйти в ноль
    public CreditAccount(int balance) {
        super(balance);
    }

    @Override
    public void pay(int amount) {
        if(balance + amount > 0){
            System.out.println("Баланс не должен быть больше 0");
        }
        balance += amount;

    }

    @Override
    public void transfer(Account account, int amount) {
        if(balance + amount > 0){
            System.out.println("Баланс не должен быть больше 0");
        }
        balance += amount;
        account.pay(amount);
    }

    @Override
    public void addMoney(int amount) {
        balance += amount;

    }
}
