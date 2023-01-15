package com.projects.java.financialreportgeneretor.controle;

import com.projects.java.financialreportgeneretor.model.Carteira;
import com.projects.java.financialreportgeneretor.model.Operacao;
import com.projects.java.financialreportgeneretor.model.dto.OperacaoDTO;
import com.projects.java.financialreportgeneretor.repository.CarteiraRepo;
import com.projects.java.financialreportgeneretor.repository.OperacaoRepo;
import com.projects.java.financialreportgeneretor.util.DateFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class Control {

    @Autowired
    OperacaoRepo operacaoRepo;
    @Autowired
    CarteiraRepo carteiraRepo;

    DateFormatter formatador = new DateFormatter();

    //Carteira carteiraMain = carteiraRepo.findAll().get(0);

    @GetMapping({"/", "/home"})
    public String callHomePage(Model model) {
        carteiraRepo.save(new Carteira(0));
        model.addAttribute("saldo", carteiraRepo.findAll().get(0).getSaldo());

        List<OperacaoDTO> operacoes = new ArrayList<>();
        for (Operacao op : operacaoRepo.findAll()) {
            OperacaoDTO operacaoDTO = new OperacaoDTO(formatador.formatarData(op.getData()), op.getValor());
            operacaoDTO.setAcao(op.isAcao());

            operacoes.add(operacaoDTO);
        }

        model.addAttribute("operacoes", operacoes);
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

        Operacao operacao = new Operacao(LocalDateTime.now(), novoOperacao.getValor(), tipoAcao);
        operacaoRepo.save(operacao);

        carteiraRepo.findAll().get(0).atualizarSaldo(operacao);
        carteiraRepo.saveAndFlush(carteiraRepo.findAll().get(0));

        return "redirect:/home";
    }

    @PostMapping("/resetar")
    public String resetarTudo(){
        operacaoRepo.deleteAll();
        carteiraRepo.findAll().get(0).setSaldo(0);
        carteiraRepo.saveAndFlush(carteiraRepo.findAll().get(0));

        return "redirect:/home";
    }
}
