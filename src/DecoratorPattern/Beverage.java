package DecoratorPattern;
/*
Design Principle : Classes should be open for extension, but
                    closed for modification.
 */
public class Beverage {
    public String description;
    public String getDescription(){
        return this.description;
    }
     public double cost()
     {
        return 12.50;
     }
}
