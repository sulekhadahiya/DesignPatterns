package ThreeDesignPrinciple;

// Identify the aspects of your application that Vary and Separate them from what stays the Same. --DP1
// Program to an Interface, not an Implementation. --DP2
// Favor composition over inheritance. --DP3
// DP3 - When you put 2 classes (IFlyBehavior and IQuackBehavior) together like this you're using composition.
// DP3 - Instead of inheriting their behavior, the ducks get their behavior by being composed with right behavior Object.
// DP3 - This gives you a lot more flexibility. It also lets you change behavior at runtime
// DP3 - as long as the object you are composing with implements the correct behavior interface.

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
