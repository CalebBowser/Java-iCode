public class ticTac {
    public static void main(String[] args){
        char[][] state = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        boardState(state);
    }

    public static void boardState(char[][] state){
        for (char[] row : state){
            Object char1 = null;
            Object char2 = null;
            Object char3 = null;
            if (row[0] != ' '){char1 = row[0] + "\u0332";}
            else{char1 = '_';}
            if (row[1] != ' '){char2 = row[1] + "\u0332";}
            else{char2 = '_';}
            if (row[2] != ' '){char3 = row[2] + "\u0332";}
            else{char3 = '_';}
            print(char1 + "|" + char2 + "|" + char3);
        }
    }
    public static void print(String val){
        System.out.println(val);
    }
}
