import java.util.HashMap;
import java.util.Map;


class Scrabble {

    Scrabble(String word) {
        this.word = word;
    }

    private String word;
    private static final Map<Integer, Integer> scoreMap = new HashMap<>();

    static {
        "AEIOULNRST".chars().forEach(c -> scoreMap.put(c, 1));
        "DG".chars().forEach(c -> scoreMap.put(c, 2));
        "BCMP".chars().forEach(c -> scoreMap.put(c, 3));
        "FHVWY".chars().forEach(c -> scoreMap.put(c, 4));
        "K".chars().forEach(c -> scoreMap.put(c, 5));
        "JX".chars().forEach(c -> scoreMap.put(c, 8));
        "QZ".chars().forEach(c -> scoreMap.put(c, 10));
    }

    int getScore() {
        return word.trim().toUpperCase().chars().reduce(0, (x, y) -> x + scoreMap.get(y));
    }

}
