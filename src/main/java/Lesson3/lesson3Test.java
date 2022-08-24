package Lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class lesson3Test {
    public static void main(String[] args) {
        Object ob = 1.5;
        Object ob2 = 2.5;
        Object res = Sum(ob, ob2);

        int n = 1, num2 = 5;
        int res2 = (int) Sum(n, num2);


        Random random = new Random();

        ArrayList<Integer> aList = new ArrayList<>();
        aList.add(3);
        for (int i = 0; i < 10; i++) {
            aList.add(random.nextInt(0, 100));
        }
        aList.add(3);
       //aPrint(aList);

        System.out.println(aList.get(2));
        if (aList.indexOf(5) == 0){
            System.out.println("have 5");
        } else if (aList.indexOf(5) == -1) {
            System.out.println("have not 5");
        }
        System.out.println(aList.lastIndexOf(3));

        System.out.println(aList.get(aList.size() - 1));
        aList.set(aList.size() - 1, 5555);
        System.out.println(aList.get(aList.size() - 1));

        System.out.println(aList.subList(aList.size()/2, aList.size()));



        StringBuilder day = new StringBuilder("22");
        StringBuilder Month = new StringBuilder("9");
        StringBuilder Year = new StringBuilder("2022");
        StringBuilder[] date = new StringBuilder[] {day, Month, Year};
        List<StringBuilder> dList = Arrays.asList(date.clone());
        System.out.println(dList);

        date[0] = new StringBuilder("5");
        System.out.println(dList);


        dList.clear();






    }

    static void aPrint(ArrayList<Integer> aList){
        for (Object o : aList) {
            System.out.print(o + " ");
        }
        System.out.println();
    }

    static void GetClass(Object obj) {
        System.out.println(obj.getClass().getName());
    }

    public static Object Sum(Object a, Object b){
        if (a instanceof Double && b instanceof Double){
            return (Object) ((Double) a + (Double) b);
        }else if (a instanceof Integer && b instanceof Integer){
            return (Integer) a + (Integer) b;
        }else return 0;
    }
}
