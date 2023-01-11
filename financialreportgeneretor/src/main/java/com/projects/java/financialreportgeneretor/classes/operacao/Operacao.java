package com.projects.java.financialreportgeneretor.classes.operacao;

import com.projects.java.financialreportgeneretor.classes.carteira.Carteira;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Operacao {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private Carteira carteira;
    private LocalDate data;
    private double valor;
    private boolean acao; //0=retirada   1=deposito

    public Operacao() {
    }

    public Operacao(Carteira carteira, LocalDate data, double valor, boolean acao) {
        this.carteira = carteira;
        this.data = data;
        this.valor = valor;
        this.acao = acao;
    }

    public Operacao(LocalDate data, double valor, boolean acao) {
        this.data = data;
        this.valor = valor;
        this.acao = acao;
    }

    public Operacao(long id, Carteira carteira, LocalDate data, double valor, boolean acao) {
        this.id = id;
        this.carteira = carteira;
        this.data = data;
        this.valor = valor;
        this.acao = acao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isAcao() {
        return acao;
    }

    public void setAcao(boolean acao) {
        this.acao = acao;
    }
}
