package com.projects.java.financialreportgeneretor.classes.carteira;

import com.projects.java.financialreportgeneretor.classes.operacao.Operacao;

import java.util.List;

public class Carteira {
    private long id;
    private double saldo;
    private List<Operacao> operacoes;

    public Carteira() {
    }

    public Carteira(long id, double saldo, List<Operacao> operacoes) {
        this.id = id;
        this.saldo = saldo;
        this.operacoes = operacoes;
    }

    public Carteira(double saldo) {
        this.saldo = saldo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Carteira{" +
                "id=" + id +
                ", saldo=" + saldo +
                '}';
    }
}
