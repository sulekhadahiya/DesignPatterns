public class MallardDuck extends Duck implements IFlyable, IQuackable{
    @Override
    public void display() {
        System.out.println("I am a MallardDuck");
    }

    @Override
    public void fly() {
        System.out.println("I am MallarDuck. I can fly high.");
    }

    @Override
    public void quack() {
        System.out.println("I am MallarDuck. I do Quack when hungry or angry.");
    }
}
