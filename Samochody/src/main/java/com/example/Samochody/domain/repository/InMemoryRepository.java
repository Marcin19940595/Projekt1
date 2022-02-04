package com.example.Samochody.domain.repository;

import com.example.Samochody.domain.Ciężarowe;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Repository
public class InMemoryRepository implements CiężaroweRepository{

    Map<String, Ciężarowe> ciężarowes = new HashMap<>();

    public InMemoryRepository (){

    }
    @Override
    public void createCięzarowe(String marka, String model){
        ciężarowes.put(marka, new Ciężarowe(marka,model));
    }
    @Override
    public Collection<Ciężarowe> getAllCiężarowe(){
        return ciężarowes.values();
    }
    @Override
    public Ciężarowe getCiężarowe(String marka){
        return ciężarowes.get(marka);
    }
    @Override
    public void removeCiężarowe(String marka){
        ciężarowes.remove(marka);
    }
    @Override
    @PostConstruct
    public void build(){
        createCięzarowe("Scania","Awargo");
        createCięzarowe("Daf","Mikosa");
    }
    @Override
    public void createCiężarowe(Ciężarowe ciężarowe){
        ciężarowes.put(ciężarowe.getMarka(), ciężarowe);
    }
    @Override
    public String toString(){
        return "CiężaroweReository{" + "ciężarowe = " + ciężarowes + '}';
    }
}
