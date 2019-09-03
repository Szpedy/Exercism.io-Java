import java.util.regex.Pattern;

public class Bob {
    Pattern question = Pattern.compile("^[\\w,]\\?$");
    Pattern yell = Pattern.compile("^[A-Z|0-9 ,]+!?$");
    public String hey(String phrase) {
        if (question.matcher(phrase).matches())
            return "Sure.";
        else if(yell.matcher(phrase).matches())
            return "Whoa, chill out!";
        else{
            return "Whatever.";
        }
    }
}
