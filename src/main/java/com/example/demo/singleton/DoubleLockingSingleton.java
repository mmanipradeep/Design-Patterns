package com.example.demo.singleton;

public class DoubleLockingSingleton {

    private static volatile DoubleLockingSingleton instance;

    private DoubleLockingSingleton(){}

    public static synchronized DoubleLockingSingleton getInstance(){
        if(instance == null){
            instance = new DoubleLockingSingleton();
        }
        return instance;
    }
}
//One thing to keep in mind with this pattern is that the field needs to be volatile to prevent cache incoherence issues
//since it requires the volatile keyword to work properly, it's not compatible with Java 1.4 and lower versions