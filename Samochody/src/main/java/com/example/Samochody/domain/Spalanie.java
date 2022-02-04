package com.example.Samochody.domain;

public class Spalanie {
    private String description;

    public Spalanie(String description) {
        this.description = description;
    }
    public String toString(){
        return String.valueOf(description);
    }
}
