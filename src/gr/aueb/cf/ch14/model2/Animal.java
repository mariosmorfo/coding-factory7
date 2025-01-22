package gr.aueb.cf.ch14.model2;

public class Animal {

    private String name;
    private int age;

    public Animal(){

    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void speak(){
        System.out.println("I am animal");
    }

    @Override
    public String toString() {
        return " Animals name is: " + name + " , and animals age is: " + age ;
    }
}
