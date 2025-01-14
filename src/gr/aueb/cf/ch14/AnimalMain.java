package gr.aueb.cf.ch14;

public class AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog("Nick", 5, "Husky" );
        Animal animal = new Animal("MARIOS", 45);

       dog.searchForFood();
       animal.makeSound();


    }

}
