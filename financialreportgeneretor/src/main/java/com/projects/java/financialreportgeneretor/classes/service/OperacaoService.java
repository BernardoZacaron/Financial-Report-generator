package com.projects.java.financialreportgeneretor.classes.service;

import com.projects.java.financialreportgeneretor.classes.model.Carteira;
import com.projects.java.financialreportgeneretor.classes.model.Operacao;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class OperacaoService {
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
