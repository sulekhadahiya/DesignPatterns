public class Duck implements IDuck{
    @Override
    public void swim() {
        System.out.println("swim");
    }

    @Override
    public void display() {
        System.out.println("I am a Duck.");
    }
}
