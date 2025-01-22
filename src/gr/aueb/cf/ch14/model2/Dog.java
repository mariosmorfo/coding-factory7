package gr.aueb.cf.ch14.model2;

public class Dog extends Animal {

    public Dog(){

    }

    @Override
    public void speak() {
        System.out.println("I am a dog");
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
