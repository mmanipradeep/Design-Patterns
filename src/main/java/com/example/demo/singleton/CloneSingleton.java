package com.example.demo.singleton;

 class CloneSingleton extends SuperClass {
     // public instance initialized when loading the class
    public static CloneSingleton instance = new CloneSingleton();

    private CloneSingleton()
    {
        // private constructor
    }

     @Override
     protected Object clone() throws CloneNotSupportedException
     {
         return instance;
     }
}


// JAVA code to explain cloning
    // issue with singleton
    class SuperClass implements Cloneable
    {
        int i = 10;

        @Override
        protected Object clone() throws CloneNotSupportedException
        {
            return super.clone();
        }

//        @Override
//        protected Object clone() throws CloneNotSupportedException
//        {
//            throw new CloneNotSupportedException();
//        }


    }

