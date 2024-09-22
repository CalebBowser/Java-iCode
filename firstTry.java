import java.util.*;
public class firstTry {
    public static void print(Object val){
        System.out.println(val);
    }
    public static Object[][] resetPieceKnowledge(Integer[][] towArr){
        Integer pie1 = -1;
        boolean pie1Access = false;
        Integer pie2 = -1;
        boolean pie2Access = false;
        Integer pie3 = -1;
        boolean pie3Access = false;
        Integer pie4 = -1;
        boolean pie4Access = false;
        Integer pie5 = -1;
        boolean pie5Access = false;
        Integer pie6 = -1;
        boolean pie6Access = false;
        Integer pie7 = -1;
        boolean pie7Access = false;
        Integer pie8 = -1;
        boolean pie8Access = false;
        Integer pie9 = -1;
        boolean pie9Access = false;
        int counter = 0;
        for (int piece : towArr[0]){
            if (piece != 0){
                if (piece == 1){
                    if (pie1 == -1){pie1 = 0; if (towArr[0][towArr[0].length] == piece || towArr[0][counter + 1] == 0){pie1Access = true;}}
                }
                if (piece == 2){
                    if (pie2 == -1){pie2 = 0; if (towArr[0][towArr[0].length] == piece || towArr[0][counter + 1] == 0){pie2Access = true;}}
                }
                if (piece == 3){
                    if (pie3 == -1){pie3 = 0; if (towArr[0][towArr[0].length] == piece || towArr[0][counter + 1] == 0){pie3Access = true;}}
                }
                if (piece == 4){
                    if (pie4 == -1){pie4 = 0; if (towArr[0][towArr[0].length] == piece || towArr[0][counter + 1] == 0){pie4Access = true;}}
                }
                if (piece == 5){
                    if (pie5 == -1){pie5 = 0; if (towArr[0][towArr[0].length] == piece || towArr[0][counter + 1] == 0){pie5Access = true;}}
                }
                if (piece == 6){
                    if (pie6 == -1){pie6 = 0; if (towArr[0][towArr[0].length] == piece || towArr[0][counter + 1] == 0){pie6Access = true;}}
                }
                if (piece == 7){
                    if (pie7 == -1){pie7 = 0; if (towArr[0][towArr[0].length] == piece || towArr[0][counter + 1] == 0){pie7Access = true;}}
                }
                if (piece == 8){
                    if (pie8 == -1){pie8 = 0; if (towArr[0][towArr[0].length] == piece || towArr[0][counter + 1] == 0){pie8Access = true;}}
                }
                if (piece == 9){
                    if (pie9 == -1){pie9 = 0; if (towArr[0][towArr[0].length] == piece || towArr[0][counter + 1] == 0){pie9Access = true;}}
                }
            }
        counter += 1;}
        for (int piece : towArr[1]){
            if (piece != 0){
                if (piece == 1){
                    if (pie1 == -1){pie1 = 1; if (towArr[1][towArr[1].length] == piece || towArr[1][counter + 1] == 0){pie1Access = true;}}
                }
                if (piece == 2){
                    if (pie2 == -1){pie2 = 1; if (towArr[1][towArr[1].length] == piece || towArr[1][counter + 1] == 0){pie2Access = true;}}
                }
                if (piece == 3){
                    if (pie3 == -1){pie3 = 1; if (towArr[1][towArr[1].length] == piece || towArr[1][counter + 1] == 0){pie3Access = true;}}
                }
                if (piece == 4){
                    if (pie4 == -1){pie4 = 1; if (towArr[1][towArr[1].length] == piece || towArr[1][counter + 1] == 0){pie4Access = true;}}
                }
                if (piece == 5){
                    if (pie5 == -1){pie5 = 1; if (towArr[1][towArr[1].length] == piece || towArr[1][counter + 1] == 0){pie5Access = true;}}
                }
                if (piece == 6){
                    if (pie6 == -1){pie6 = 1; if (towArr[1][towArr[1].length] == piece || towArr[1][counter + 1] == 0){pie6Access = true;}}
                }
                if (piece == 7){
                    if (pie7 == -1){pie7 = 1; if (towArr[1][towArr[1].length] == piece || towArr[1][counter + 1] == 0){pie7Access = true;}}
                }
                if (piece == 8){
                    if (pie8 == -1){pie8 = 1; if (towArr[1][towArr[1].length] == piece || towArr[1][counter + 1] == 0){pie8Access = true;}}
                }
                if (piece == 9){
                    if (pie9 == -1){pie9 = 1; if (towArr[1][towArr[1].length] == piece || towArr[1][counter + 1] == 0){pie9Access = true;}}
                }
            }
        }
        for (int piece : towArr[2]){
            if (piece != 0){
                if (piece == 1){
                    if (pie1 == -1){pie1 = 2; if (towArr[2][towArr[2].length] == piece || towArr[2][counter + 1] == 0){pie1Access = true;}}
                }
                if (piece == 2){
                    if (pie2 == -1){pie2 = 2; if (towArr[2][towArr[2].length] == piece || towArr[2][counter + 1] == 0){pie2Access = true;}}
                }
                if (piece == 3){
                    if (pie3 == -1){pie3 = 2; if (towArr[2][towArr[2].length] == piece || towArr[2][counter + 1] == 0){pie3Access = true;}}
                }
                if (piece == 4){
                    if (pie4 == -1){pie4 = 2; if (towArr[2][towArr[2].length] == piece || towArr[2][counter + 1] == 0){pie4Access = true;}}
                }
                if (piece == 5){
                    if (pie5 == -1){pie5 = 2; if (towArr[2][towArr[2].length] == piece || towArr[2][counter + 1] == 0){pie5Access = true;}}
                }
                if (piece == 6){
                    if (pie6 == -1){pie6 = 2; if (towArr[2][towArr[2].length] == piece || towArr[2][counter + 1] == 0){pie6Access = true;}}
                }
                if (piece == 7){
                    if (pie7 == -1){pie7 = 2; if (towArr[2][towArr[2].length] == piece || towArr[2][counter + 1] == 0){pie7Access = true;}}
                }
                if (piece == 8){
                    if (pie8 == -1){pie8 = 2; if (towArr[2][towArr[2].length] == piece || towArr[2][counter + 1] == 0){pie8Access = true;}}
                }
                if (piece == 9){
                    if (pie9 == -1){pie9 = 2; if (towArr[2][towArr[2].length] == piece || towArr[2][counter + 1] == 0){pie9Access = true;}}
                }
            }
        }

        Object[][] result = {{pie1, pie1Access}, {pie2, pie2Access}, {pie3, pie3Access}, {pie4, pie4Access}, {pie5, pie5Access}, {pie6, pie6Access}, {pie7, pie7Access}, {pie8, pie8Access}, {pie9, pie9Access}, };
        return result;
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
        //Random gen = new Random();
        int target = 2;//gen.nextInt(2, 4);
        printTowers(tower1, tower2, tower3);
        print("Target tower chosen is: " + target);
        Integer[][] endResult = new Integer[3][9];
        Map<Integer, Integer[]> towers = new HashMap<>();
        if(tower1.length % 2 != 0){
            if (target == 3){
                //Attempt with a for loop algo
                Integer[] zeroTower = {0, 0, 0, 0, 0, 0, 0, 0, 0};
                Integer[] perfectTower = {9, 8, 7, 6, 5, 4, 3, 2, 1};
                Map<Integer, Integer> dstMap = new HashMap<>();
                Map<Integer, Integer> newDstMap = new HashMap<>();
                Map<Integer, Integer> locMap = new HashMap<>();
                for (int piece : tower1){
                    if (piece % 2 != 0){dstMap.put(piece, 3);}
                    else if(piece % 2 == 0){dstMap.put(piece, 2);}
                    locMap.put(piece, 1);
                }
                towers.put(1, tower1);
                towers.put(2, tower2);
                towers.put(3, tower3);
                for (int mainPiece = 1; mainPiece <= 9; mainPiece++){
                    //Finds the tower the piece is currently in for the move function to work properly becuz ima moron and made it move from tower to tower
                    Integer[] fromTower = towers.get(locMap.get(mainPiece));
                    //Finds the tower that the piece related to pieceNum is scheduled to in the 'dstMap'
                    Integer[] toTower = towers.get(dstMap.get(mainPiece));
                    Integer[][] result = move(fromTower, toTower);
                    print(mainPiece);
                    if (Arrays.equals(towers.get(1), zeroTower)){
                        if (Arrays.equals(towers.get(2), zeroTower)){
                            if (Arrays.equals(towers.get(3), perfectTower)){
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

                    for (int currentPiece = mainPiece - 1; currentPiece > 1; currentPiece--){
                        //Finds the tower the piece is currently in for the move function to work properly becuz ima moron and made it move from tower to tower
                        fromTower = towers.get(locMap.get(currentPiece));
                        //Finds the tower that the piece related to pieceNum is scheduled to in the 'dstMap'
                        toTower = towers.get(dstMap.get(currentPiece));
                        result = move(fromTower, toTower);
                        print(currentPiece);
                        if (towers.get(1) == zeroTower){
                            if (towers.get(2) == zeroTower){
                                if (towers.get(3) == perfectTower){
                                    break;
                                }
                            }
                        }
                        towers.remove(locMap.get(currentPiece));
                        towers.put(locMap.get(currentPiece), result[0]);
                        towers.remove(dstMap.get(currentPiece));
                        towers.put(dstMap.get(currentPiece), result[1]);
                        locMap.remove(currentPiece);
                        locMap.put(currentPiece, dstMap.get(currentPiece));
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
                }
                //Finish the sequence

                endResult[0] = towers.get(1);
                endResult[1] = towers.get(2);
                endResult[2] = towers.get(3);
            }else if (target == 2){
                boolean solved = false;
                Integer[] dstMap = new Integer[9];
                for (int i = 0; i <= dstMap.length; i++){
                    if (i % 2 != 0){
                        dstMap[i] = 2;
                    }else if (i % 2 == 0){
                        dstMap[i] = 3;
                    }
                }
                while (!solved){
                    Integer[][] towArr = {tower1, tower2, tower3};
                    Object[][] result = resetPieceKnowledge(towArr);
                    Object[][] pieces = result;
                    //Integer[][] moveRes = new Integer[2][9];
                    //Object fls = false;
                    Object tru = true;
                    /*Should delete
                    pieces.put(1, result[0]);
                    pieces.put(2, result[1]);
                    pieces.put(3, result[2]);
                    pieces.put(4, result[3]);
                    pieces.put(5, result[4]);
                    pieces.put(6, result[5]);
                    pieces.put(7, result[6]);
                    pieces.put(8, result[7]);
                    pieces.put(9, result[8]);*/
                    int lastPiece = -1;
                    int counter = 1;
                    for (int piece : towArr[0]){
                        if (piece != 0){
                            if (lastPiece != -1){
                                if (piece != lastPiece - 1){
                                    if (piece == counter){
                                        if (pieces[counter - 1][1] == tru){
                                            if (pieces[counter][1] == tru){
                                                move(towArr[(int) pieces[counter - 1][0]], towArr[(int) pieces[counter][0]]);
                                                pieces = resetPieceKnowledge(towArr);
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                            //finish sequence
                            counter += 1;
                            //go thru each tower, in order from t1 to t3, and look for a piece that is either on top of the wrong one, or not on its target tower. Then move and break.
                        }
                    }
                }
                endResult[0] = tower1;
                endResult[1] = tower2;
                endResult[2] = tower3;
            }
        }return endResult;}

    public static Integer[] listToIntArray(List<Integer> list) {
        // Create an Integer[] of the same size as the list
        Integer[] result = new Integer[list.size()];

        // Fill the Integer[] by unboxing Integer values to int
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i); // unboxing Integer to int
        }

        return result;
    }

    public static Integer[][] move(Object[] tower1, Object[] tower2) {
        // Convert Object[] into Integer[] for working with
        // I know that proper coding would be to check if it actually is an instance of Intenger[], but I know that it is.
        Integer[] newTower1 = (Integer[]) tower1;
        Integer[] newTower2 = (Integer[]) tower2;
        // Convert Integer[] to List<Integer> for easier manipulation
        List<Integer> T1 = new ArrayList<>(Arrays.asList(newTower1));
        List<Integer> T2 = new ArrayList<>(Arrays.asList(newTower2));
    
        // Find the topmost piece in newTower1 (the piece to move)
        int piece = 0;
        int topIndexT1 = -1;
        for (int i = T1.size() - 1; i >= 0; i--) {
            if (T1.get(i) != 0) {
                piece = T1.get(i);
                topIndexT1 = i;
                break;
            }
        }
    
        // If no piece found (i.e., newTower1 is empty)
        if (piece == 0) {
            print("You cannot move nothing");
            return new Integer[][]{newTower1, newTower2}; // Return original towers if no piece to move
        }
    
        // Find the first empty spot in newTower2
        int emptyIndexT2 = -1;
        for (int i = 0; i < T2.size()-1; i++) {
            if (T2.get(i) == 0) {
                emptyIndexT2 = i;
                break;
            }
        }
    
        // If newTower2 has no empty space left
        if (emptyIndexT2 == -1) {
            print("You cannot move the piece, destination tower is full");
            return new Integer[][]{newTower1, newTower2};
        }
    
        // Check if the move is valid (can't place a larger piece on a smaller one)
        if (T2.get(emptyIndexT2 + 1) > piece) {
            print("Invalid move: cannot place a larger piece on a smaller piece");
            return new Integer[][]{newTower1, newTower2};
        }
    
        // Perform the move: remove from newTower1 and place in newTower2
        T1.set(topIndexT1, 0); // Remove from top of newTower1
        T2.set(emptyIndexT2, piece); // Place on top of newTower2
    
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
