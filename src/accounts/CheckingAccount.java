package accounts;

public class CheckingAccount extends Account{
//    может выполнять все операции,но не может уйти в минус

    public CheckingAccount(int balance) {
        super(balance);
    }

    @Override
    public void pay(int amount) {
        if(balance - amount < 0){
            System.out.println("Баланс счета не должен быть меньше 0");
        }
        balance -=amount;
    }

    @Override
    public void transfer(Account account, int amount) {
        if(balance - amount < 0){
            System.out.println("Баланс счета не должен быть меньше 0");
        }
        balance -=amount;
        account.addMoney(amount);


    }

    @Override
    public void addMoney(int amount) {
        balance += amount;

    }
}
