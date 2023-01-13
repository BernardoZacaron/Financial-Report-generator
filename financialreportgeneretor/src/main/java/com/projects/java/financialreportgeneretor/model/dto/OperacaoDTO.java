package com.projects.java.financialreportgeneretor.model.dto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class OperacaoDTO {
    private String dataHora;
    private double valor;
    private boolean acao;


    public OperacaoDTO(String dataHora, double valor, boolean acao) {
        this.dataHora = dataHora;
        this.valor = valor;
        this.acao = acao;
    }

    public OperacaoDTO(String dataHora, double valor) {
        this.dataHora = dataHora;
        this.valor = valor;
    }

    public OperacaoDTO() {
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String formatarData(LocalDate data){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/uuuu HH:mm:ss");
        String dataFormatada = data.format(formato);

        return dataFormatada;
    }
}
