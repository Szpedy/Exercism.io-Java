import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class ResistorColor {
    private static final Map<String, Integer> colors = Map.of(
            "black", 0,
            "brown", 1,
            "red", 2,
            "orange", 3,
            "yellow", 4,
            "green", 5,
            "blue", 6,
            "violet", 7,
            "grey", 8,
            "white", 9);

    int colorCode(String color) {
       return colors.get(color.toLowerCase());
    }

    String[] colors() {
       return colors.entrySet()
               .stream()
               .sorted(Map.Entry.comparingByValue())
               .map(Map.Entry::getKey)
               .toArray(String[]::new);
    }
}
