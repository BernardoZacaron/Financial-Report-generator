package com.projects.java.financialreportgeneretor;

import com.projects.java.financialreportgeneretor.model.Carteira;
import com.projects.java.financialreportgeneretor.repository.CarteiraRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class FinancialReportGeneretorApplication implements CommandLineRunner {
	@Autowired
	CarteiraRepo cr;

	public static void main(String[] args) {
		SpringApplication.run(FinancialReportGeneretorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		Carteira carteiraMain = new Carteira(0, null);
		cr.save(carteiraMain);
	}
}
