package Chapter3;

public class Account {
    private String name;
    private double balance;

    public Account(String name, double balance) {
        this.name = name;

        if (balance > 0.0)
            this.balance = balance;
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0.0)
            balance = balance + depositAmount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void withdraw(double depositWithdraw) {
        if (balance > depositWithdraw)
            balance = balance - depositWithdraw;
        else
            System.out.println("Withdraw amount exceeded account balance");
    }

    public double getBalance() {
        return balance;
    }
}
