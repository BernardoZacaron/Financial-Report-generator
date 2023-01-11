package com.projects.java.financialreportgeneretor.classes.repository;

import com.projects.java.financialreportgeneretor.classes.model.Carteira;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CarteiraRepo extends JpaRepository<Carteira, Long> {}
