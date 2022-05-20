public class BmiService {
    public int calculate(double w, double h) {
        double a = h * h;
        double result = w / a;
        return (int) result;
    }


}

