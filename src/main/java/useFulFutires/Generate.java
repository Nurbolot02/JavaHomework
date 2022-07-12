package useFulFutires;

/**
 * сгенерирует все перестановки длины N из K чисел с повторениями
 */
public class Generate {
    /* 2. Попробовать сгенерировать все перестановки длины N из K чисел с повторениями.
        Пример: N = 2, K = 3 ответ "00 01 02 10 11 12 20 21 22" */
    public static String GetKeys(int length, int fromKNumbers){
        if(length <= 0 && fromKNumbers <= 0){
            return "0";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < fromKNumbers; i++) {
            for (int j = 0; j < fromKNumbers; j++) {
                stringBuilder.append(i);
                stringBuilder.append(j);
                stringBuilder.append(" ");
            }
        }
        return String.valueOf(stringBuilder);
    }
}
