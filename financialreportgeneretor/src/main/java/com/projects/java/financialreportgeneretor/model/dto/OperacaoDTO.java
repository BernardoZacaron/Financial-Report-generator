package com.projects.java.financialreportgeneretor.model.dto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class OperacaoDTO {
    private String dataHora;
    private double valor;
    private String acao;

    public OperacaoDTO() {
    }

    public OperacaoDTO(String dataHora, double valor, String acao) {
        this.dataHora = dataHora;
        this.valor = valor;
        this.acao = acao;
    }

    public OperacaoDTO(String dataHora, double valor) {
        this.dataHora = dataHora;
        this.valor = valor;
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

    public String getAcao() {
        return acao;
    }

    public void setAcao(Boolean acaoBool) {
        if(acaoBool)
            acao = "true";
        else if (!acaoBool)
            acao = "false";
    }
}
