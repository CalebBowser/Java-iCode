import java.util.*;
public class towerAlgorithm {
    public static void print(Object val){
        System.out.println(val);
    }
    public static void printTowers(Integer[] tower1, Integer[] tower2, Integer[] tower3){
        print("\nT T T");
        print("1 2 3\n");
        for (int i = 1; i <= 9; i++) {
            print(tower1[tower1.length - i] + " " + tower2[tower2.length - i] + " " + tower3[tower3.length - i]);
        }
        print("\nT T T");
        print("1 2 3\n");
    }
    
    public static Integer[] listToIntArray(List<Integer> list) {
        // Create an Integer[] of the same size as the list
        Integer[] result = new Integer[list.size()];

        // Fill the Integer[] by unboxing Integer values to int
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i); // unboxing Integer to int
        }

        return result;
    }

    public static int[][] move(int[] tower1, int[] tower2) {
        int tower1Pie = -1;
        int counter = 0;
        for (int part : tower1){
            if (part == 0){
                tower1Pie = counter;
                break;
            }counter+=1;
        }
        if (tower1Pie == -1){
            tower1Pie = tower1.length;
        }
    }
    public static void main(String[] args){
        int[] tower1 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] tower2 = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] tower3 = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[][] towers = {tower1, tower2, tower3};
    }
}
