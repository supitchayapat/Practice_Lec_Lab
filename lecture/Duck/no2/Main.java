package no2;

public class Main {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        RubberDuck rubberDuck = new RubberDuck();
        RedheadDuck redheadDuck = new RedheadDuck();
        DecoyDuck decoyDuck = new DecoyDuck();

        mallardDuck.display();
        mallardDuck.fly();
        mallardDuck.swim();
        mallardDuck.quack();

        rubberDuck.display();
//        rubberDuck.fly();
        rubberDuck.swim();
        rubberDuck.quack();

        redheadDuck.display();
        redheadDuck.fly();
        redheadDuck.swim();
        redheadDuck.quack();

        decoyDuck.display();
//        decoyDuck.fly();
        decoyDuck.swim();
//        decoyDuck.quack();
    }
}
