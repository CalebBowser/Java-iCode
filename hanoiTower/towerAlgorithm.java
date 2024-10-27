import java.util.*;
import java.io.*;
import javax.sound.sampled.*;
public class towerAlgorithm {
    //Simplifing print statement
    public static void print(Object val){
        System.out.println(val);
    }
    public static void printArray(int[] array){
        for (int part : array){
            print(part);
        }
    }
    public static void printArray(String[] array){
        for (String part : array){
            print(part);
        }
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
    public static int[][] solve(int[][] steps, int[][] towers){
        //Copies the towers array
        int[][] newTowers = towers;
        //Goes through each step
        for (int[] step : steps){
            //Checks to see if the step is empty
            if (!Arrays.equals(step, new int[2])){
                // Creates variables to hold the towers
                int t1 = getTowerFromPiece(step[0], newTowers);
                int t2 = (t1 + step[1]) % 3;
                // Do the move
                int[][] result = move(newTowers[t1], newTowers[t2]);
                // Updates the towers
                newTowers[t1] = result[0];
                newTowers[t2] = result[1];
                // Prints the new towers
                printTowers(newTowers);
            }
        }

        return newTowers;
    }
    public static int getTowerFromPiece(int piece, int[][] towers){
        // Returns the tower that the piece is present in
        int tNum = -1;
        for (int[] tower : towers){
            for (int pie : tower){
                if (pie == piece){
                    return (tNum + 1);
                }
            }tNum += 1;
        }return -1;
    }
    public static int[][] getSteps(int[][] towers){
        // Innitializes the lists that will be used
        int[][] steps = new int[511][2];
        int[] partMove = new int[511];
        int[] stepAdders = new int[511];
        // Creates the stepAdders list
        for (int i = 0; i < stepAdders.length; i++){
            // Adders
            // 121 1 121 2 121 1 121  1  121 1 121 2 121 1 121  2  121 1 121 2 121 1 121  1  121 1 121 2 121 1 121 ...
            // Parts
            // 121 3 121 4 121 3 121  5  121 3 121 4 121 3 121  6  121 3 121 4 121 3 121  5  121 3 121 4 121 3 121 ...
            // See the connection?
            // The adder tells it how much to move to the right
            // Every multiple of four is either a one or a two
            // 121's
            if ((i + 1) % 4 == 1){stepAdders[i] = 1;}
            else if ((i + 1) % 4 == 2){stepAdders[i] = 2;}
            else if ((i + 1) % 4 == 3){stepAdders[i] = 1;}
            // 1's and 2's
            else if (((i + 1) / 4) % 2 == 1){stepAdders[i] = 1;}
            else if (((i + 1) / 8) % 2 == 1){stepAdders[i] = 2;}
            else if (((i + 1) / 16) % 2 == 1){stepAdders[i] = 1;}
            else if (((i + 1) / 32) % 2 == 1){stepAdders[i] = 2;}
            else if (((i + 1) / 64) % 2 == 1){stepAdders[i] = 1;}
            else if (((i + 1) / 128) % 2 == 1){stepAdders[i] = 2;}
            else if (((i + 1) / 256) % 2 == 1){stepAdders[i] = 1;}
            
        }// Creates the partMove list
        for (int i = 0; i < partMove.length; i++){
            // This doesn't make sense either, but here is what I am going for,
            // 121 3 121 4 121 3 121 5 121 3 121 4 121 3 121 6...
            // 121's
            if ((i + 1) % 4 == 1){partMove[i] = 1;}
            else if ((i + 1) % 4 == 2){partMove[i] = 2;}
            else if ((i + 1) % 4 == 3){partMove[i] = 1;}
            // 3's, 4's, 5's, 6's, 7's, 8's, & the 9
            // You can tell by what is being assigned in the 'then' block
            else if (((i + 1) / 4) % 2 == 1){partMove[i] = 3;}
            else if (((i + 1) / 8) % 2 == 1){partMove[i] = 4;}
            else if (((i + 1) / 16) % 2 == 1){partMove[i] = 5;}
            else if (((i + 1) / 32) % 2 == 1){partMove[i] = 6;}
            else if (((i + 1) / 64) % 2 == 1){partMove[i] = 7;}
            else if (((i + 1) / 128) % 2 == 1){partMove[i] = 8;}
            else if (((i + 1) / 256) % 2 == 1){partMove[i] = 9;}
        }// Creates the steps list
        for (int i = 0; i < steps.length; i++){
            // Assembles the step
            int[] step = {partMove[i], stepAdders[i]};
            //Places it in the array
            steps[i] = step;
        }
        for (int[] step : steps){
            print('(' + String.valueOf(step[0]) + ',' + String.valueOf(step[1]) + ')');
        }
        return steps;
    }
    public static void main(String[] args){
        // Innitializes the towers
        int[] tower1 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] tower2 = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] tower3 = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[][] towers = {tower1, tower2, tower3};
        // Gets the steps, and runs them through the solve
        int[][] steps = getSteps(towers);
        towers = solve(steps, towers);
        printTowers(towers);
        print("Yay, I did it");
        File ungodlyNoise = new File("D:/BlackBelt/hanoiTower/scream.wav");
        if (!ungodlyNoise.exists()){
            char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
            for (char letter : alphabet){
                ungodlyNoise = new File(letter + ":/BlackBelt/hanoiTower/scream.wav");
                if (ungodlyNoise.exists()){
                    break;
                }
            }
        }
        try{
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(ungodlyNoise));
            clip.start();
            Thread.sleep(clip.getMicrosecondLength()/1000);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
