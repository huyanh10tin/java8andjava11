package java11.matchpredicate;

import java.util.Arrays;
import java.util.regex.Pattern;

public class MatchPredicate {
    public static void main(String[] args) {
        var words = Arrays.asList("dog", "cat", "potato", "lemon", "car");
        var pred = Pattern.compile("cat",Pattern.CASE_INSENSITIVE).asMatchPredicate();
        words.forEach((word) -> {
            if (pred.test(word)) {
                System.out.printf("%s matches%n", word);
            } else {
                System.out.printf("%s does not match%n", word);
            }
        });
    }
}
