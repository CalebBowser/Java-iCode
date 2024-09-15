import java.util.*;
public class hanoiTower {
    public static void print(Object val){
        System.out.println(val);
    }

    public static int[][] compSolve(int[] tower1, int[] tower2, int[] tower3){
        Random gen = new Random();
        int target = gen.nextInt(2, 4);
        printTowers(tower1, tower2, tower3);
        print("Target tower chosen is: " + target);
        int[][] endResult = new int[3][9];
        if (tower1.length % 2 == 0){
            if (target == 3){
                move(tower1, tower2);
                printTowers(tower1, tower2, tower3);
                //Finish the sequence

                endResult[0] = tower1;
                endResult[1] = tower2;
                endResult[2] = tower3;
            }
        }else if(tower1.length % 2 != 0){
            if (target == 3){
                int[][] result = move(tower1, tower3);
                tower1 = result[0];
                tower3 = result[1];
                printTowers(tower1, tower2, tower3);
                //Finish the sequence

                endResult[0] = tower1;
                endResult[1] = tower2;
                endResult[2] = tower3;
            }else if (target == 2){
                int[][] result = move(tower1, tower2);
                tower1 = result[0];
                tower3 = result[1];
                printTowers(tower1, tower2, tower3);
                //Finish the sequence

                endResult[0] = tower1;
                endResult[1] = tower2;
                endResult[2] = tower3;
            }
        }
        return endResult;
    }

    public static void printTowers(int[] tower1, int[] tower2, int[] tower3){
        print("\nT T T");
        print("1 2 3\n");
        for (int i = 1; i <= 9; i++) {
            print(tower1[tower1.length - i] + " " + tower2[tower2.length - i] + " " + tower3[tower3.length - i]);
        }
        print("\nT T T");
        print("1 2 3\n");
    }

    public static int[] listToIntArray(List<Integer> list) {
        // Create an int[] of the same size as the list
        int[] result = new int[list.size()];

        // Fill the int[] by unboxing Integer values to int
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i); // unboxing Integer to int
        }

        return result;
    }

    public static int[][] move(int[] tower1, int[] tower2) {
        // Convert int[] to List<Integer>
        List<Integer> T1 = new ArrayList<>();
        for (int i : tower1) {
            T1.add(i);
        }

        List<Integer> T2 = new ArrayList<>();
        for (int i : tower2) {
            T2.add(i);
        }

        // Move piece
        int piece = tower1[tower1.length - 1];
        if (piece != 0) {
            T1.remove(T1.size() - 1);
            T1.add(0); // Assuming the move removes the piece from the end

            boolean placed = false;
            int counter = T2.size() - 1;
            while (!placed) {
                if (T2.get(counter) != 0) {
                    T2.set(counter + 1, piece);
                    placed = true;
                }else if (counter == 0){
                    T2.set(counter, piece);
                    placed = true;
                }else {
                    counter -= 1;
                }
            }

            // Convert List<Integer> back to int[]
            int[] newT1 = listToIntArray(T1);
            int[] newT2 = listToIntArray(T2);

            return new int[][]{newT1, newT2};
        } else {
            System.out.println("You cannot move nothing");
            return new int[][]{tower1, tower2}; // Return original towers if no move
        }
    }
    public static void main(String[] args){
        int[] tower1 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] tower2 = new int[9];
        int[] tower3 = new int[9];

        Scanner lstnr = new Scanner(System.in);
        print("Do you want the computer to solve? Y/n: ");
        char[] comp = lstnr.nextLine().toCharArray();
        print("We are going to solve the Hanoi Tower puzzle!");
        print("The rules are;\nThat you cannot move more than one piece at once\nYou cannot stack a bigger piece ontop of a smaller piece.\nThe goal is to move the whole tower in order to another tower.");
        print("\nGO!!!\n");
        long startTime = System.currentTimeMillis();
        //Code here ↓↓↓
        if (comp[0] == 'Y' || comp[0] == 'y'){
            print("Computer will solve the puzzle");
            //Computer solve
            int[][] result = compSolve(tower1, tower2, tower3);
            tower1 = result[0];
            tower2 = result[1];
            tower3 = result[2];
            
        }
        //Code here ↑↑↑
        printTowers(tower1, tower2, tower3);
        print("Congrats! You did it. Your time was: " + (System.currentTimeMillis() - startTime));
        lstnr.close();
    }
}
