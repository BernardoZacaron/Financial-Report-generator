package com.projects.java.financialreportgeneretor.classes.controller;

import com.projects.java.financialreportgeneretor.classes.model.Operacao;
import com.projects.java.financialreportgeneretor.classes.service.OperacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@RestController
//@RequestMapping(path = "api/v1/operacao")
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
