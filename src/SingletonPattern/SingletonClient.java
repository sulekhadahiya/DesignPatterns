package SingletonPattern;

public class SingletonClient {
    public static void main(String[] args) {
        SingletonSimplest singleton = SingletonSimplest.UNIQUE_INSTANCE;
        //use the singleton here
    }
}
