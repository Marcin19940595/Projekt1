package com.example.Samochody;

import com.example.Samochody.domain.Ciężarowe;
import com.example.Samochody.domain.Spalanie;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Starter implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Spalanie spalanieman = new Spalanie(55);
        Ciężarowe man = new Ciężarowe("Man","TGL - 4545", spalanieman);
    }
}
