package accounts;

public abstract class Account {
    int balance;

    public Account(int balance) {
        this.balance = balance;
    }
    public int getBalance() {
        return balance;
    }

    public abstract void pay(int amount);

    public abstract void transfer(Account account, int amount);

    public abstract void addMoney(int amount);


}
