package gr.aueb.cf.ch14.model2;

public class Cat extends Animal {

    public Cat(){

    }

    @Override
    public void speak() {
        System.out.println("I am a cat");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
