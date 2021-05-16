package com.example.demo.singleton;

public class BillPughSingleton {

    private BillPughSingleton() {
        // private constructor
    }

    // Inner class to providmvn e instance of class
    private static class BillPughSingletonInstance {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance()
    {
        return BillPughSingletonInstance.INSTANCE;
    }
}
