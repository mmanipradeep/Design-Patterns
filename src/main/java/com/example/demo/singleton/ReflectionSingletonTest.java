package com.example.demo.singleton;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {

    public static void main (String agrs[]){


        ReflectionSingleton instance1 = ReflectionSingleton.instance;
        ReflectionSingleton instance2 = null;
        try{
            Constructor[] constructors =
                    ReflectionSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors)
            {
                // Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instance2 = (ReflectionSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("instance1.hashCode():- "
                + instance1.hashCode());
        System.out.println("instance2.hashCode():- "
                + instance2.hashCode());


    }


}
