package com.harunugur.patterns.singleton;

public class LazySingleton {

    private static LazySingleton INITIALIZATION = null;

    private LazySingleton(){

    }

    public static LazySingleton getInstance(){
        if (INITIALIZATION == null){
            INITIALIZATION = new LazySingleton();
        }
        return INITIALIZATION;
    }

    public void initInfo(){
        System.out.println("3 - Using Lazy Singleton Design Pattern");
    }

    /**
     * Description : Biz istediğimiz nesne oluşacak.
     *               Nesne oluşturuken double check kontrolu yapyoruz.
     *               Daha önceden oluşmuşsa onu kullan, değilde nesneyi oluştur.
     *               Multi thread kullanmayacksanız hata kontrolu ile birlikte bu mantıklı duruyor.
     *
     * Dezavantajları : Bu yaklaşım thread-safe değil.
     *                  Birden fazla thread ile uğraşıyorsanız lock durumu olabilir.
     *                  Runtime exception alabilirsiniz.
     */
}
