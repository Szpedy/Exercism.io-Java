import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PigLatinTranslator {

    private final static String[] vowels = {"A", "E", "I", "O", "U",};
    private final static String[] doubleVowels = {"YT", "XR"};
    private final static String[] consontant = {"XR", "YT", "QU"};

    public String translate(String phrase) {
        return Stream
                .of(phrase.split(" "))
                .filter(word -> word.length() >= 2)
                .map(x -> wordToPig(x, 0))
                .collect(Collectors.joining(" "));
    }

    private String wordToPig(String word, int position) {
        if (Arrays.asList(vowels).contains(word.substring(0, 1).toUpperCase())
                | Arrays.asList(doubleVowels).contains(word.substring(0, 2).toUpperCase())
                | position >= word.length() - 1) {
            return word + "ay";
        } else if (Arrays.asList(consontant).contains(word.substring(0, 2).toUpperCase())) {
            return wordToPig(word.substring(2) + word.substring(0, 2), position + 1);
        } else
            return wordToPig(word.substring(1) + word.substring(0, 1), position + 1);
    }


}
