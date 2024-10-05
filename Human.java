public abstract class Human {
    private String name;
    private int age;
    private String gender;

    //Constructor
    public Human(String name_, int age_, String gender_){
        this.name = name_;
        this.age = age_;
        this.gender = gender_;
    }

    //Getters
    public String getName(){return name;}
    public int getAge(){return age;}
    public String getGender(){return gender;}

    //Setters
    public void setName(String name_){this.name = name_;}
    public void setAge(int age_){this.age = age_;}
    public void setGender(String gender_){this.gender = gender_;}

    public void DisplayInfo1(){
        System.out.println("Your name is: " + getName() + " |Your age is: " + getAge() + " |Your gender is: " + getGender());
    }

    public abstract void AgePowr2();
}
