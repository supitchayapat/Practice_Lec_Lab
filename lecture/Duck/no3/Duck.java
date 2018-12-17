package no3;

public abstract class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;
    public Duck(){

    }
    public abstract void display();

    public void performQuack(){
        quackBehavior.quack();
    }
    public void performFly(){
        flyBehavior.fly();
    }
    public void swim(){
        System.out.println("can swim");
    }
    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }
}
