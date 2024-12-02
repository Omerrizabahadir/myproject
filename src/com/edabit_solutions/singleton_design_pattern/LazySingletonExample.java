package com.edabit_solutions.singleton_design_pattern;

public class LazySingletonExample {
    //Class has only one instance
    private static LazySingletonExample instance;

    //private constructor prevent reaching to instance in another class
    private LazySingletonExample(){
        System.out.println("Lazy Singleton example was created");
    }

    public static LazySingletonExample getInstance(){
        if(instance == null){
            instance = new LazySingletonExample();//object is creating, when first called
        }
        return instance;
    }
    public void showLazyMessage(){
        System.out.println("Hi! I'm a Lazy Singleton class");
    }
}
