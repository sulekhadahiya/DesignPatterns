public class RedheadDuck extends Duck implements IFlyable,IQuackable{
    @Override
    public void display() {
        System.out.println("I am a RedheadDuck");
    }

    @Override
    public void fly() {
        System.out.println("I am RedheadDuck. I can fly.");
    }

    @Override
    public void quack() {
        System.out.println("I am RedheadDuck and I quack.");
    }
}
