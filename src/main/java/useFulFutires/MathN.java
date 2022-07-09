package useFulFutires;

public class MathN {
    public static double powWithFor(double a, int b) {
        if (a == 0 || a == 1) {
            return 1;
        }
        if (b == 0) {
            return a;
        }

        if (b < 0) {
            b = -b;
            a = 1 / a;
        }

        double result = 1;

        for (int i = 0; i < b; i++) {
            result = result * a;
        }
        return result;
    }

    public static double PowWithRecurse(double a, int b) {
        if (a == 0 && b == 0){
            System.out.println("Null!");
            return 0;
        }
        if (b == 0) return 1;
        if (a == 0 || a == 1) return 1;
        if (b < 0) {
            return PowWithRecurse(1 / a, -b);
        }

        double result = PowWithRecurse(a, b / 2);
        return b % 2 == 0 ? result * result : result * result * a;
    }

}
