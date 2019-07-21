import java.util.LinkedList;
import java.util.List;

public class Anagram {
    private String baseWord;

    Anagram(String baseWord) {
        this.baseWord = baseWord.toLowerCase();
    }

    public List<String> match(List<String> words) {
        List<String> results = new LinkedList<>();
        for (String word : words) {
            if (isAnagram(word)) {
                results.add(word);
            }
        }
        return results;
    }

    private boolean isAnagram(String word) {
        String bw = this.baseWord;

        //Check length
        if (bw.length() != word.length()) {
            return false;
        }

        //Check if bw == word
        if (bw.equals(word.toLowerCase())) {
            return false;
        }

        // Character by character comparasion
        for (Character cha : word.toCharArray()) {
            if (bw.contains(cha.toString().toLowerCase())) {
                bw = bw.replaceFirst(cha.toString().toLowerCase(), "");
            } else {
                return false;
            }
        }
        return true;
    }

}
