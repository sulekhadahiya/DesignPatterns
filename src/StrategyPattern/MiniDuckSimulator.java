package StrategyPattern;
// OO Basics : Abstraction, Encapsulation, Polymorphism, Inheritance.

//OO principle 1: Identify the aspects of your application that Vary and Separate them from what stays the Same.
//OO principle 2: Program to an Interface, not an Implementation.
//OO principle 3: Favor composition over inheritance.

// (When you put 2 classes (IFlyBehavior and IQuackBehavior) together like this you're using composition.
// Instead of inheriting their behavior, the ducks get their behavior by being composed with right behavior Object.
// This gives you a lot more flexibility. It also lets you change behavior at runtime
// as long as the object you are composing with implements the correct behavior interface.)

//OO patterns :
//STRATEGY PATTERN : Defines a family of algorithms, encapsulates each one, and makes them interchangeable.
//Strategy lets the algorithm vary independently of clients that use it.
// (We're using the Strategy Pattern to implement the various behaviors of our ducks.
// This tells you the duck behavior has been encapsulated into its own set of classes
// that can be easily expanded and changed, even at runtime if needed.)
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
