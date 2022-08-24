package Lesson2;

public class Task4 {
    /*
    4.	Написать программу, показывающую последовательность действий для игры “Ханойская башня”
     */
    public static void main(String[] args) {
        int nDisks = 3;
        doTowers(nDisks, 'A', 'B', 'C');
    }

    public static void doTowers(int topN, char source, char destination, char buffer) {
        if (topN ==1){
            System.out.println("Disk 1 from " + source + " to " + destination);
            return;
        }
        doTowers(topN - 1, source, buffer, destination);
        System.out.printf("Disk %s from %s to %s\n", topN, source, destination);
        doTowers(topN - 1, buffer, destination, source);
    }


}
