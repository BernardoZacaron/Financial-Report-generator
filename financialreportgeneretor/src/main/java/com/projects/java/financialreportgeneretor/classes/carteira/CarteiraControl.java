package com.projects.java.financialreportgeneretor.classes.carteira;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/carteira")
public class CarteiraControl {
    @GetMapping
    public List<Carteira> getCarteiras(){
        return List.of(
                new Carteira()
        );
    }
}
