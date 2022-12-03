package com.example.school.service.singleton;

public class Singleton {
    //private static volatile Singleton singleton;
    //private  Singleton() {}
    //
    //public static Singleton getSingleton() {
    //    if (singleton == null){
    //        synchronized (Singleton.class){
    //            if (singleton == null){
    //                singleton = new Singleton();
    //            }
    //        }
    //    }
    //    return singleton;
    //}

    private Singleton(){};
    private static class SingletonInstance {
        private static  final Singleton instance = new Singleton();
    }
    public static Singleton getInstance(){
        return SingletonInstance.instance;
    }

    public enum SingletonEnum{
        SINGLETON;
    }

    public static void main(String[] args) {
        SingletonEnum singletonEnum = SingletonEnum.SINGLETON;
        Singleton instance = SingletonInstance.instance;
    }
}

