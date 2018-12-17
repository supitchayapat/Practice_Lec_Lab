package no3;

public class RedheadDuck extends Duck{
    @Override
    public void display() {
        System.out.println("look like Redhead");
    }

    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
}
