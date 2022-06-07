package useFulFutires;

public class isNumber {
    /**
     * Принимает символ и проверяеть всю строку целиком на число
     * @param string
     * @return Trou or False
     */
    public static boolean isNumber(String string){
        try {
            int Value = Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            System.out.printf("%s - Input String cannot be parsed to Integer.\n", string);
            return false;
        }
    }

    /**
     * Принимает строку
     * @param str
     * @return Двумерный массив
     */
    public static int[][] getNumbers(String str){
        String[] strs = str.split("");
        int[][] result = new int[2][strs.length];
        for (int i = 0; i < strs.length; i++){
            if (isNumber(strs[i])){
                result[0][i] = i;
                result[1][i] = Integer.parseInt(strs[i]);
            }
        }
        return result;
    }
}
