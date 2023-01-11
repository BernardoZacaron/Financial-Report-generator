package com.projects.java.financialreportgeneretor.classes.carteira;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarteiraService {
    //Carteira carteira = new Carteira(2L, 5000.50, null);

    private final CarteiraRepo carteiraRepo;

    @Autowired
    public CarteiraService(CarteiraRepo carteiraRepo) {
        this.carteiraRepo = carteiraRepo;
    }

    public List<Carteira> getCarteiras(){
        return carteiraRepo.findAll();
    }
}
