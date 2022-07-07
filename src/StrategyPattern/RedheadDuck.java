package StrategyPattern;

public class RedheadDuck extends Duck implements IFlyBehavior, IQuackBehavior {
    @Override
    public void display() {
        System.out.println("I am a FirstDesignPrinciple.RedheadDuck");
    }

    @Override
    public void fly() {
        System.out.println("I am FirstDesignPrinciple.RedheadDuck. I can fly.");
    }

    @Override
    public void quack() {
        System.out.println("I am FirstDesignPrinciple.RedheadDuck and I quack.");
    }
}
