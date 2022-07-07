package StrategyPattern;

public abstract class Duck{
    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;
    public Duck(){ }
    public void setFlyBehavior(IFlyBehavior fb){
        flyBehavior = fb;
    }
    public void setQuackBehavior(IQuackBehavior qb){
        quackBehavior = qb;
    }
    public abstract void display();

    public void performQuack(){
        quackBehavior.quack();
    }
    public void performFly(){
        flyBehavior.fly();
    }
    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
