package Snake;

public class CornSnake extends Snake{
    private String owner;
    public CornSnake(String owner_, String name_, int age_, int length_, String[] colorPattern_, double speed_, boolean venomous_, String venomType_, double killSpeed_, boolean treeClimb_){
        super(name_, age_, length_, colorPattern_, speed_, venomous_, venomType_, killSpeed_, treeClimb_);
        this.owner = owner_;
    }
    //Getters and Setters
    public String getOwner(){ return owner; }
    public void setOwner(String newOwner){ this.owner = newOwner;}

    @Override
    public Object[] report(){
        //Innitializes the report array
        Object[] rep1 = new Object[1 + 9];
        //Calls 'Snake's report function to reduce code
        Object[] rep2 = super.report();
        //Innitializes the counter
        int counter = 0;
        for (Object part : rep2){
            //Adds the super's report to the report array
            rep1[counter] = part;
            //Adds to the counter
            counter += 1;
        }
        //Adds the owner value
        rep1[9] = super.getName() + "'s owner is " + getOwner();

        return rep1;
    }
}
