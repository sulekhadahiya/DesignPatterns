package FirstAndSecondDesignPrinciple;

public class RubberDuck extends Duck implements IQuackBehavior {
    public void display() {
        System.out.println("I am a FirstDesignPrinciple.RubberDuck.");
    }

    @Override
    public void quack() {
        System.out.println("I can Squeak");
    }
}
