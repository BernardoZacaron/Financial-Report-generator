package com.projects.java.financialreportgeneretor.controle;

import com.projects.java.financialreportgeneretor.service.CarteiraService;
import com.projects.java.financialreportgeneretor.model.Carteira;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


public class CarteiraControl {
    private final CarteiraService carteiraService;

    @Autowired
    public CarteiraControl(CarteiraService carteiraService) {
        this.carteiraService = carteiraService;
    }

    @GetMapping
    public List<Carteira> getAllCarteiras(){
        return carteiraService.getAllCarteiras();
    }

    @PostMapping
    public void addCarteira(Carteira carteira){
        //carteiraService.addCarteira(carteira);
        System.out.print(carteira);
    }
}
