package com.projects.java.financialreportgeneretor.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormatter {
    public DateFormatter() {
    }

    public String formatarData(LocalDateTime data){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataFormatada = data.format(formato);

        return dataFormatada;
    }
}
