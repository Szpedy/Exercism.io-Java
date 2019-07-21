import java.util.stream.IntStream;

class Hamming {

    private final String leftStrnad;
    private final String rightStrand;

    Hamming(String leftStrand, String rightStrand) throws IllegalArgumentException {
        if (leftStrand.length() == rightStrand.length()) {
            this.leftStrnad = leftStrand;
            this.rightStrand = rightStrand;
        }
        else if (leftStrand.isEmpty()) {
            throw new IllegalArgumentException("left strand must not be empty.");
        }
        else if (rightStrand.isEmpty()) {
            throw new IllegalArgumentException("right strand must not be empty.");
        }
        else {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }

    int getHammingDistance() {
        return (int) IntStream.range(0, leftStrnad.length())
                .filter(x -> leftStrnad.charAt(x) != rightStrand.charAt(x))
                .count();
    }

}
