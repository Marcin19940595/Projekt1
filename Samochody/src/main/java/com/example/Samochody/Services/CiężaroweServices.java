package com.example.Samochody.Services;

import com.example.Samochody.domain.Ciężarowe;
import com.example.Samochody.domain.repository.CiężaroweRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CiężaroweServices {
    @Autowired
    CiężaroweRepository ciężaroweRepository;

    public List<Ciężarowe> getAllCiężarowe(){
        return new ArrayList<>(ciężaroweRepository.getAllCiężarowe());
    }
    public void saveCiężarowe(Ciężarowe ciężarowe){
        ciężaroweRepository.createCięzarowe(ciężarowe);
    }

}
