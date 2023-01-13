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
    private OperacaoRepo operacaoRepo;
    @Autowired
    private CarteiraRepo carteiraRepo;

    Carteira carteiraMain = carteiraRepo.findAll().get(0);

    @GetMapping({"/", "/home"})
    public String callHomePage(Model model) {
        model.addAttribute("saldo", carteiraMain.getSaldo());
        return "index";
    }

    @GetMapping({"/registrar"})
    public String callRegistroPage(Model model){
        model.addAttribute("novoOperacao", new Operacao());
        return "registrarOperacao";
    }

    @PostMapping("/saveOperacao")
    public String saveRegistro(@ModelAttribute Operacao novoOperacao){
        Operacao op = new Operacao(null, novoOperacao.getValor(), novoOperacao.isAcao());
        operacaoRepo.save(novoOperacao);

        carteiraMain.atualizarSaldo(novoOperacao);
        carteiraRepo.saveAndFlush(carteiraMain);

        return "redirect:/home";
    }
}
