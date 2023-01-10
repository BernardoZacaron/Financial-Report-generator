package com.projects.java.financialreportgeneretor.classes.carteira;

import com.projects.java.financialreportgeneretor.classes.operacao.Operacao;
import com.projects.java.financialreportgeneretor.classes.operacao.OperacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
    public Carteira getCarteira(){
        return carteiraService.getCarteira();
    }
}