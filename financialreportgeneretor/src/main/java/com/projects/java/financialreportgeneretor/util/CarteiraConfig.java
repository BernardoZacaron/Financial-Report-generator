package com.projects.java.financialreportgeneretor.util;

import com.projects.java.financialreportgeneretor.model.Carteira;
import com.projects.java.financialreportgeneretor.repository.CarteiraRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CarteiraConfig {
    @Bean
    CommandLineRunner commandLineRunner(CarteiraRepo repo){
        return args -> {
            Carteira carteira1 = new Carteira(
                    5000, null
            );
            Carteira carteira2 = new Carteira(
                    10000, null
            );

            repo.saveAll(List.of(carteira1, carteira2));
        };
    }
}
