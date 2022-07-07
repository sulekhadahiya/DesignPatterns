package StrategyPattern;

public class Quack implements IQuackBehavior{
    public void quack() {
        System.out.println("Quack");
    }
}
