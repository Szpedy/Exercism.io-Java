class Darts {
    private static final int INNER_RADIUS = 1;
    private static final int MIDDLE_RADIUS = 5;
    private static final int OUTER_RADIUS = 10;

    private double x;
    private double y;

    Darts(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public int score() {
        int points = 0;
        if (inCircle(INNER_RADIUS)) {
            points = 10;
        } else if (inCircle(MIDDLE_RADIUS)) {
            points = 5;
        } else if (inCircle(OUTER_RADIUS)) {
            points = 1;
        }
        return points;
    }

    private boolean inCircle(int radius) {
        return Math.pow(x, 2) + Math.pow(y, 2) <= Math.pow(radius, 2);
    }

}
