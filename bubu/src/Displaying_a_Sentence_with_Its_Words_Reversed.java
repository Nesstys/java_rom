import java.util.*;

public class Displaying_a_Sentence_with_Its_Words_Reversed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a sentence:");
        String[] tokens = scanner.nextLine().split(" ");
        int Len = tokens.length;

        for (int i = Len - 1; i >= 0; i--)
            System.out.print(tokens[i] + " ");
    }
}
