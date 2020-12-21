package com.harunugur.patterns.singleton;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton INITIALIZATION = null;

    private ThreadSafeSingleton(){

    }

    public static synchronized ThreadSafeSingleton getInstance(){
        if (INITIALIZATION == null){
            INITIALIZATION = new ThreadSafeSingleton();
        }
        return INITIALIZATION;
    }

    public void initInfo(){
        System.out.println("4 - Using Thread Safe Singleton Design Pattern");
    }

    /**
     * Description : Biz istediğimiz nesne oluşacak.
     *               Nesne oluşturuken double check kontrolu yapyoruz.
     *               Daha önceden oluşmuşsa onu kullan, değilde nesneyi oluştur.
     *               Multi-thread sorunu çözmek için synchronized keyword kullanıyoruz.
     *
     * Dezavantajları : Burada sürekli bir thread-safe kontrolu var.
     *                  Bu kontrol da JVM'e ekstra bir maaliyet sorunu çıkartabiliyor.
     *
     */
}
