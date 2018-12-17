package no3;

public class DecoyDuck extends Duck {
    @Override
    public void display() {
        System.out.println("look like Decoy");
    }

    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }
}
