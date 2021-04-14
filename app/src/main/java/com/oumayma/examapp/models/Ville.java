package com.oumayma.examapp.models;

public class Ville {
    private String cityName;
    private double priceT1;
    private double priceT2;
    private double PriceT3;
    private double priceT4;

    public Ville(String name, double price1, double price2, double price3, double price4) {
        this.cityName = name;
        priceT1 = price1;
        priceT2 = price2;
        PriceT3 = price3;
        priceT4 = price4;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public void setPriceT1(double priceT1) {
        this.priceT1 = priceT1;
    }

    public void setPriceT2(double priceT2) {
        this.priceT2 = priceT2;
    }

    public void setPriceT3(double priceT3) {
        PriceT3 = priceT3;
    }

    public void setPriceT4(double priceT4) {
        this.priceT4 = priceT4;
    }

    public String getCityName() {
        return cityName;
    }

    public double getPriceT1() {
        return priceT1;
    }

    public double getPriceT2() {
        return priceT2;
    }

    public double getPriceT3() {
        return PriceT3;
    }

    public double getPriceT4() {
        return priceT4;
    }
}
