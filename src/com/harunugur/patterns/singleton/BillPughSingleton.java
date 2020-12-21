package com.harunugur.patterns.singleton;

public class BillPughSingleton {

    private BillPughSingleton(){
    }

    public static BillPughSingleton getInstance() {
        return  Helper.INSTANCE;
    }

    public void initInfo(){
        System.out.println("5 - Using Bill Pugh Singleton Design Pattern");
    }

    private static class  Helper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }


    /**
     * Description : Inner class yardımıyla instance oluştuyoruz.
     *               Class loading de avantaj sağlıyoruz.
     *
     *
     * Dezavantajları :
     */
}
