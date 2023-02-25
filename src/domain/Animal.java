package domain;

public class Animal {

    protected String name;

    protected float weight;

    public Animal() {
        name="generic animal";
        weight=25;
    }

    public void eat() {
        System.out.println("Animal eating...");
    }

    @Override
    public String toString() {
        return "My animal:" + "\nName:\t" + name + "\nWeight:\t" + weight+" kg";
    }

 
}
