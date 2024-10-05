package Human;

public abstract class Human {
    private String gender;
    private String job;
    private int age;
    private String faveColor;
    private String faveFood;
    private String countryOfOrigin;

    // Constructor for the Human abstract class
    public Human(String gender_, String job_, int age_, String faveColor_, String faveFood_, String countryOfOrigin_){
        this.gender = gender_;
        this.job = job_;
        this.age = age_;
        this.faveColor = faveColor_;
        this.faveFood = faveFood_;
        this.countryOfOrigin = countryOfOrigin_;
    }

    // Attribute Getters
    public String getGender(){ return gender; }
    public String getJob(){ return job; }
    public int getAge(){ return age; }
    public String getFaveColor(){ return faveColor; }
    public String getFaveFood(){ return faveFood; }
    public String getCountryOfOrigin(){ return countryOfOrigin; }

    // Report
    public String[] report(){
        String[] repText = new String[6];
        repText[0] = "I am a " + getGender() + ".";
        repText[1] = "My occupation is " + getJob() + ".";
        repText[2] = "I am " + String.valueOf(getAge()) + " years old.";
        repText[3] = "My favorite color " + getFaveColor() + ".";
        repText[4] = "My favorite food is " + getFaveFood() + ".";
        repText[5] = "I am from " + getCountryOfOrigin() + ".";

        return repText;
    }
}
