import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class TriangleAction {

    static double calculatePerimeter (double a, double b) {
        return (sqrt(pow(a, 2) + pow(b, 2))) + a + b;
    }

    static double calculateSquare (double a, double b) {
        return (a * b) / 2;
    }

}
