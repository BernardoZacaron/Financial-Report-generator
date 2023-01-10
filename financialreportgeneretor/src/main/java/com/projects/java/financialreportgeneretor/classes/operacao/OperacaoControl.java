package com.projects.java.financialreportgeneretor.classes.operacao;

import com.projects.java.financialreportgeneretor.classes.carteira.Carteira;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/operacao")
public class OperacaoControl {
    @GetMapping
    public List<Operacao> getOperacoes(){
        return List.of(
                new Operacao(
                        1L,
                        new Carteira(),
                        LocalDate.now(),
                        2000,
                        true
                )
        );
    }
}
