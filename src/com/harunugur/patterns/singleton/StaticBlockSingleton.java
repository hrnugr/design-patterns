package com.harunugur.patterns.singleton;

public class StaticBlockSingleton {

    private static StaticBlockSingleton INITIALIZATION = null;

    static {
        try {
            INITIALIZATION = new StaticBlockSingleton();
        }catch (Exception e){
            System.out.println("Get Error");
        }
    }

    private StaticBlockSingleton(){}

    public static StaticBlockSingleton getInstance(){
        return INITIALIZATION;
    }

    public void initInfo(){
        System.out.println("2 - Using Static Block Singleton Design Pattern");
    }

    /**
     * Description : Uygulama ayağa kalktığında bu classı new lemeden önce static block yardımıyla
     *               bir instance oluşturup heap memory de hazır bekler. Burada instance bir kontrol mekanizması
     *               için de oluşturuyoruz. Artık instance oluşurken hata alınırsa uygulma ayağa kalksın mı
     *               ya da kalmasın tecihi ssize kalmıştır.
     *               Constructor gizleyip, static bir method bu oluşan objeye istediğniz yerde ulaşabilirsiniz.
     *
     * Dezavantajları : Uygulama ayağa kalktığında bu class dan her zaman bir nesne oluşur.
     *                  Ve siz bu nesneyi hiç kullanmayabilirsiniz. Kullanmadığınız bu obje bu boş yere momory de yer kaplar.
     *                  Ayrıca Thread-Safe değil. Birden fazla bu thread ile uğraşıyorsanız bu yaklaşım işinizi görmez.
     *                  Eager Initilization yaklaşımından farkı bir kontrol mekanizması yardımıyla hata kontrolunu hapabiliyorunuz.
     *
     */
}
