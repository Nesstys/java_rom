import java.util.Scanner;

public class Parking_Charges {
    private static final double base_fee = 2.00;
    private static final double hour_fee = 0.50;
    private static final double max_fee = 10.00;

    private static double total = 0.0f;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double time = 0.0f;

        do{
            time = sol ("Enter hours parked(for exit -1): ",input );
            if(time > 0)
                System.out.printf("Charges: $%.2f%n",calculatecharges(time));

        }while(time != -1);
        System.out.printf("Total charges for the day: $%.2f%n",total);

    }
    public static int sol(String s,Scanner input) {
        System.out.print(s);
        return input.nextInt();
    }
    public static double calculatecharges(double time)
    {
        if(time > 3.0) {
            double fee = base_fee + (hour_fee * Math.ceil(time - 3.0));

            total += Math.min(fee, max_fee);
            return Math.min(fee, max_fee);
        }else{
            total +=base_fee;
            return base_fee;

        }
    }


}
