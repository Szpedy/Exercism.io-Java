import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        List<Signal> output = new ArrayList<>();
        for (Signal signal : Signal.values()) {
            if ((number & 1) == 1) output.add(signal);
            number >>= 1;
        }
        if (number > 0) Collections.reverse(output);
        return output;
    }
}
