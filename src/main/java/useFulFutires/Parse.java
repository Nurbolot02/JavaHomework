package useFulFutires;

public class Parse {
    public static int getNumber(String str, char symbol){
        char[] textChar = str.replace(" ", "").toCharArray();
        for (int i = 0; i < textChar.length; i++) {
            if (textChar[i] == symbol){
                StringBuilder number = new StringBuilder("");
                int textCharLength = textChar.length;
                i += 2;
                while (i < textCharLength && textChar[i] != '\n') {
                    number.append(textChar[i]);
                    i ++;
                }
                return Integer.parseInt(String.valueOf(number));
            }
        }
        return -1;
    }
}
