package useFulFutires;

public class MathN {
    /**
     * Возводить число а в степень b с помощью цикла фор медленно работает
     * @param a Число
     * @param b Степень
     * @return a в b-степени
     */
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

    /**
     * Возводить число а в степень b с помощью рекурсии (быстрее)
     * @param a Число
     * @param b Степень
     * @return a в b-степени
     */
    public static double PowWithRecurse(double a, int b) {
        if (a == 0 && b == 0) {
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

    /**
     * Возводить число а в степень b с помощью итерации (быстрее)
     * @param a Число
     * @param b Степень
     * @return a в b-степени
     */
    public static double PowWithIterWhile(double a, int b) {
        if (a == 0 || a == 1) return 1;
        if (b == 0) return 1;
        if (b < 0) {
            b = -b;
            a = 1 / a;
        }
        double result = 1;
        while (b > 0) {
            if (b % 2 != 0) {
                result *= a;
            }
            a *= a;
            b /= 2;
        }
        return result;
    }

}
