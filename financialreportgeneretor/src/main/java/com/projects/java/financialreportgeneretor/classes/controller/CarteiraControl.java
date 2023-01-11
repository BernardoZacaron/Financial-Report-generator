package com.projects.java.financialreportgeneretor.classes.controller;

import com.projects.java.financialreportgeneretor.classes.service.CarteiraService;
import com.projects.java.financialreportgeneretor.classes.model.Carteira;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/carteira")
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
