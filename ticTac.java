public class ticTac {
    public static void main(String[] args){
        
    }

    public static void boardState(String[][] state){
        for (String[] row : state){
            print(row[0] + "|" + row[1] + "|" + row[2]);
        }
    }
    public static void print(String val){
        System.out.println(val);
    }
}
