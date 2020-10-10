

public class Save_AccTest {
    public static void main(String args[]) {
        Save_Acc account1 = new Save_Acc(2000);
        Save_Acc account2 = new Save_Acc(3000);

        account1.modifyInterestRate(0.4);

        System.out.println("Acc with 4% annual interest");
        System.out.println("Month   Account1   Account2");
        for (int i = 0; i < 12; i++) {
            System.out.printf("%5d%11.2f%11.2f%n", i + 1, account1.calculateMonthlyInterest(), account2.calculateMonthlyInterest());
        }

    }
}
