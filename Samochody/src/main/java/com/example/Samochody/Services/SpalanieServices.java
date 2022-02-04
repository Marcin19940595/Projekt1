package com.example.Samochody.Services;

import com.example.Samochody.domain.repository.InMemoryRepository;
import com.example.Samochody.domain.repository.SpalanieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpalanieServices {
    @Autowired
    InMemoryRepository inMemoryRepository;
    @Autowired
    SpalanieRepository spalanieRepository;
}
