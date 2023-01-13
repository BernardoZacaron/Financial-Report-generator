package com.projects.java.financialreportgeneretor.repository;

import com.projects.java.financialreportgeneretor.model.Carteira;
import com.projects.java.financialreportgeneretor.model.Operacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperacaoRepo extends JpaRepository<Operacao, Long> {}
