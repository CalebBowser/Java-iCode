package Snake;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner colorGetter = new Scanner(System.in);
        String[] colors = new String[10];
        for (int i = 0; i <= colors.length; i++){
            System.out.println("What colors do you want the snake to be?:");
            colors[i] = colorGetter.nextLine();
        }
        CornSnake myBoi = new CornSnake("Hunter", "Captain Boi", 2, 75, colors, 2, false, "N/A", 0, true);
        myBoi.repReader(myBoi.report());
        colorGetter.close();
    }
}
