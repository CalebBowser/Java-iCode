import java.util.Scanner; //Import Scanner Tool

public class Basic_Input{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("what is your name?");

        String userName = myScanner.nextLine();
        System.out.println("Hello " + userName);

        myScanner.close();
    }
}
