package no3;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("say quack");
    }
}
