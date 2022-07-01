package ThreeDesignPrinciple;

public class MuteQuack implements IQuackBehavior{
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
