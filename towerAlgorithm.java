public class towerAlgorithm {
    public static void main(Integer[][] towers, int target){
        if (target == 2){

        }
    }
    public static Integer[][] fixTowers(Integer[][] towers){
        Integer[][] newTowers = null;
        int biggestPiece = -1;
        for (Integer[] tower : towers){
            if (tower != towers[0]){
                for (int piece : tower){
                    if (piece != 0){
                        if (piece > biggestPiece){
                            biggestPiece = piece;
                        }
                    }
                }
            }
        }
        for (int pie1 = biggestPiece - 1; pie1 > 0; pie1--){
            for (int pie2 = pie1 - 1; pie2 > 0; pie2--){
                for (int pie3 = pie2 - 1; pie3 > 0; pie3--){
                    for (int pie4 = pie3 - 1; pie4 > 0; pie4--){
                        for (int pie5 = pie4 - 1; pie5 > 0; pie5--){
                            for (int pie6 = pie5 - 1; pie6 > 0; pie6--){
                                for (int pie7 = pie6 - 1; pie7 > 0; pie7--){
                                    for (int pie8 = pie7 - 1; pie8 > 0; pie8--){
                                        for (int pie9 = pie8 - 1; pie9 > 0; pie9--){
                
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return newTowers;
    }
}
