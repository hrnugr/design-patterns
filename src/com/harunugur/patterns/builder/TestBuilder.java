package com.harunugur.patterns.builder;

public class TestBuilder {
    public static void main(String[] args) {
        YkPlus ykPlus = new YkPlus.YkPlusBuilder()
                .withCity(1)
                .withName("harun")
                .withCityName("istanbul")
                .build();
        System.out.println(ykPlus);


    }

    /**
     * Bir çok fazla alanı olduğunda,
     * Birden fazla constructor oluşturmakla uğraşmak istemiyorsak,
     * Diyelim ki oluşturduk bu constructorda ki alanların sırasıyla uğraşmak istemiyorsak
     * Ya da bunların bazıları zorunlu bazıları opsiyonel ise sadece zorunluysa
     * Sadece zorunlu olanlarla islem yapmak istiyorsak gibi durunlarda
     * Builder Design Pattern kullanılabilir.
     * Ayrıca Factory pattern ve  Abstract Factory pattern de ki
     * Sorunların çözümü için kullanılabilir.
     */
}
