import java.util.stream.Collectors;
import java.util.stream.Stream;

class Acronym {

    private final String phrase;

    Acronym(String phrase) {
        this.phrase = phrase.replaceAll("_", "");
    }

    String get() {
        return Stream
                .of(phrase.split("[ -]"))
                .filter(phrase -> phrase.length() > 0)
                .map(phrase -> phrase.substring(0, 1).toUpperCase())
                .collect(Collectors.joining());
    }

}
