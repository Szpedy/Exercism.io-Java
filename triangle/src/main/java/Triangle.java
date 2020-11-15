import java.util.ArrayList;
import java.util.List;

public class Triangle {
    private List<TriangleKind> kinds = new ArrayList<>();

    public Triangle(double a, double b, double c) throws TriangleException {
        if(a+b <= c || b+c <= a || c+a <= b) {
            throw new TriangleException();
        }
        if(a != b && b != c && c != a) {
            kinds.add(TriangleKind.SCALENE);
        }
        if(a == b && b == c) {
            kinds.add(TriangleKind.EQUILATERAL);
        }
        if(a == b || b == c || a == c) {
            kinds.add(TriangleKind.ISOSCELES);
        }
    }

    public boolean isEquilateral() {
        return kinds.contains(TriangleKind.EQUILATERAL);
    }

    public boolean isIsosceles() {
        return kinds.contains(TriangleKind.ISOSCELES);
    }

    public boolean isScalene() {
        return kinds.contains(TriangleKind.SCALENE);
    }
}