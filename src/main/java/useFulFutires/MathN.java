package useFulFutires;

public class MathN {
    public static double pow(int a, int b){
        if (a > 0 && b == 0){
            return 1;
        }
        if (a == 0){
            return 0;
        }

        double result = 1;
        if (a > 0 && b > 0){
            result = powWithFor(a, b);
            return result;
            // to do Fast
            /*if(b % 2 == 0){
                result = powWithFor(a, b);
                return result;
            }
            else {
                result = powWithFor(a, b);
                return result;
            }*/
        }

        else if (a > 0 && b < 0){
            b *= -1;
            result = powWithFor(a, b);
            result = 1 / result;
            return result;
        }
        return result;
    }

    // to do Fast
    public static double powWithFor(int a, int b){
        double result = 1;
        for (int i = 0; i < b; i++){
            result *= a;
        }
        return result;
    }

    public static int Division(int a, int b){
        return a >> b;
    }

    public static int Multiplication(int a, int b){
        return a << b;
    }
}
