import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class DiamondPrinter {

    List<String> printToList(char a) {
        List<String> diamond = new LinkedList<>();
        int height = ((int) a - 64) * 2 - 1;
        int currentChar = 65;
        for (int i = 0; i < height; i++) {
            diamond.add(getRow((char) currentChar, height, currentChar - 65));
            if (i < height / 2) {
                currentChar++;
            } else {
                currentChar--;
            }
        }
        return diamond;
    }

    String getRow(char a, int width, int offset) {
        char[] charArray = new char[width];
        Arrays.fill(charArray, ' ');
        StringBuilder sb = new StringBuilder();
        if (a == 'A') {
            charArray[width / 2] = 'A';
        } else {
            charArray[width / 2 - offset] = a;
            charArray[width / 2 + offset] = a;
        }

        for (char c : charArray) {
            sb.append(c);
        }
        System.out.println(charArray);
        return sb.toString();
    }

}
