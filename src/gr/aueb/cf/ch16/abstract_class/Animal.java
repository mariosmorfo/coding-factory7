package gr.aueb.cf.ch16.abstract_class;

public abstract class Animal {
    private long id;
    private String name;

    public Animal(){

    }

    public Animal(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public abstract String toString();

    public abstract void speak();

    public void eat(){
        System.out.println(name + " is eating");
    }
}
