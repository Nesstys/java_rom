import java.util.Scanner;

public class Find_the_Smallest_Value {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberv = sol("Enter number of values to sort:", input);

        int small = sol("Enter value: ", input);

        --numberv;

        while (numberv > 0) {
            int curr = sol("Enter value: ", input);

            small = Math.min(curr, small);

            --numberv;
        }
        System.out.printf("The smallest is %d%n", small);
    }
    public static int sol(String s,Scanner input) {
        System.out.print(s);
        return input.nextInt();
    }

}
