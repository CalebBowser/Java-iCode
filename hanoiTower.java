import java.util.*;
public class hanoiTower {
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

    public static Integer[][] compSolve(Integer[] tower1, Integer[] tower2, Integer[] tower3){
        Random gen = new Random();
        int target = 3;//gen.nextInt(2, 4);
        printTowers(tower1, tower2, tower3);
        print("Target tower chosen is: " + target);
        Integer[][] endResult = new Integer[3][9];
        if (tower1.length % 2 == 0){
            if (target == 3){
                //Do it later when adding player-defined tower height
            }
        }else if(tower1.length % 2 != 0){
            if (target == 3){
                //int[][] result = move(tower1, tower3);
                //tower1 = result[0];
                //tower3 = result[1];
                //printTowers(tower1, tower2, tower3);
                //result = move(tower1, tower2);
                //tower1 = result[0];
                //tower2 = result[1];
                //printTowers(tower1, tower2, tower3);
                //result = move(tower3, tower2);
                //tower3 = result[0];
                //tower2 = result[1];
                //printTowers(tower1, tower2, tower3);
                //Attempt with a for loop algo
                Integer[] zeroTower = {0, 0, 0, 0, 0, 0, 0, 0, 0};
                Integer[] perfectTower = {9, 8, 7, 6, 5, 4, 3, 2, 1};
                Map<Integer, Integer> dstMap = new HashMap<>();
                Map<Integer, Integer> newDstMap = new HashMap<>();
                Map<Integer, Integer> locMap = new HashMap<>();
                //Map<Integer, Integer> moveNum = new HashMap<>();

                /* m(p) = 2p + 1
                 * m = number of moves
                 * p = number of pieces you want to move
                 * 
                 * this is the formula for the chart down below
                 * Keys: p
                 * Values: m(p)
                 * 
                 * p | m(p)
                 * _________
                 * 1 | 1
                 * 2 | 3
                 * 3 | 7
                 * 4 | 15
                 * 5 | 31
                 * 6 | 63
                 * 7 | 127
                 * 8 | 255
                 * 9 | 511
                 * ...
                 */

                /* I commented this bit out becuz i don't know how it would help me

                moveNum.put(1, 1);
                moveNum.put(2, 3);
                moveNum.put(3, 7);
                moveNum.put(4, 15);
                moveNum.put(5, 31);
                moveNum.put(6, 63);
                moveNum.put(7, 127);
                moveNum.put(8, 255);
                moveNum.put(9, 511);
                */
                for (int piece : tower1){
                    if (piece % 2 != 0){dstMap.put(piece, 3);}
                    else if(piece % 2 == 0){dstMap.put(piece, 2);}
                    locMap.put(piece, 1);
                }
                Map<Integer, Integer[]> towers = new HashMap<>();
                towers.put(1, tower1);
                towers.put(2, tower2);
                towers.put(3, tower3);
                int currentPiece = 1;
                int mainPiece = 1;
                while(mainPiece <= 9) {
                    currentPiece = mainPiece;
                    //Finds the tower the piece is currently in for the move function to work properly becuz ima moron and made it move from tower to tower
                    Integer[] fromTower = towers.get(locMap.get(mainPiece));
                    //Finds the tower that the piece related to pieceNum is scheduled to in the 'dstMap'
                    Integer[] toTower = towers.get(dstMap.get(mainPiece));
                    Integer[][] result = move(fromTower, toTower);
                    if (towers.get(1) == zeroTower){
                        if (towers.get(2) == zeroTower){
                            if (towers.get(3) == perfectTower){
                                break;
                            }
                        }
                    }
                    towers.remove(locMap.get(mainPiece));
                    towers.put(locMap.get(mainPiece), result[0]);
                    towers.remove(dstMap.get(mainPiece));
                    towers.put(dstMap.get(mainPiece), result[1]);
                    locMap.remove(mainPiece);
                    locMap.put(mainPiece, dstMap.get(mainPiece));
                    printTowers(towers.get(1), towers.get(2), towers.get(3));
                    for (int part : towers.get(1)){
                        if (part != 0){
                            if (part % 2 != 0){newDstMap.put(part, 3);}
                            else if(part % 2 == 0){newDstMap.put(part, 2);}
                            }
                        }
                    for (int part : towers.get(2)){
                        if (part != 0){
                            if (part < 9){
                                if (locMap.get(part + 1) == 1){
                                    newDstMap.put(part, 0);
                                }else{
                                    newDstMap.put(part, locMap.get(part+1));
                                }
                            }else if (part == 9){
                                newDstMap.put(part, 3);
                            }
                        }
                    }
                    for (int part : towers.get(3)){
                        if (part != 0){
                                if (part == 9){

                                }
                            }
                        }
                    }
            
            
                    for (int i = mainPiece; i>0;i--){
                        
                    }
                //Finish the sequence

                endResult[0] = towers.get(1);
                endResult[1] = towers.get(2);
                endResult[2] = towers.get(3);
            }else if (target == 2){
                //int[][] result = move(tower1, tower2);
                //tower1 = result[0];
                //tower2 = result[1];
                //printTowers(tower1, tower2, tower3);
                //result = move(tower1, tower3);
                //tower1 = result[0];
                //tower3 = result[1];
                //printTowers(tower1, tower2, tower3);
                //result = move(tower2, tower3);
                //tower2 = result[0];
                //tower3 = result[1];
                //printTowers(tower1, tower2, tower3);
                //Finish the sequence

                endResult[0] = tower1;
                endResult[1] = tower2;
                endResult[2] = tower3;
            }
        }
        return endResult;
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

    public static Integer[][] move(Integer[] tower1, Integer[] tower2) {
        // Convert Integer[] to List<Integer> for easier manipulation
        List<Integer> T1 = new ArrayList<>(Arrays.asList(tower1));
        List<Integer> T2 = new ArrayList<>(Arrays.asList(tower2));
    
        // Find the topmost piece in tower1 (the piece to move)
        int piece = 0;
        int topIndexT1 = -1;
        for (int i = T1.size() - 1; i >= 0; i--) {
            if (T1.get(i) != 0) {
                piece = T1.get(i);
                topIndexT1 = i;
                break;
            }
        }
    
        // If no piece found (i.e., tower1 is empty)
        if (piece == 0) {
            print("You cannot move nothing");
            return new Integer[][]{tower1, tower2}; // Return original towers if no piece to move
        }
    
        // Find the first empty spot in tower2
        int emptyIndexT2 = -1;
        for (int i = 0; i < T2.size()-1; i++) {
            if (T2.get(i) == 0) {
                emptyIndexT2 = i;
                break;
            }
        }
    
        // If tower2 has no empty space left
        if (emptyIndexT2 == -1) {
            print("You cannot move the piece, destination tower is full");
            return new Integer[][]{tower1, tower2};
        }
    
        // Check if the move is valid (can't place a larger piece on a smaller one)
        if (T2.get(emptyIndexT2 + 1) > piece) {
            print("Invalid move: cannot place a larger piece on a smaller piece");
            return new Integer[][]{tower1, tower2};
        }
    
        // Perform the move: remove from tower1 and place in tower2
        T1.set(topIndexT1, 0); // Remove from top of tower1
        T2.set(emptyIndexT2, piece); // Place on top of tower2
    
        // Convert List<Integer> back to Integer[] arrays
        Integer[] newT1 = listToIntArray(T1);
        Integer[] newT2 = listToIntArray(T2);
    
        return new Integer[][]{newT1, newT2};
    }

        public static void main(String[] args){
        Integer[] tower1 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        Integer[] tower2 = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        Integer[] tower3 = {0, 0, 0, 0, 0, 0, 0, 0, 0};

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
            Integer[][] result = compSolve(tower1, tower2, tower3);
            tower1 = result[0];
            tower2 = result[1];
            tower3 = result[2];
            
        }
        //Code here ↑↑↑
        print("Completed Tower!");
        printTowers(tower1, tower2, tower3);
        print("Congrats! You did it. Your time was: " + (System.currentTimeMillis() - startTime));
        lstnr.close();
    }
}
