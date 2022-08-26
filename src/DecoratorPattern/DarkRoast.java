package DecoratorPattern;

/*
1. Start with a DarkRoast object.
2. Decorate it with a Mocha object.
3. Decorate it with a Whip object.
4. Call the cost() method and rely on delegation to add up the condiment cost.

1. Decorators have the same supertype as the objects they decorate.
   (so we can pass around a decorated object in place of the original (wrapped) object.)
2, You can use one or more decorators to wrap an object.
3. The decorator adds its own behavior before and/or after delegating to the object
   it decorates to do the rest of the job.
4. Objects can be decorated at any time, so we can decorate objects dynamically at
   runtime with as many decorators as we like.
 */
public class DarkRoast extends Beverage{

    public DarkRoast(){
        description = "Most Excellent Dark Roast";
    }
    @Override
    public double cost() {
        return 0.99;
    }
}

