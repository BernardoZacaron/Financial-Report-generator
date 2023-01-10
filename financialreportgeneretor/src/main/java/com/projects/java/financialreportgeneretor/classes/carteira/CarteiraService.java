package com.projects.java.financialreportgeneretor.classes.carteira;

import com.projects.java.financialreportgeneretor.classes.operacao.Operacao;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CarteiraService {
    Carteira carteira = new Carteira(2L, 5000.50, null);
    public Carteira getCarteira(){
        return carteira;
    }
}
