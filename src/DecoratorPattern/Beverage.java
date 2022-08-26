package DecoratorPattern;
/*
Design Principle : Classes should be open for extension, but
                    closed for modification.

Decorator Pattern: attaches additional responsibilities to an object dynamically.
Decorators provide a flexible alternative to subclassing for extending functionality.
 */
public abstract class Beverage {
    public String description = "Unknown Beverage";
    public String getDescription(){
        return this.description;
    }
     public abstract double cost();
}
