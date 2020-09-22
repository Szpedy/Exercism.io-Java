class DifferenceOfSquaresCalculator {
    // 1+ 2+ ... + n = n(n+1) / 2
    int computeSquareOfSumTo(int input) {
        int sumOfFirstNNaturalNumbers = (input * (input + 1)) / 2;
        return sumOfFirstNNaturalNumbers * sumOfFirstNNaturalNumbers;
    }

    //  1^2 + 2^2 + 3^2 + 4^2 + 5^2 +.. + n^2= n(n+1)(2n+1) / 6
    int computeSumOfSquaresTo(int input) {
        return (input * (input + 1) * (2 * input + 1)) / 6;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }
}
