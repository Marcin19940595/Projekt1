package com.example.Samochody.domain;

public class Spalanie {
    private int description;

    public Spalanie(int description) {
        this.description = description;
    }

    public Spalanie(String description) {
    }

    public String toString(){
        return String.valueOf(description);
    }
}
