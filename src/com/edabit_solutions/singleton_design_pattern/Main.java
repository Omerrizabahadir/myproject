package com.edabit_solutions.singleton_design_pattern;

public class Main {

    public static void main(String[] args) {
        //obj1 and obj2 coming from constructor, so we have just one output. Because we have just one instance.
        LazySingletonExample obj1 = LazySingletonExample.getInstance();
        LazySingletonExample obj2 = LazySingletonExample.getInstance();

        obj1.showLazyMessage();

        System.out.println("----------------------");

        EagerSingletonExample obj3 = EagerSingletonExample.getInstance();

        obj3.showEagerMessage();

        System.out.println("----------------------");
        ThreadSafeSingletonExample obj4 = ThreadSafeSingletonExample.getInstance();

        obj4.showThreadSafeMessage();


    }

}
