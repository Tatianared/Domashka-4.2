public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double w = 64.0;
        double h = 1.72;
        double imt = service.calculate(w, h);
        System.out.println(" Индекс массы тела " + imt + " кг/м.кв ");
    }
}
