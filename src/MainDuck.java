public class MainDuck {
    public static void main(String[] args) {
        Duck duck1 = new Duck();
        MallardDuck mallardDuck = new MallardDuck();
        RubberDuck rubberDuck = new RubberDuck();
        DecoyDuck decoyDuck = new DecoyDuck();
        RedheadDuck redheadDuck = new RedheadDuck();

        mallardDuck.display();
        redheadDuck.display();
        rubberDuck.display();
        decoyDuck.display();
    }
}
