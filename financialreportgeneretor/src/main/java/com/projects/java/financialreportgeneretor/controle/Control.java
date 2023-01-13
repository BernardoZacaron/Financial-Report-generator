package com.projects.java.financialreportgeneretor.controle;

import com.projects.java.financialreportgeneretor.model.Carteira;
import com.projects.java.financialreportgeneretor.model.Operacao;
import com.projects.java.financialreportgeneretor.repository.CarteiraRepo;
import com.projects.java.financialreportgeneretor.repository.OperacaoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class Control {

    @Autowired
    OperacaoRepo operacaoRepo;
    @Autowired
    CarteiraRepo carteiraRepo;

    //Carteira carteiraMain = carteiraRepo.findAll().get(0);

    @GetMapping({"/", "/home"})
    public String callHomePage(Model model) {
        carteiraRepo.save(new Carteira(0));
        model.addAttribute("saldo", carteiraRepo.findAll().get(0).getSaldo());
        model.addAttribute("operacoes", operacaoRepo.findAll());
        return "index";
    }

    @GetMapping({"/registrar"})
    public String callRegistroPage(Model model){
        model.addAttribute("novoOperacao", new Operacao());
        return "registrarOperacao";
    }

    @PostMapping("/saveOperacao")
    public String saveRegistro(@ModelAttribute Operacao novoOperacao, @RequestParam(name = "radioAcao") String acao){
        boolean tipoAcao;
        if(acao.equals("deposito"))
            tipoAcao = true;
        else
            tipoAcao = false;


        Operacao op = new Operacao(null, novoOperacao.getValor(), tipoAcao);
        operacaoRepo.save(novoOperacao);

        carteiraRepo.findAll().get(0).atualizarSaldo(novoOperacao);
        carteiraRepo.saveAndFlush(carteiraRepo.findAll().get(0));

        return "redirect:/home";
    }
}
