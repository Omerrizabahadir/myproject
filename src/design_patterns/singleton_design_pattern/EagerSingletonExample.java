package design_patterns.singleton_design_pattern;

public class EagerSingletonExample {

    //EAGER INITIALIZATION INSTANCE has been creating at application start.
    private static final EagerSingletonExample instance = new EagerSingletonExample();

    private EagerSingletonExample(){
        System.out.println("Eager Singleton example was created");
    }
    public static EagerSingletonExample getInstance(){
        return instance;   //Instance is created when application start, so even if we don't use it has been creating.
    }
    public void showEagerMessage(){
        System.out.println("Hi! I'm a Eager Singleton class");

    }
}
