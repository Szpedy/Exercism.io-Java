class Proverb {
    private String[] words;
    private final static String line = "For want of a %s the %s was lost.\n";
    private final static String ending = "And all for the want of a %s.";

    Proverb(String[] words) {
        this.words = words;
    }

    String recite() {
        StringBuilder proverb = new StringBuilder();
        for (int i = 0; i < this.words.length; i++) {
            String w1 = this.words[i];
            if (i + 1 < this.words.length) {
                String w2 = this.words[i + 1];
                proverb.append(String.format(line, w1, w2));
            } else {
                proverb.append(String.format(ending, this.words[0]));
            }
        }
        return proverb.toString();
    }

}
