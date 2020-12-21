package com.harunugur.patterns.singleton;

public class EagerSingleton {

    private final static EagerSingleton INITIALIZATION = new EagerSingleton();

    private EagerSingleton(){
    }

    public static EagerSingleton getInstance(){
        return INITIALIZATION;
    }

    public void initInfo(){
        System.out.println("1 - Using Eager Singleton Design Pattern");
    }

    /**
     * Description : Uygulama ayağa kalktığında bir instance oluşturup heap memory de hazır bekler.
     *               Constructor gizleyip, static bir method bu oluşan objeye istediğniz yerde ulaşabilirsiniz.
     *
     * Dezavantajları : Uygulama ayağa kalktığında bu class dan her zaman bir nesne oluşur.
     *                  Eğer uugulama ayağa kalkdırdığımızda eğer bu instance oluşturuken hata alırsak
     *                  uygulmanın ayağa kalkmayacaktır. Bu hatayı görmezden gelmek için Static Block Initialization yaklaşımnına bakabilirsiniz.
     *                  Ve siz bu nesneyi hiç kullanmayabilirsiniz. Kullnmadığınız bu obje bu boş yere momory de yer kaplar.
     *                  Ayrıca Thread-Safe değil. Birden fazla bu thread ile uğraşıyorsanız bu yaklaşım işinizi görmez.
     */
}
