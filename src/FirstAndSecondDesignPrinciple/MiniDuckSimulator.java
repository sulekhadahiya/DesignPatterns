package FirstAndSecondDesignPrinciple;

// Identify the aspects of your application that Vary and Separate them from what stays the Same. --DP1
// Program to an Interface, not an Implementation. --DP2
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
    }
}
