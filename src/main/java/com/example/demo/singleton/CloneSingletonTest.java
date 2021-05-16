package com.example.demo.singleton;

public class CloneSingletonTest {

    public static void main(String[] args) throws CloneNotSupportedException
    {
        CloneSingleton instance1 = CloneSingleton.instance;
        CloneSingleton instance2 = (CloneSingleton) instance1.clone();
        System.out.println("instance1 hashCode:- "
                + instance1.hashCode());
        System.out.println("instance2 hashCode:- "
                + instance2.hashCode());
    }
}
