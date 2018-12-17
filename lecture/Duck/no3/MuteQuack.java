package no3;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("can't say");
    }
}
