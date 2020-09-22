import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class NaturalNumber {
    private Classification classification;

    public NaturalNumber(int n) {
        if (n > 0) {
            classification = classify(n);
        } else {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
    }

    public Classification getClassification() {
        return classification;
    }

    private List<Integer> getDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();
        if (n > 1) {
            divisors.add(1);
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    divisors.add(i);
                } else {
                    divisors.add(i);
                    divisors.add(n / i);
                }
            }
        }
        return divisors;
    }

    private Classification classify(int n) {
        int sum = getDivisors(n).stream().reduce(0, Integer::sum);
        Classification classification;
        if (sum == n) {
            classification = Classification.PERFECT;
        } else if (sum > n) {
            classification = Classification.ABUNDANT;
        } else {
            classification = Classification.DEFICIENT;
        }
        return classification;
    }
}
