import java.util.Random;

public class Robot {
    private Random r = new Random();
    private String name = this.generateName();

    String getName() {
        if (name.isEmpty()) {
            name = this.generateName();
        }

        return name;
    }

    void reset() {
        name = "";
    }

    private char getRandomChar() {
        return (char)(r.nextInt(26) + 'A');
    }

    private String getRandomDigitString() {
        Integer number = r.nextInt(1000);
        return String.format("%03d", number);
    }

    private String generateName() {
        char char1 = getRandomChar();
        char char2 = getRandomChar();
        String digits = getRandomDigitString();

        return String.format("%s%s%s", char1, char2, digits);
    }
}