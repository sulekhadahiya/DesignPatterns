package FactoryPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Pepperoni pepperoni;
    Clams clams;
    Cheese cheese;
    List<String> toppings = new ArrayList<String>();

    abstract void prepare();
    /*public void prepare(){
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings:");
        for(String topping : toppings){
            System.out.println(" " + topping);
        }
    }*/
    public void bake(){
        System.out.println("bake for 25 minutes at 350");
    }
    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }
    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }
    void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    /*public String toString(){
        // code to print pizza here.
    }*/
}
