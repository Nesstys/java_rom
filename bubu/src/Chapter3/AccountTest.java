package Chapter3;

import Chapter3.Account;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit ammount for account 1: ");
        double depositAmmount = input.nextDouble();

        System.out.printf("%nadding %.2f to account 1 balance %n%n", depositAmmount);
        account1.deposit(depositAmmount);

        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

        System.out.print("Enter deposit ammount for account 2: ");
        depositAmmount = input.nextDouble();

        System.out.printf("%nadding %.2f to account 2 balance %n%n", depositAmmount);
        account2.deposit(depositAmmount);

        System.out.print("Enter withdraw from account 1: ");
        double depositWithdraw = input.nextDouble();

        System.out.printf("%nwithdrawing %.2f from account 1 balance %n%n", depositWithdraw);
        account1.withdraw(depositWithdraw);

        System.out.print("Enter withdraw from account 2: ");
        depositWithdraw = input.nextDouble();

        System.out.printf("%nwithdrawing %.2f from account 2 balance %n%n", depositWithdraw);
        account2.withdraw(depositWithdraw);

        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

    }
}
