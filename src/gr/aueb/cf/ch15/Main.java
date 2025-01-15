package gr.aueb.cf.ch15;

public class Main {

    public static void main(String[] args) {
        iSpeakable cat = new Cat("Alice");
        iSpeakable dog = new Dog("BOB");

        cat.speak();
        dog.speak();

    }

    public static void iSpeakable(iSpeakable iSpeakable) {
        iSpeakable.speak();
    }
}
