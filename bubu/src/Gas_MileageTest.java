import java.util.Scanner;

public class Gas_MileageTest {
    public static void main(String[] args) {
        int mile;
        int gal;
        char count = '1';

        Scanner input = new Scanner(System.in);
        Gas_Mileage mil = new Gas_Mileage();

        while(count != '0')
        {
            System.out.print("Enter mileage:");
            mile = input.nextInt();
            System.out.print("Enter gallons:");
            gal = input.nextInt();

            System.out.printf("You spent for the trip:%.2f%n",mil.gettrav(mile,gal));

            System.out.print("Another trip?(1=yes/0=no):");
            count = input.next().charAt(0);

            System.out.printf("Total mileages : %.2f%nTotal gallons: %.2f%n",mil.gettotmile(),mil.gettotgal());

            System.out.printf("For all trips:%.2f%n",mil.gettottrav());
        }
    }
}
