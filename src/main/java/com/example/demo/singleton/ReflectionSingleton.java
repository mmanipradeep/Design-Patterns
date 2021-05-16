package com.example.demo.singleton;

public class ReflectionSingleton {
    // public instance initialized when loading the class
    public static ReflectionSingleton instance = new ReflectionSingleton();

    private ReflectionSingleton()
    {
        // private constructor
    }
}
