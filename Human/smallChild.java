package Human;

import java.io.File;

import javax.sound.sampled.*;
public class smallChild extends Human {
    private boolean annoying;
    private boolean bald;
    private String obsesion;

    public smallChild(boolean annoying_, boolean bald_, String obsesion_, String gender_, String job_, int age_, String faveColor_, String faveFood_, String countryOfOrigin_){
        super(gender_, job_, age_, faveColor_, faveFood_, countryOfOrigin_);
        this.annoying = annoying_;
        this.bald = bald_;
        this.obsesion = obsesion_;
    }
    //Getters and Setters
    public boolean getAnnoying(){ return annoying; }
    public void setAnnoying(boolean newAnnoying){ this.annoying = newAnnoying; }
    public boolean getBald(){ return bald; }
    public void setBald(boolean newBald){ this.bald = newBald; }
    public String getObsession(){ return obsesion; }
    public void setObsession(String newObsession){ this.obsesion = newObsession;}

    @Override
    public String[] report(){
        // Get the OG report to smush them together
        String[] rep1 = super.report();
        // Makes the new report array
        String[] rep2 = new String[9];
        int counter = 0;
        //Puts all of the stuff into the returned report
        for (String part : rep1){
            rep2[counter] = part;
            counter += 1;
        }
        //Adds the new stuff to the report
        rep2[6] = "Am I annoying?: " + String.valueOf(getAnnoying());
        rep2[7] = "Am I bald?: " + String.valueOf(getBald());
        rep2[8] = "I am obsessed with " + getObsession() + ".";

        return rep2;
    }
    public void Scream(){
        File ungodlyNoise = new File("D:/BlackBelt/Day6/Human/scream.wav");
        try{
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(ungodlyNoise));
            clip.start();
            Thread.sleep(clip.getMicrosecondLength()/1000);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
