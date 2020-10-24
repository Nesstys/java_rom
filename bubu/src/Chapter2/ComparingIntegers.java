package Chapter2;

import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1;
        int number2;

        System.out.print("Introduceti primul numar: ");
        number1 = input.nextInt();

        System.out.print("Introduceti al doilea numar: ");
        number2 = input.nextInt();

        if(number1 == number2)
            System.out.print("Numerele sunt egale");
        else if (number1 > number2)
            System.out.printf("%d este mai mare %n",number1);
        else
            System.out.printf("%d este mai mare",number2);
    }
}
