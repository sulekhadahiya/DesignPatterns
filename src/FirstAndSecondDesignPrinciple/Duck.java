package FirstAndSecondDesignPrinciple;

public abstract class Duck{
    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;
    public Duck(){ }
    public abstract void display();

    public void performQuack(){
        quackBehavior.quack();
    }
    public void performFly(){
        flyBehavior.fly();
    }
    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
