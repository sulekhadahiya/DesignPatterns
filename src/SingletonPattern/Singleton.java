package SingletonPattern;

public class Singleton {

    /*
        The volatile keyword ensures that multiple threads handle the uniqueInstance
        variable correctly when it is being initialized to the Singleton instance.
     */
    private volatile static Singleton uniqueInstance;

    //Singleton pattern don't have public constructor.
    private Singleton(){

    }
    /*
    Note : If we never need the instance, it never gets created; this is lazy initialization.
    By adding the synchronized keyword to getInstance(), we force every thread to wait its turn
    before it can enter the method. That is, no two threads may enter the method at the same time.
    */
    public static  Singleton getInstance(){
        if (uniqueInstance == null){         // Check for an instance and if there isn't one,
                                            // enter a synchronized block.
            synchronized (Singleton.class){  //We only synchronize the first time through.
                if(uniqueInstance == null){ // Once in the block, check again and if it's still
                                            // null. create an instance.
                    uniqueInstance = new Singleton(); // Lazy initialization.
                }
            }
        }
        return uniqueInstance;
    }
}
