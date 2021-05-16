package com.example.demo.singleton;

import java.awt.*;
import java.io.Serializable;

public class SerializeSingleton implements Serializable {
    // public instance initialized when loading the class
    public static SerializeSingleton instance = new SerializeSingleton();

    private SerializeSingleton()
    {
        // private constructor
    }

    // implement readResolve method
    protected Object readResolve()
    {
        return instance;
    }
}
