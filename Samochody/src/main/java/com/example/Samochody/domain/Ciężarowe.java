package com.example.Samochody.domain;

public class Ciężarowe {
    private String marka;
    private String model;
    Spalanie spalanie;

    public Ciężarowe() {
    }

    public Ciężarowe(String marka, String model, Spalanie spalanie) {
        this.marka = marka;
        this.model = model;
        this.spalanie = spalanie;
    }
    public String toString(){
        return "Samochód ciężarowy marki " + marka + model + "spala " + spalanie + " litrów na 100km.";
    }
}
