package com.example.Samochody.domain.repository;

import com.example.Samochody.domain.Spalanie;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public class SpalanieRepository {
    List<Spalanie> SpalanieList = new ArrayList<>();
    public String createSpalanie(String description){
        SpalanieList.add(new Spalanie(description));
        return description;
    }
    public List<Spalanie> getAll(){
        return SpalanieList;
    }
    public void removeSpalanie(Spalanie spalanie){
        SpalanieList.remove(spalanie);
    }
    @PostConstruct
    public void init(){

    }
    @Override
    public String toString(){
        return "SpalanieRepository{" + "SpalanieList " + SpalanieList + '}';
    }
}
