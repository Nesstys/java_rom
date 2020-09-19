import java.util.Scanner;
import java.util.Arrays;

public class Duplicate_Elimination {
    private static int[] arr = new int[5];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;

        while (count != 5) {
            System.out.printf("Enter value %d/5 between 10 and 100: ", count + 1);

            int num = input.nextInt();

            if (num < 10 || num > 100)
                continue;
            if (Unique(num))
                System.out.printf("Unique value: %d%n", num);

            try{
                // increase counter
                arr[count++] = num;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }

            printUnique();

        }
    }

    public static boolean Unique(int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num)
                return false;
        }
        return true;
    }
    public static void printUnique()
    {
        System.out.println("\nUnique values:\n");
        System.out.print(arr[0] + " ");
        int uni = 0;

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i] > 0)
            {
                for(int j=i-1;j>=0;j--)
                {
                    if(arr[i] == arr[j])
                    {
                        uni = 0;
                        break;
                    }else{
                        uni = arr[i];
                    }
                }
                if(uni >0)
                    System.out.print(uni + " ");
            }else
            {
                continue;
            }
        }
        System.out.println();
    }
}
