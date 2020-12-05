import java.util.*;

public class RandomSentences {
    public static void main(String[] args) {
        Random rand = new Random();

        String[] article = {"the", "a", "one", "some", "any"};
        String[] noun = {"boy", "girl", "dog", "town", "car"};
        String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};
        String[] preposition = {"to", "from", "over", "under", "on"};

        for (int i = 0; i < 20; i++) {
            int X = rand.nextInt(5);
            String Str = Character.toUpperCase(article[X].charAt(0)) + article[X].substring(1);

            X = rand.nextInt(5);
            Str += " " + noun[X];
            X = rand.nextInt(5);
            Str += " " + verb[X];
            X = rand.nextInt(5);
            Str += " " + preposition[X];
            X = rand.nextInt(5);
            Str += " " + article[X];
            X = rand.nextInt(5);
            Str += " " + noun[X] + ".";
            System.out.println(Str);
        }
    }
}
