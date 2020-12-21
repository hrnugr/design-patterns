package com.harunugur.patterns.singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

    private static final long serialVersionUID = -7604766932017737115L;

    private SerializedSingleton() {
    }

    private static class Helper {
        private static final SerializedSingleton INITIALIZATION = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance() {
        return Helper.INITIALIZATION;
    }

    //Singleton Desing patter özelliğini korumak için readObject metodundan yaralanıyoruz.
    // Böylelikle hashcode aynı olacaktır.
    protected Object readResolve() {
        return getInstance();
    }

}
