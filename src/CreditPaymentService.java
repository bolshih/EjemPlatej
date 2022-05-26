public class CreditPaymentService {
    public double calculate(double o, double pp, double s) {

        double pc;
        double x;
        double a;
        double y;
        double p;

        pc = s / (100 * 12);
        x = 1 + pc;
        a = -pp;
        y = Math.pow(x, a);
        p = o * pc / (1 - y);
        return p;
    }
}
