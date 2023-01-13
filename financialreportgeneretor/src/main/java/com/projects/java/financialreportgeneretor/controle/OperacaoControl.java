//package com.projects.java.financialreportgeneretor.controle;
//
//import com.projects.java.financialreportgeneretor.model.Operacao;
//import com.projects.java.financialreportgeneretor.repository.OperacaoRepo;
//import com.projects.java.financialreportgeneretor.service.OperacaoService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.transaction.annotation.Transactional;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import java.time.LocalDate;
//import java.util.List;
//
//public class OperacaoControl {
//    private final OperacaoService operacaoService;
//
//    /*@Autowired
//    OperacaoRepo operacaoRepo;*/
//
//    @Autowired
//    public OperacaoControl(OperacaoService operacaoService) {
//        this.operacaoService = operacaoService;
//    }
//
//    @GetMapping
//    public List<Operacao> getOperacoes(){
//        return operacaoService.getOperacoes();
//    }
//
//    /*@RequestMapping("/novaOperacao")
//    public String callRegistrarOperacao(){
//        return "registrarOperacao";
//    }*/
//
//}
