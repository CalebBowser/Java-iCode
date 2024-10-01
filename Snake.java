// Access Modifier
// 'class' keyword
// class name
public abstract class Snake {
    // Declare data memebers
    String name;
    int age;
    int length;
    String[] colorPattern;
    double speed;
    boolean venomous;
    String venomType;
    double killSpeed;
    boolean treeClimb;

    // Constructors set up class when created (this 'function' gets called on creation of an instance of 'snake' class)
   public Snake(String name_, int age_, int length_, String[] colorPattern_, double speed_, boolean venomous_, String venomType_, double killSpeed_, boolean treeClimb_){
       // Sets the attributes from the input
       this.name = name_;
       this.age = age_;
       this.length = length_;
       this.colorPattern = colorPattern_;
       this.speed = speed_;
       this.venomous = venomous_;
       this.venomType = venomType_;
       this.killSpeed = killSpeed_;
       this.treeClimb = treeClimb_;
   }

   // Getters and Setters
   public String getName(){ return name; }
   public void setName(String new_name){ this.name = new_name; }
   public int getAge(){ return age; }
   public int getLength(){ return length; }
   public String[] getColorPattern(){ return colorPattern; }
   public double getSpeed(){ return speed; }
   public boolean getVenomous(){ return venomous; }
   public String getVType(){ return venomType; }
   public double getKillSpeed(){ return killSpeed; }
   public boolean getClimb(){ return treeClimb; }

   // Custom methods
   public Object[] report()
   {
       // Create the report value holder
       Object[] reportText = new Object[9];
       // Add the values and how they will be printed
       reportText[0] = "The snake's name is " + getName() + '.';
       reportText[1] = "It is " + String.valueOf(getAge()) + " years old.";
       reportText[2] = "It is " + String.valueOf(getLength()) + " centimeters long.";
       reportText[3] = getColorPattern();
       reportText[4] = "It moves at " + String.valueOf(getSpeed()) + "m/s.";
       reportText[5] = "Is it venomous?: " + String.valueOf(getVenomous()) + ".";
       reportText[6] = "It uses a venom type of " + getVType() + ".";
       reportText[7] = "When you are bitten you have " + String.valueOf(getKillSpeed()) + " hours to live.";
       reportText[8] = "Can it climb trees?: " + String.valueOf(getClimb()) + ".";
       return reportText;
   }

    // Main function for testing
    public static void main(String[] args)
    {
        // Creates the array to pass to the snake constructor
        String[] colorPattern = {"red", "blue", "orange"};
        // Create an class-object (instance) of the snake class
        Snake mySnake = new Snake("Mr. Cheese", 30, 200, colorPattern, 10, true, "Neurotoxin", 0.12, false){};
        // Goes through everything in the report
        for (Object part : mySnake.report()){
            // Checks if the part of the report is a String array, which would mean that it is the color pattern
            if (part instanceof String[]){
                // Casting the now known String[] Object part to the new variable colors
                String[] colors = (String[]) part;
                System.out.println("It is;");
                for (String color : colors){
                    // Printing out each color
                    System.out.println(color);
                }
                System.out.println("colors.");
            // Checks if the part is instead a String
            }else if (part instanceof String){
                // Prints out that part of the report
                System.out.println(part);
            }
        }
    }
}
