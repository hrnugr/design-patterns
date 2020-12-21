package com.harunugur.patterns.singleton;

import java.lang.reflect.Constructor;

public class Test {

    static EagerSingleton eagerSingleton = EagerSingleton.getInstance();
    static StaticBlockSingleton staticBlockInitialization = StaticBlockSingleton.getInstance();
    static LazySingleton lazySingleton = LazySingleton.getInstance();
    static ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstance();
    static BillPughSingleton billPughSingleton = BillPughSingleton.getInstance();

    static EagerSingleton eagerSingletonSecond = null;

    public static void main(String[] args) {
        eagerSingleton.initInfo();
        staticBlockInitialization.initInfo();
        lazySingleton.initInfo();
        threadSafeSingleton.initInfo();
        billPughSingleton.initInfo();

        try {
            Constructor[] constructors = EagerSingleton.class.getDeclaredConstructors();
            for (Constructor constructor: constructors) {
                constructor.setAccessible(true);
                eagerSingletonSecond = (EagerSingleton) constructor.newInstance();
                break;
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        // Reflection ile singleton pattern ozelliğini ortadan kaldırdık.
        // Output da görüldüğü objelerin hash code ları aynı değil artık.

        System.out.println("First Eager Singleton Obj hashcode : " + eagerSingleton.hashCode());
        System.out.println("Second Eager Singleton Obj hashcode : " + eagerSingletonSecond.hashCode());

    }
}
