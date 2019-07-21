public class PangramChecker {

    public boolean isPangram(String input) {
        String lowerCaseInput = input.toLowerCase();
        for(char c = 'a'; c <= 'z';c ++) {
           if(lowerCaseInput.indexOf(c) < 0)
               return false;
        }
        return true;
    }

}
