package com.projects.java.financialreportgeneretor.controle;

import com.projects.java.financialreportgeneretor.model.Operacao;
import com.projects.java.financialreportgeneretor.service.OperacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


public class OperacaoControl {
    private final OperacaoService operacaoService;

    @Autowired
    public OperacaoControl(OperacaoService operacaoService) {
        this.operacaoService = operacaoService;
    }

    @GetMapping
    public List<Operacao> getOperacoes(){
        return operacaoService.getOperacoes();
    }
}
