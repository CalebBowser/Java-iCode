public class EthClass extends Human {
    private String race;
    private String haircolor;

    public EthClass(String race, String haircolor, String name, int age, String gender){
        super(name, age, gender);
        this.race = race;
        this.haircolor = haircolor;
    }

    public String getRace() {
        return race;
    }

    public String getHairColor() {
        return haircolor;
    }

    public void setRace(String race){
        this.race = race;
    }
    public void setHairColor(String haircolor) {
        this.haircolor = haircolor;
    }

    @Override
    public void DisplayInfo1(){
        super.DisplayInfo1();
        System.out.println("Your race is: " + getRace() + " |Your haircolor is: " + getHairColor());
    }

    @Override
    public void AgePowr2(){
        System.out.println("Your age to the power of 2 is: " + Math.pow(getAge(), 2));
    }

}
