package Chapter4;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Credit_Limit_CalculatorTest {
    public static void main(String[] args) {

        int nracc;
        int begbalance;
        int totcharges;
        int totcredits;
        int limcredit;
        char count = '1';

        Scanner input = new Scanner(System.in);
        Credit_Limit_Calculator credcalc = new Credit_Limit_Calculator();

        while(count != '0')
        {
            System.out.print("Enter acc  number: ");
            nracc = input.nextInt();

            begbalance = sol ("Enter start balance for acc " + nracc + ":",input);
            totcharges = sol ("Enter total charghes for acc " + nracc + ":",input);
            totcredits = sol ("Enter total credits for acc " + nracc + ":",input);
            limcredit = sol ("Enter credit limit for acc " + nracc + ":",input);

            credcalc.setAccinfo(nracc,begbalance,totcharges,totcredits,limcredit);

            System.out.printf("Info acc %d%n",nracc);

            System.out.printf("Starting balance: %d%n",credcalc.getbegbalance());
            System.out.printf("Credit limit: %d%n",credcalc.getlimcredit());
            System.out.printf("Total charges: %d%n",credcalc.gettotcharges());
            System.out.printf("Starting balance: %d%n",credcalc.gettotcredits());
            System.out.printf("New balance: %d%n",credcalc.getnewbalance());

            if(credcalc.creditexceeded())
                System.out.println("Credit limit exceeded");

            System.out.print("Calculate credit for another acc?(1=yes/0=no): ");
            count = input.next().charAt(0);
        }
    }
    public static int sol(String s,Scanner input) {
        System.out.print(s);
        return input.nextInt();
    }
}
