package useFulFutires;

public class Array {
    public static void print(int[][] array){
        int arrayLength = array.length;
        for (int i = 0; i < arrayLength + 1; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < arrayLength; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < arrayLength; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
