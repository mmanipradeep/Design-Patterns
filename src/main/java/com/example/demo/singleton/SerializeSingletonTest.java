package com.example.demo.singleton;

import java.io.*;

public class SerializeSingletonTest {
    public static void main(String[] args)
    {
        try
        {
            SerializeSingleton instance1 = SerializeSingleton.instance;
            ObjectOutput out
                    = new ObjectOutputStream(new FileOutputStream("file.text"));
            out.writeObject(instance1);
            out.close();

            // deserailize from file to object
            ObjectInput in
                    = new ObjectInputStream(new FileInputStream("file.text"));

            SerializeSingleton instance2 = (SerializeSingleton) in.readObject();
            in.close();

            System.out.println("instance1 hashCode:- "
                    + instance1.hashCode());
            System.out.println("instance2 hashCode:- "
                    + instance2.hashCode());
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
