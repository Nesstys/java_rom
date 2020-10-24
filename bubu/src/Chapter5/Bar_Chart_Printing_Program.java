package Chapter5;

import java.util.Scanner;

public class Bar_Chart_Printing_Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] values = new int[5];
        int count = 0 ;

        for(int i=0;i<5;i++)
        {
            values[i] = sol("Enter number "+ ++count + ": ",in);
        }
        count = 0;

        for(int i=0;i<5;i++)
        {
            System.out.printf("%d: ",++count);
            for(int j=0;j<values[i];j++)
            {
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static int sol(String s, Scanner in)
    {
        System.out.print(s);
        return in.nextInt();
    }
}
