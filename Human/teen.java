package Human;

import java.io.File;
import java.util.Random;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class teen extends Human{
    private boolean moody;
    private boolean failingSchool;

    public teen(boolean moody_, boolean failingSchool_, String gender_, String job_, int age_, String faveColor_, String faveFood_, String countryOfOrigin_){
        super(gender_, job_, age_, faveColor_, faveFood_, countryOfOrigin_);
        this.moody = moody_;
        this.failingSchool = failingSchool_;
    }

    private void cry(){
        File cry = new File("D:/BlackBelt/Day6/Human/scream.wav");
        try{
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(cry));
            clip.start();
            Thread.sleep(clip.getMicrosecondLength()/1000);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    //Getters and setters
    public boolean getMoody(){ return moody; }
    public void setMoody(boolean newMoody){this.moody = newMoody;}
    public boolean getFailingSchool(){ return failingSchool; }
    public boolean failCheck(int hours){
        
        //Makes the random to see if we can properly study
        Random succeed = new Random();
        //Rolls for each hour that we studied
        for (int i = 0; i<=hours; i++){
            //Gets the roll
            int num = succeed.nextInt(10);
            //Checks for success
            if (num > 7){this.failingSchool = false; return true;}
        //If we made it here, we failed
        }
        this.cry();
        this.failingSchool = true;
        return false;
    }

    @Override
    public String[] report(){
        //Get the report from the Human super-class
        String[] rep1 = super.report();
        //Make the new report
        String[] rep2 = new String[8];
        int counter = 0;
        for (String part : rep1){
            rep2[counter] = part;
            counter += 1;
        }
        rep2[6] = "Am I moody?: " + String.valueOf(getMoody());
        rep2[7] = "Am I failing?: " + String.valueOf(getFailingSchool());

        return rep2;
    }
}
