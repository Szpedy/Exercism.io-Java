import java.util.HashSet;
import java.util.Set;

class IsogramChecker {
    boolean isIsogram(String phrase) {
        Set<Character> chars = new HashSet<>();
        for(Character ch: phrase.toCharArray()){
            if (chars.contains(Character.toLowerCase(ch))) {
                return false;
            }
            else if(Character.isAlphabetic(ch)) {
                chars.add(Character.toLowerCase(ch));
            }
        }
        return true;
    }
}
