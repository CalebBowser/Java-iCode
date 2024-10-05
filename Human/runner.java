package Human;
public class runner {
    public static void main(String[] args){
        smallChild myChild = new smallChild(true, true, "Thomas the Tank Engine", "Appache Attack Helicopter", "opera singer", 465, "brown", "pasta", "Outer Space");
        String[] babyRep = myChild.report();
        for (String part : babyRep){
            System.out.println(part);
        }
        myChild.Scream();

        teen myTeen = new teen(true, false, "goober", "Starbucks Barista", 15, "Black", "ramen", "P A I N");
        String[] teenRep = myTeen.report();
        for (String part : teenRep){
            System.out.println(part);
        }
        myTeen.failCheck(5);
    }
}
