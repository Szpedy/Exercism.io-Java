import java.util.ArrayList;
import java.util.List;

class Flattener {

    List flatten(List li) {
        List<Object> res = new ArrayList<>();

        for (Object o: li) {
            if (o instanceof List)
                res.addAll(flatten((List) o));
            else if (o != null)
                res.add(o);
        }
        return res;
    }

}