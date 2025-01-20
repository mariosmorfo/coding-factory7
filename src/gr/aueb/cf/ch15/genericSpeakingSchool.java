package gr.aueb.cf.ch15;

public class genericSpeakingSchool {
    private final iSpeakable iSpeakable;

    public genericSpeakingSchool(gr.aueb.cf.ch15.iSpeakable iSpeakable) {
        this.iSpeakable = iSpeakable;
    }

    public void learnToSpeak(){
        iSpeakable.speak();
    }
}
