import accounts.Account;
import accounts.CheckingAccount;
import accounts.CreditAccount;
import accounts.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        Account savingsAccount = new SavingsAccount(1000);
        Account creditAccount = new CreditAccount(-500);
        Account checkingAccount = new CheckingAccount(100);

        savingsAccount.transfer(creditAccount, 200);
        creditAccount.pay(100);
        checkingAccount.addMoney(100);

        System.out.println(savingsAccount.getBalance());
        System.out.println(creditAccount.getBalance());
        System.out.println(checkingAccount.getBalance());
    }

}