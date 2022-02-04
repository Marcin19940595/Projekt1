package com.example.Samochody.domain.repository;

import com.example.Samochody.domain.Ciężarowe;

import javax.annotation.PostConstruct;
import java.util.Collection;

public interface CiężaroweRepository {

    void createCięzarowe(String marka, String model);

    Collection<Ciężarowe> getAllCiężarowe();

    Ciężarowe getCiężarowe(String model);

    void removeCiężarowe(String model);

    @PostConstruct
    void build();

    void createCiężarowe(Ciężarowe ciężarowe);
}
