import java.util.Scanner;
public class log {
    public static void main(String[] args) {
        Scanner inner = new Scanner(System.in);
        String stop = "no";
        while (stop == "no"){
            System.out.println("What would like to log?: ");
            int getLog = inner.nextInt();
            System.out.println(getLog^2^-2);
            System.out.println("Would you like another log?:");
            String decide = inner.nextLine();
            if (decide != "Y" || decide != "y"){
                stop = "yes";
            }
        }
        inner.close();
    }
}
