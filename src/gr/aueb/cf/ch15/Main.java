package gr.aueb.cf.ch15;

public class Main {

    public static void main(String[] args) {
        iSpeakable cat = new Cat("Alice");
        iSpeakable dog = new Dog("BOB");
        genericSpeakingSchool genericSpeakingSchool = new genericSpeakingSchool(cat);
        genericSpeakingSchool genericSpeakingSchool2 = new genericSpeakingSchool(dog);

//        cat.speak();
//        dog.speak();
//
//        doSpeak(cat);
//        doSpeak(dog);

        genericSpeakingSchool.learnToSpeak();
        genericSpeakingSchool2.learnToSpeak();

    }

    public static void doSpeak(iSpeakable iSpeakable) {
        iSpeakable.speak();
    }

    }

