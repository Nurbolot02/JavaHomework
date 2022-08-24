package Lesson3;

import static useFulFutires.Array.print;

public class Task8 {
    /*
    8.	* Шахматную доску размером NxN обойти конём так, чтобы фигура в каждой клетке была строго один раз.
        Пример для доски 5х5 решение может выглядеть так.
        25	14	3	8	19
        4	9	18	13	2
        15	24	1	20	7
        10	5	22	17	12
        23	16	11	6	21

     */
    public static final int[][] knightsMove = {{-1, +2}, {+1, +2}, {+2, -1}, {+2, +1}, {-1, -2}, {+1, -2}, {-2, -1}, {-2, +1}};
    public static final int boardSize = 5;
    public static int maxMuves;
    public static int[][] board = new int[boardSize][boardSize];

    public static void main(String[] args) {
        print(board);
        maxMuves = board.length * board[0].length;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (findPath(i, j, 1)) {
                    printSol();
                    System.out.println();
                    board = new int[boardSize][boardSize];
                }
            }
        }
        System.out.println("I can't did it!");
    }

    public static boolean findPath(int cyrX, int curY, int muveNum) {
        board[cyrX][curY] = muveNum;
        if (muveNum >= maxMuves) {
            return true;
        }

        for (int i = 0; i < knightsMove.length; i++) {
            int nextX = cyrX + knightsMove[i][0];
            int nextY = curY + knightsMove[i][1];
            if (isPossible(nextX, nextY) && findPath(nextX, nextY, muveNum + 1)) {
                return true;
            }
        }
        board[cyrX][curY] = 0;
        return false;
    }

    public static boolean isPossible(int nextX, int nextY) {
        return nextX >= 0 && nextX < board.length && nextY >= 0 && nextY < board.length && board[nextX][nextY] == 0;
    }

    public static void printSol(){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

}
