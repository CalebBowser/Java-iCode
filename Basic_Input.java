import java.util.Scanner; //Import Scanner Tool

public class Basic_Input{
    public static void main(String[] args){
        //Creating a new in-flow reader to watch for inputs
        Scanner myScanner = new Scanner(System.in);
        System.out.println("what is your name?");
        //                  ^^^^^^^^^^^^^^^^^^
        //Getting the user's response to the ^ question
        String userName = myScanner.nextLine();
        //Greeting the user with inputed name
        System.out.println("Hello " + userName);
        //Closing the scanner so that it doesn't take up memory
        myScanner.close();
    }
}
