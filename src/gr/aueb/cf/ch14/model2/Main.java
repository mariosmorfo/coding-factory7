package gr.aueb.cf.ch14.model2;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Animal animal = new Animal();

        cat.speak();
        dog.speak();
        animal.speak();

        doSpeak(cat);
        doSpeak(dog);
        doSpeak(animal);


    }

    public static void doSpeak(Animal animal){
       animal.speak();
    }
}
