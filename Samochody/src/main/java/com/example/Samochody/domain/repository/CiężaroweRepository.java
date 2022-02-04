package com.example.Samochody.domain.repository;

import com.example.Samochody.domain.Ciężarowe;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.Collection;
@Repository
public interface CiężaroweRepository {

    void createcięzarowe(String marka, String model);

    Collection<Ciężarowe> getAllCiężarowe();

    Ciężarowe getCiężarowe(String model);

    void removeCiężarowe(String model);

    @PostConstruct
    void build();

    void createCiężarowe(Ciężarowe ciężarowe);

    void createcięzarowe(Ciężarowe ciężarowe);
}
