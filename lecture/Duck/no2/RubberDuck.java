package no2;

public class RubberDuck extends Duck implements Quackable {
    @Override
    public void quack() {
        System.out.println("say \"Squeak\"");
    }
    public void display(){
        System.out.println("look like Rubber");
    }
}
