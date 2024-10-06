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
    public static void printTowers(int[][] towers){
        int[] tower1 = towers[0];
        int[] tower2 = towers[1];
        int[] tower3 = towers[2];
        print("\nT T T");
        print("1 2 3\n");
        for (int i = 1; i <= 9; i++) {
            print(tower1[tower1.length - i] + " " + tower2[tower2.length - i] + " " + tower3[tower3.length - i]);
        }
        print("\nT T T");
        print("1 2 3\n");
    }
    public static int[][] move(int[] tower1, int[] tower2) {
        //Finding location of the piece being moved
        int tower1Pie = -1;
        int counter = 0;
        for (int part : tower1){
            if (part == 0){
                tower1Pie = counter - 1;
                break;
            }counter+=1;
        }
        if (tower1Pie == -1){
            tower1Pie = tower1.length - 1;
        }
        //Finding where to put the piece
        int tower2Pie = -1;
        counter = 0;
        for (int part : tower2){
            if (part == 0){
                tower2Pie = counter;
                break;
            }counter += 1;
        }
        if (tower2Pie == -1){
            print("There is no space in the target tower!");
            int[][] towers = {tower1, tower2};
            return towers;
        }
        //Checking if piece bigger than what will be below it
        if (tower2Pie != 0){
            if (tower1[tower1Pie] > tower2[tower2Pie - 1]){
                print("You cannot put a bigger piece onto a smaller piece!");
                int[][] towers = {tower1, tower2};
                return towers;
            }
        }
        //Doing the move
        int[] T1 = tower1;
        int[] T2 = tower2;
        int piece = T1[tower1Pie];
        T2[tower2Pie] = piece;
        T1[tower1Pie] = 0;
        int[][] towers = {T1, T2};
        return towers;
    }
    public static void main(String[] args){
        int[] tower1 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] tower2 = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] tower3 = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[][] towers = {tower1, tower2, tower3};
        //This is a test of the move function
        int[][] result = move(tower1, tower2);
        towers[0] = result[0];
        towers[1] = result[1];
        printTowers(towers);
    }
}
