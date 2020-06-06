public class Bob {
    private enum PhraseType {
        QUESTION,
        OTHER,
        EMPTY
    }

    public String hey(String phrase) {
        String answer;
        boolean isPhraseUpperCased = isPhraseUpperCased(phrase);
        PhraseType phraseType = getPhraseType(phrase);
        if (isPhraseUpperCased && phraseType == PhraseType.QUESTION) {
            answer = "Calm down, I know what I'm doing!";
        } else if (phraseType == PhraseType.QUESTION) {
            answer = "Sure.";
        } else if (phraseType == PhraseType.EMPTY) {
            answer = "Fine. Be that way!";
        } else if (isPhraseUpperCased) {
            answer = "Whoa, chill out!";
        } else {
            answer = "Whatever.";
        }
        return answer;
    }

    private boolean isPhraseUpperCased(String phrase) {
        return phrase.equals(phrase.toUpperCase()) && havePhraseLetter(phrase);
    }

    private boolean havePhraseLetter(String phrase) {
        return phrase.chars().anyMatch(Character::isLetter);
    }

    private PhraseType getPhraseType(String phrase) {
        PhraseType type;
        phrase = phrase.trim();
        try {
            char lastChar = phrase.charAt(phrase.length() - 1);
            if (lastChar == '?') {
                type = PhraseType.QUESTION;
            } else {
                type = PhraseType.OTHER;
            }
        } catch (IndexOutOfBoundsException e) {
            type = PhraseType.EMPTY;
        }
        return type;
    }
}
