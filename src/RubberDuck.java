public class RubberDuck extends Duck implements IQuackable {
    public void display() {
        System.out.println("I am a RubberDuck.");
    }

    @Override
    public void quack() {
        System.out.println("I can Squeak");
    }
}
