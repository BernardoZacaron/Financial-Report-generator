package com.projects.java.financialreportgeneretor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class FinancialReportGeneretorApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinancialReportGeneretorApplication.class, args);
	}

//	@GetMapping("/")
//	public String teste(){
//		return "rodando";
//	}
}
