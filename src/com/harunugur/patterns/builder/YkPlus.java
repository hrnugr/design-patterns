package com.harunugur.patterns.builder;

import java.math.BigInteger;

public class YkPlus {

    private BigInteger id;
    private String name;
    private int cityId;
    private String cityName;
    private int townId;
    private String townName;

    private YkPlus(BigInteger id, String name, int cityId, String cityName, int townId, String townName) {
        this.id = id;
        this.name = name;
        this.cityId = cityId;
        this.cityName = cityName;
        this.townId = townId;
        this.townName = townName;
    }

    public BigInteger getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCityId() {
        return cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public int getTownId() {
        return townId;
    }

    public String getTownName() {
        return townName;
    }

    @Override
    public String toString() {
        return "YkPlus{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cityId=" + cityId +
                ", cityName='" + cityName + '\'' +
                ", townId=" + townId +
                ", townName='" + townName + '\'' +
                '}';
    }

    public static class YkPlusBuilder {

        private BigInteger id;
        private String name;
        private int cityId;
        private String cityName;
        private int townId;
        private String townName;

        public YkPlusBuilder(){

        }

        public YkPlusBuilder(BigInteger id, String name, int cityId, String cityName, int townId, String townName) {
            this.id = id;
            this.name = name;
            this.cityId = cityId;
            this.cityName = cityName;
            this.townId = townId;
            this.townName = townName;
        }

        public  YkPlusBuilder withId(BigInteger id){
            this.id = id;
            return this;
        }

        public  YkPlusBuilder withName(String name){
           this.name = name;
           return this;
        }

        public YkPlusBuilder withCity(int cityId){
            this.cityId = cityId;
            return this;
        }

        public YkPlusBuilder withCityName(String cityName){
            this.cityName = cityName;
            return this;
        }

        public YkPlusBuilder withTownId(int townId){
            this.townId = townId;
            return this;
        }

        public YkPlusBuilder with(String townName){
             this.townName = townName;
             return this;
        }

        public YkPlus build(){
            return new YkPlus(id,name,cityId,cityName,townId,townName);
        }
    }

}
