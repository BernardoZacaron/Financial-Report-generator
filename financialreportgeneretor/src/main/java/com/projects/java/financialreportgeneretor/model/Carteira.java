package com.projects.java.financialreportgeneretor.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Carteira {
    @Id
    @GeneratedValue
    private Long id;
    private double saldo;
    @OneToMany
    private List<Operacao> operacoes;

    public Carteira() {
    }

    public Carteira(long id, double saldo, List<Operacao> operacoes) {
        this.id = id;
        this.saldo = saldo;
        this.operacoes = operacoes;
    }

    public Carteira(double saldo, List<Operacao> operacoes) {
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
