package com.projects.java.financialreportgeneretor.classes.service;

import com.projects.java.financialreportgeneretor.classes.model.Carteira;
import com.projects.java.financialreportgeneretor.classes.repository.CarteiraRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class CarteiraService {
    //Carteira carteira = new Carteira(2L, 5000.50, null);

    private final CarteiraRepo carteiraRepo;

    @Autowired
    public CarteiraService(CarteiraRepo carteiraRepo) {
        this.carteiraRepo = carteiraRepo;
    }

    public List<Carteira> getAllCarteiras(){
        return carteiraRepo.findAll();
    }

    public void addCarteira(@RequestBody Carteira carteira) {
        carteiraRepo.save(carteira);
    }
}
