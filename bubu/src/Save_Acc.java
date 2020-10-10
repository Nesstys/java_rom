public class Save_Acc {
    private static double annualInterestRate;
    private double savingsBalance;

    public Save_Acc(double savingsBalance)
    {
        this.savingsBalance = savingsBalance;
    }
    public double calculateMonthlyInterest()
    {
        double monthlyInterest = savingsBalance * (annualInterestRate / 12);
        double total = savingsBalance + monthlyInterest;
        savingsBalance = total;

        return total;
    }
    public static void modifyInterestRate(double rate)
    {
        annualInterestRate = rate;
    }
}
