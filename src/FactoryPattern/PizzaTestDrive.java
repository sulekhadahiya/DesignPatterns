package FactoryPattern;

/*
The Factory Method Pattern defines an interface for creating an object,
but lets subClasses decide which class to instantiate.
Factory Method lets a class defer instantiation to subClasses.

Design Principle: Depend upon abstractions. Do not depend upon concrete classes.

Dependency (1)Inversion principle: (2)High level components should not depend on low level
components; rather, they should both depend on abstraction.

(2)High level component is a class with behavior defined in terms of other,
low level components.

(1)The Inversion is there because it inverts the way you typically might think about your OO design.
Low level components depend on a high level abstraction. Likewise, the high level component is also
tied to the same abstraction. So, top to bottom dependency has inverted itself, with both high level
and low level modules now depending on the abstraction.

Guidelines to avoid OO designs that violate the Dependency Injection principle:

1. No variable should hold a reference to a concrete class.
    (If you use new, you'll be holding a reference to a concrete class.
    Use a factory to get around this.)

2. No class should derive from a concrete class.
    (If you derive from a concrete class, you're depending on a concrete class.
    Derive from an abstraction, like an interface or an abstract class.)

3. No method should override an implemented method of any of its base classes.
    (Like many of other principles, this is a guideline you should strive for,
    rather than a rule you should follow all the time.)

The Abstract factory Pattern: provides an interface for creating families of
related or dependent objects without specifying their concrete classes.

 */

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println(" Joel ordered a " + pizza.getName() + "\n");
    }
}
