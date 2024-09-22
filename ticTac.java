import java.util.Scanner;
public class ticTac {
    public static void main(String[] args){
        Scanner inGet = new Scanner(System.in);
        char[][] state = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        char[] xWinRow = {'x', 'x', 'x'};
        boolean xTurn = false;
        boolean comp = false;
        while (!comp){
            boardState(state);
            print("What column is the space you want in?: ");
            int column = inGet.nextInt() - 1;
            print("What row is the space you want in?: ");
            int row = inGet.nextInt() - 1;
            if (xTurn){state[row][column] = 'x';}
            else if (!xTurn){state[row][column] = 'o';}
            boardState(state);
            for (int i = 0; i <= 2; i++)
                if (state[i] == xWinRow){print("Player 2 Wins!"); break;}
        }
        inGet.close();
    }

    public static void boardState(char[][] state){
        int counter = 1;
        for (char[] row : state){
            if (row != state[2]){
                Object char1 = null;
                Object char2 = null;
                Object char3 = null;
                if (row[0] != ' '){char1 = row[0] + "\u0332";}
                else{char1 = '_';}
                if (row[1] != ' '){char2 = row[1] + "\u0332";}
                else{char2 = '_';}
                if (row[2] != ' '){char3 = row[2] + "\u0332";}
                else{char3 = '_';}
                print(char1 + "|" + char2 + "|" + char3 + " " + counter);
            }else{
                char char1 = row[0];
                char char2 = row[1];
                char char3 = row[2];
                print(char1 + "|" + char2 + "|" + char3 + " " + counter);
            }counter += 1;
        }print("1 2 3");
    }
    public static void print(String val){
        System.out.println(val);
    }
}
