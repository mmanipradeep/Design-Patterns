package com.example.demo.singleton;

public class EnumSingletonTest {
    public static void main(String[] args) {
        EnumSingleton singleton = EnumSingleton.INSTANCE;
        EnumSingleton singleton1 = EnumSingleton.INSTANCE;
        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());
    }

}
