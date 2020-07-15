import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

class DnDCharacter {
    private static final Random rng = new Random();
    private final int strength;
    private final int dexterity;
    private final int constitution;
    private final int intelligence;
    private final int wisdom;
    private final int charisma;
    private final int hp;

    DnDCharacter() {
        strength = ability();
        dexterity = ability();
        constitution = ability();
        intelligence = ability();
        wisdom = ability();
        charisma = ability();

        // Your character's initial hit points are 10 + your character's constitution modifier.
        hp = 10 + modifier(constitution);
    }

    int ability() {
        return Stream.of(rollDice(6), rollDice(6), rollDice(6), rollDice(6))
                .sorted()
                .limit(3)
                .reduce(0, Integer::sum);
    }

    private int rollDice(int sides) {
        return rng.nextInt(sides) + 1;
    }

    // You find your character's constitution modifier by subtracting 10 from your character's constitution, divide by 2 and round down.
    int modifier(int input) {
        return (int) Math.floor((input - 10) / 2.0);
    }

    int getStrength() {
       return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return hp;
    }

}
