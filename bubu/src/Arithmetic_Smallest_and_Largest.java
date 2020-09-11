import java.util.Scanner;

public class Arithmetic_Smallest_and_Largest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int number3;
        int sum;
        int med;
        int prod;

        System.out.print("Introduceti primul numar: ");
        number1 = input.nextInt();

        System.out.print("Introduceti al doilea numar: ");
        number2 = input.nextInt();

        System.out.print("Introduceti al treilea numar: ");
        number3 = input.nextInt();

        sum = number1 + number2 + number3;
        med = (number1 + number2 + number3)/3;
        prod = number1 * number2 * number3;

        System.out.printf("Suma este %d%n",sum);

        System.out.printf("Produsl este %d%n",prod);

        System.out.printf("Media este %d%n",med);

        if(number1 > number2 & number1 > number3)
            System.out.printf("%d este cel mai mare%n",number1);
        else if(number1 < number2 & number3 < number2)
            System.out.printf("%d este cel mai mare %n",number2);
        else if(number3 > number1 & number3 > number2)
            System.out.printf("%d este cel mai mare%n",number3);

        if(number1 < number2 & number1 < number3)
            System.out.printf("%d este cel mai mic%n",number1);
        else if(number1 > number2 & number3 > number2)
            System.out.printf("%d este cel mai mic%n",number2);
        else if(number3 < number2 & number3 < number1)
            System.out.printf("%d este cel mai mic",number3);
    }
}
