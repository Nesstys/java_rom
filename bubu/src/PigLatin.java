import java.util.*;

public class PigLatin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an English sentence to convert it into Pig-Latin:");
        String[] tokens = scanner.nextLine().split(" ");

        for (String token : tokens)
            printPigLatinWord(token);
    }

    public static void printPigLatinWord(String S) {
        String Latin = S.substring(1);
        Latin += Character.toLowerCase(S.charAt(0)) + "ay ";
        System.out.print(Latin);
    }
}
