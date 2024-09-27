import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<BankAccount> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void createAccount(String accountNumber, String accountHolder, double initialDeposit) {
        BankAccount newAccount = new BankAccount(accountNumber, accountHolder, initialDeposit);
        accounts.add(newAccount);
        System.out.println("Account created successfully for " + accountHolder);
    }

    public BankAccount findAccountByNumber(String accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        System.out.println("Account with number " + accountNumber + " not found.");
        return null;
    }

    public void listAccounts() {
        System.out.println("Bank Accounts:");
        for (BankAccount account : accounts) {
            System.out.println(account);
        }
    }
}
