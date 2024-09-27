import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nBankY System");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Funds");
            System.out.println("3. Withdraw Funds");
            System.out.println("4. Transfer Funds");
            System.out.println("5. List All Accounts");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");
                    String accountNumber = scanner.nextLine();
                    System.out.print("Enter account holder name: ");
                    String accountHolder = scanner.nextLine();
                    System.out.print("Enter initial deposit: ");
                    double initialDeposit = scanner.nextDouble();
                    scanner.nextLine();  // Consume newline
                    bank.createAccount(accountNumber, accountHolder, initialDeposit);
                    break;

                case 2:
                    System.out.print("Enter account number: ");
                    String accNumberForDeposit = scanner.nextLine();
                    BankAccount depositAccount = bank.findAccountByNumber(accNumberForDeposit);
                    if (depositAccount != null) {
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = scanner.nextDouble();
                        scanner.nextLine();  // Consume newline
                        depositAccount.deposit(depositAmount);
                    }
                    break;

                case 3:
                    System.out.print("Enter account number: ");
                    String accNumberForWithdraw = scanner.nextLine();
                    BankAccount withdrawAccount = bank.findAccountByNumber(accNumberForWithdraw);
                    if (withdrawAccount != null) {
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawalAmount = scanner.nextDouble();
                        scanner.nextLine();  // Consume newline
                        withdrawAccount.withdraw(withdrawalAmount);
                    }
                    break;

                case 4:
                    System.out.print("Enter your account number: ");
                    String fromAccountNumber = scanner.nextLine();
                    BankAccount fromAccount = bank.findAccountByNumber(fromAccountNumber);
                    if (fromAccount != null) {
                        System.out.print("Enter the account number to transfer to: ");
                        String toAccountNumber = scanner.nextLine();
                        BankAccount toAccount = bank.findAccountByNumber(toAccountNumber);
                        if (toAccount != null) {
                            System.out.print("Enter transfer amount: ");
                            double transferAmount = scanner.nextDouble();
                            scanner.nextLine();  // Consume newline
                            fromAccount.transfer(toAccount, transferAmount);
                        }
                    }
                    break;

                case 5:
                    bank.listAccounts();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
