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
    public static void solve(Integer[][] towers, int target){
        if (target == 2){
            Integer[] pieLoc = new Integer[9];
            for (Integer[] tower : towers){
                for (int pie : tower){
                    if (tower == towers[0]){
                        if (pie != 0){
                            pieLoc[pie - 1] = 0;
                        }
                    }else if (tower == towers[1]){
                        if (pie != 0){
                            pieLoc[pie - 1] = 1;
                        }
                    }else if (tower == towers[2]){
                        if (pie != 0){
                            pieLoc[pie - 1] = 2;
                        }
                    }
                }
            }
            for (int pie : pieLoc){print(pie);}
            Integer[] dstMap = new Integer[9];
            for (int pie = 9; pie > 0; pie--){
                if (pie % 2 != 0){
                    dstMap[pie - 1] = 1;
                }else if (pie % 2 == 0){
                    dstMap[pie - 1] = 2;
                }
            }
            for (int pie : dstMap){print(pie);}
            for (int pie : towers[0]){
                Integer[][] result = move(towers[pieLoc[pie -1]], towers[dstMap[pie -1]]);
                towers[pieLoc[pie - 1]] = result[0];
                towers[dstMap[pie - 1]] = result[1];
                printTowers(towers[0], towers[1], towers[2]);
                towers = fixTowers(towers);
            }
        }
    }
    public static Integer[][] fixTowers(Integer[][] towers){
        int biggestPiece = -1;
        int p1loc = -1;
        int p2loc = -1;
        int p3loc = -1;
        int p4loc = -1;
        int p5loc = -1;
        int p6loc = -1;
        int p7loc = -1;
        int p8loc = -1;
        int p9loc = -1;
        for (Integer[] tower : towers){
            if (tower != towers[0]){
                for (int piece : tower){
                    if (piece != 0){
                        if (piece > biggestPiece){
                            biggestPiece = piece;
                        }
                    }
                }
            }if (tower == towers[0]){
                for (int piece : tower){
                    if (piece != 0){
                        if (piece == 1){
                            if (p1loc == -1){p1loc = 0;}}
                            
                        else if (piece == 2){
                            if (p2loc == -1){p2loc = 0;}}
                            
                        else if (piece == 3){
                            if (p3loc == -1){p3loc = 0;}}
                            
                        else if (piece == 4){
                            if (p4loc == -1){p4loc = 0;}}
                            
                        else if (piece == 5){
                            if (p5loc == -1){p5loc = 0;}}
                            
                        else if (piece == 6){
                            if (p6loc == -1){p6loc = 0;}}
                            
                        else if (piece == 7){
                            if (p7loc == -1){p7loc = 0;}}
                            
                        else if (piece == 8){
                            if (p8loc == -1){p8loc = 0;}}
                            
                        else if (piece == 9){
                            if (p9loc == -1){p9loc = 0;}}
                    }
                }
            }else if (tower == towers[1]){
                for (int piece : tower){
                    if (piece != 0){
                        if (piece == 1){
                            if (p1loc == -1){p1loc = 1;}}
                            
                        else if (piece == 2){
                            if (p2loc == -1){p2loc = 1;}}
                            
                        else if (piece == 3){
                            if (p3loc == -1){p3loc = 1;}}
                            
                        else if (piece == 4){
                            if (p4loc == -1){p4loc = 1;}}
                            
                        else if (piece == 5){
                            if (p5loc == -1){p5loc = 1;}}
                            
                        else if (piece == 6){
                            if (p6loc == -1){p6loc = 1;}}
                            
                        else if (piece == 7){
                            if (p7loc == -1){p7loc = 1;}}
                            
                        else if (piece == 8){
                            if (p8loc == -1){p8loc = 1;}}
                            
                        else if (piece == 9){
                            if (p9loc == -1){p9loc = 1;}}
                    }
                }
            }else if (tower == towers[2]){
                for (int piece : tower){
                    if (piece != 0){
                        if (piece == 1){
                            if (p1loc == -1){p1loc = 2;}}
                            
                        else if (piece == 2){
                            if (p2loc == -1){p2loc = 2;}}
                            
                        else if (piece == 3){
                            if (p3loc == -1){p3loc = 2;}}
                            
                        else if (piece == 4){
                            if (p4loc == -1){p4loc = 2;}}
                            
                        else if (piece == 5){
                            if (p5loc == -1){p5loc = 2;}}
                            
                        else if (piece == 6){
                            if (p6loc == -1){p6loc = 2;}}
                            
                        else if (piece == 7){
                            if (p7loc == -1){p7loc = 2;}}
                            
                        else if (piece == 8){
                            if (p8loc == -1){p8loc = 2;}}
                            
                        else if (piece == 9){
                            if (p9loc == -1){p9loc = 2;}}
                    }
                }
            }
        }
        Integer[] pieLocs = {null, p1loc, p2loc, p3loc, p4loc, p5loc, p6loc, p7loc, p8loc, p9loc};
        for (Object loc : pieLocs){
            print(loc);
        }
        // Add functions that have logic for 9↓, 8↓, 7↓, 6↓, 5↓, 4↓, 3↓, 2↓, 1↓
        for (int pie1 = biggestPiece - 1; pie1 > 0; pie1--){
            for (int pie2 = pie1 - 1; pie2 > 0; pie2--){
                for (int pie3 = pie2 - 1; pie3 > 0; pie3--){
                    for (int pie4 = pie3 - 1; pie4 > 0; pie4--){
                        for (int pie5 = pie4 - 1; pie5 > 0; pie5--){
                            for (int pie6 = pie5 - 1; pie6 > 0; pie6--){
                                for (int pie7 = pie6 - 1; pie7 > 0; pie7--){
                                    for (int pie8 = pie7 - 1; pie8 > 0; pie8--){
                                        for (int pie9 = pie8 - 1; pie9 > 0; pie9--){
                                            if (pieLocs[pie8] != 0 && pieLocs[pie9] >= 0){
                                                Integer[][] result = move(towers[pieLocs[pie9]], towers[pieLocs[pie8]]);
                                                towers[pieLocs[pie9]] = result[0];
                                                towers[pieLocs[pie8]] = result[1];
                                                printTowers(towers[0], towers[1], towers[2]);
                                            }
                                        }
                                        if (pieLocs[pie7] != 0 && pieLocs[pie8] >= 0){
                                            Integer[][] result = move(towers[pieLocs[pie8]], towers[pieLocs[pie7]]);
                                            towers[pieLocs[pie8]] = result[0];
                                            towers[pieLocs[pie7]] = result[1];
                                            printTowers(towers[0], towers[1], towers[2]);
                                        }
                                    }
                                    if (pieLocs[pie6] != 0 && pieLocs[pie7] >= 0){
                                        Integer[][] result = move(towers[pieLocs[pie7]], towers[pieLocs[pie6]]);
                                        towers[pieLocs[pie7]] = result[0];
                                        towers[pieLocs[pie6]] = result[1];
                                        printTowers(towers[0], towers[1], towers[2]);
                                    }
                                }
                                if (pieLocs[pie5] != 0 && pieLocs[pie6] >= 0){
                                    Integer[][] result = move(towers[pieLocs[pie6]], towers[pieLocs[pie5]]);
                                    towers[pieLocs[pie6]] = result[0];
                                    towers[pieLocs[pie5]] = result[1];
                                    printTowers(towers[0], towers[1], towers[2]);
                                }
                            }
                            if (pieLocs[pie4] != 0 && pieLocs[pie5] >= 0){
                                Integer[][] result = move(towers[pieLocs[pie5]], towers[pieLocs[pie4]]);
                                towers[pieLocs[pie5]] = result[0];
                                towers[pieLocs[pie4]] = result[1];
                                printTowers(towers[0], towers[1], towers[2]);
                            }
                        }
                        if (pieLocs[pie3] != 0 && pieLocs[pie4] >= 0){
                            Integer[][] result = move(towers[pieLocs[pie4]], towers[pieLocs[pie3]]);
                            towers[pieLocs[pie4]] = result[0];
                            towers[pieLocs[pie3]] = result[1];
                            printTowers(towers[0], towers[1], towers[2]);
                        }
                    }
                    if (pieLocs[pie2] != 0 && pieLocs[pie3] >= 0){
                        Integer[][] result = move(towers[pieLocs[pie3]], towers[pieLocs[pie2]]);
                        towers[pieLocs[pie3]] = result[0];
                        towers[pieLocs[pie2]] = result[1];
                        printTowers(towers[0], towers[1], towers[2]);
                    }
                }
                if (pieLocs[pie1] != 0 && pieLocs[pie2] >= 0){
                    Integer[][] result = move(towers[pieLocs[pie2]], towers[pieLocs[pie1]]);
                    towers[pieLocs[pie2]] = result[0];
                    towers[pieLocs[pie1]] = result[1];
                    printTowers(towers[0], towers[1], towers[2]);
                }
            }
            if (pieLocs[biggestPiece] != 0 && pieLocs[pie1] >= 0){
                Integer[][] result = move(towers[pieLocs[pie1]], towers[pieLocs[biggestPiece]]);
                towers[pieLocs[pie1]] = result[0];
                towers[pieLocs[biggestPiece]] = result[1];
                printTowers(towers[0], towers[1], towers[2]);
            }
        }
        return towers;
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
        if (emptyIndexT2 != 0){
            if (T2.get(emptyIndexT2 - 1) <= piece && T2.get(emptyIndexT2 - 1) != 0) {
                print("Invalid move: cannot place a larger piece on a smaller piece");
                return new Integer[][]{newTower1, newTower2};
            }
        }else if (emptyIndexT2 == 0){
            if (T2.get(emptyIndexT2) <= piece && T2.get(emptyIndexT2) != 0) {
                print("Invalid move: cannot place a larger piece on a smaller piece");
                return new Integer[][]{newTower1, newTower2};
            }
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
        Integer[][] towers = {{9, 8, 7, 6, 5, 4, 3, 2, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0}};
        solve(towers, 2);
        
    }
}
