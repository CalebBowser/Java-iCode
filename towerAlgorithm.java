import java.util.*;
public class towerAlgorithm {
    //Simplifing print statement
    public static void print(Object val){
        System.out.println(val);
    }
    public static void printTowers(Integer[] tower1, Integer[] tower2, Integer[] tower3){
        //Telling the user that we are printing towers
        print("\nT T T");
        print("1 2 3\n");
        //print the towers
        for (int i = 1; i <= 9; i++) {
            print(tower1[tower1.length - i] + " " + tower2[tower2.length - i] + " " + tower3[tower3.length - i]);
        }
        //Tell the user that this is the end of the towers
        print("\nT T T");
        print("1 2 3\n");
    }
    public static void printTowers(int[][] towers){
        //Separating out the towers
        int[] tower1 = towers[0];
        int[] tower2 = towers[1];
        int[] tower3 = towers[2];
        //Telling the user that we are printing towers
        print("\nT T T");
        print("1 2 3\n");
        //print the towers
        for (int i = 1; i <= 9; i++) {
            print(tower1[tower1.length - i] + " " + tower2[tower2.length - i] + " " + tower3[tower3.length - i]);
        }
        //Tell the user that this is the end of the towers
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
    public static int[][] solve(int[][] towers){
        //Copies the towers array
        int[][] newTowers = towers;
        //Initializes pieceLoc, which tracks where the pieces are 
        int[] pieceLoc = getPieces(newTowers);
        //Initializes pieceOrder, which tracks which pieces get moved chronologically
        int[] pieceOrder = new int[511];
        //Initializes towerAdders, which tracks how many towers it gets moved to the right
        int[] towerAdders = new int[511];

        // Gets the towerAdders
        

        

        return newTowers;
    }
    public static int getMovablePieceFromTower(int[] tower){
        // Returns -1 if the tower is empty
        int lastPiece = -1;
        //Goes through each piece in the tower
        for (int piece : tower){
            // If the piece is not zero then it resets the lastPiece variable and checks the next piece
            if (piece != 0){
                lastPiece = piece;
            // If the piece is zero then it returns lastPiece, because it was the last non-zero piece
            }else if(piece == 0){
                return lastPiece;
            }
        // Returns the top piece of the tower
        }return lastPiece;
    }
    public static int[] getPieces(int[][] towers){
        int[] pieces = new int[9];
        //Goes through each tower in the array
        for (int i = 0; i < towers.length; i++){
            // Goes through each piece in the tower associated with i
            for (int piece : towers[i]){
                //If the piece is not empty (0) then we bring back the
                //piece number by one to be correct with the array
                //and assign it tower i
                if (piece != 0){
                    pieces[piece - 1] = i;
                }
            }
        }return pieces;
    }
    public static void main(String[] args){
        int[] tower1 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] tower2 = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] tower3 = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[][] towers = {tower1, tower2, tower3};
        //This is a test of both the solve and move functions/methods
        //Random myGen = new Random();
        //for (int i = 0; i < steps.length; i++){
        //    int[] step = new int[2];
        //    int p1 = myGen.nextInt(3);
        //    int p2 = myGen.nextInt(3);
        //    if (p1 != p2){
        //        step[0] = p1;
        //        step[1] = p2;
        //        steps[i] = step;
        //    }
        //}
        towers = solve(towers);
    }
}