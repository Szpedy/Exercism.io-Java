import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Yacht {
    List<Integer> dice;
    private YachtCategory yachtCategory;

    Yacht(int[] dice, YachtCategory yachtCategory) {
        this.dice = Arrays.stream(dice).boxed().collect(Collectors.toList());
        this.yachtCategory = yachtCategory;
    }

    int score() {
        System.out.println(dice);
        switch (yachtCategory) {
            case YACHT:
                return dice.stream().allMatch(x -> x == dice.get(0)) ? 50 : 0;
            case ONES:
                return (int) dice.stream().filter(x -> x == 1).count();
            case TWOS:
                return (int) dice.stream().filter(x -> x == 2).count() * 2;
            case THREES:
                return (int) dice.stream().filter(x -> x == 2).count() * 3;
            case FOURS:
                return (int) dice.stream().filter(x -> x == 2).count() * 4;
            case FIVES:
                return (int) dice.stream().filter(x -> x == 2).count() * 5;
            case SIXES:
                return (int) dice.stream().filter(x -> x == 2).count() * 6;
            case FULL_HOUSE:
                return dice.stream().distinct().count() == 2 && dice.stream().distinct().allMatch(n -> Collections.frequency(dice, n) >= 2) ? dice.stream().mapToInt(n -> n).sum() : 0;
            case FOUR_OF_A_KIND:
                return dice.stream().filter(n -> (Collections.frequency(dice, n) >= 4)).limit(4).mapToInt(n -> n).sum();
            case LITTLE_STRAIGHT:
                return dice.stream().mapToInt(n -> n).sum() == 15 && dice.stream().distinct().count() == 5 ? 30 : 0;
            case BIG_STRAIGHT:
                return dice.stream().mapToInt(n -> n).sum() == 20 && dice.stream().distinct().count() == 5 ? 30 : 0;
            default:
                return dice.stream().mapToInt(n -> n).sum();
        }
    }
}
