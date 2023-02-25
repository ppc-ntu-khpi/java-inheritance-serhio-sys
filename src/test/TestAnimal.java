package test;

import domain.Dove;

public class TestAnimal {

    public static void main(String[] args) {
        Dove dove = new Dove();
        System.out.println(dove);
        dove.fly();
        dove.sendMail("Some mail");
        dove.eat();
        dove.fly();
    }
}
