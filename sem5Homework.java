package sem5Homework;
import java.util.Random;
public class sem5Homework {
    public static void main(String[] args) {
        int[][] map = new int[8][8];
        fillMap(map);
        printMap(map);
    }

    private static void fillMap(int[][] map) {
        Random rnd = new Random();
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if(i == 0 && j < map[i].length) map[i][j] = -1;
                if(j == 0 && i < map.length) map[i][j] = -1;
                if(j < map[i].length && i == map.length - 1) map[i][j] = -1;
                if(j == map[i].length - 1 && i < map.length) map[i][j] = -1;
            }
        }
        for (int i = 0; i < map.length + 3; i++) {
            map[rnd.nextInt(1, map.length - 1)][rnd.nextInt(1, map.length - 1)] = - 1;
        }
        int startIndexX = rnd.nextInt(1 , map.length - 1);
        int startIndexY = rnd.nextInt(1, map[1].length - 1);
        map[startIndexX][startIndexY] = 1;
        int finishIndexX = rnd.nextInt(1, map.length - 1);
        int finishIndexY = rnd.nextInt(1, map[1].length - 1);
        map[finishIndexX][finishIndexY] = 2;
    }
    private static void printMap(int[][] map) {
        for (int[] x : map) {
            for (int y : x) {
                System.out.printf("| " + y + " ");
            }
            System.out.println();
        }
    }
}
