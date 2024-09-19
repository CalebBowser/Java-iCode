public class ticTac {
    public static void main(String[] args){
        char[][] state = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        boardState(state);
    }

    public static void boardState(char[][] state){
        for (char[] row : state){
            String char1 = row[0] + "\u0332";
            String char2 = row[1] + "\u0332";
            String char3 = row[2] + "\u0332";
            print(char1 + "|" + char2 + "|" + char3);
        }
    }
    public static void print(String val){
        System.out.println(val);
    }
}
