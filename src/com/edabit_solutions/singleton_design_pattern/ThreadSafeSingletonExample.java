package com.edabit_solutions.singleton_design_pattern;

public class ThreadSafeSingletonExample {
    private static ThreadSafeSingletonExample instance;

    private ThreadSafeSingletonExample(){
        System.out.println("Thread-Safe Singleton was created");

    }
    /*
    The synchronized keyword is used to ensure that the object is created only once.
    The synchronized keyword allows one thread to create the object while other threads wait for this operation.
    However, this can be inefficient in terms of performance because each object is entered into the synchronized block before it is created.
     */
    public static synchronized ThreadSafeSingletonExample getInstance(){
        if (instance == null){
            instance = new ThreadSafeSingletonExample();
        }
        return instance;
    }
    public void showThreadSafeMessage(){
        System.out.println("Hi. I'm Thread-Safe Singleton");
    }
}
