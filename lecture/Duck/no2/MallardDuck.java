package no2;

public class MallardDuck extends Duck implements Flyable,Quackable {
    @Override
    public void fly() {
        System.out.println("I can fly");
    }

    @Override
    public void quack() {
        System.out.println("say \"Quack\"");
    }
    public void display(){
        System.out.println("look like Mallard");
    }
}
