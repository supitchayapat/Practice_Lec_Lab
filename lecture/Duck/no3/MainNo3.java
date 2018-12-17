package no3;

public class MainNo3 {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        RedheadDuck redheadDuck = new RedheadDuck();
        RubberDuck rubberDuck = new RubberDuck();
        DecoyDuck decoyDuck = new DecoyDuck();

        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.swim();

        redheadDuck.display();
        redheadDuck.performFly();
        redheadDuck.performQuack();
        redheadDuck.swim();

        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();
        rubberDuck.swim();

        decoyDuck.display();
        decoyDuck.performFly();
        decoyDuck.performQuack();
        decoyDuck.swim();

        decoyDuck.setFlyBehavior(new FlyWithWings());
        decoyDuck.performFly();
        mallardDuck.setQuackBehavior(new Squeak());
        mallardDuck.performQuack();
    }
}
