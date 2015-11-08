package com.example.silbert.mercadofifa.model;

import java.math.BigDecimal;

/**
 * Created by Silbert on 08/11/2015.
 */
public class Jogador {
    private BigDecimal lucro;
    private BigDecimal vendaJogador;
    private BigDecimal valorJogador;
    private BigDecimal taxaFifa;

    public Jogador(){
        taxaFifa = new BigDecimal("0.05");
        vendaJogador = BigDecimal.ZERO;
        valorJogador = BigDecimal.ZERO;
        lucro = BigDecimal.ZERO;
    }

    public BigDecimal getLucro() {
        return lucro;
    }

    public void setLucro(BigDecimal lucro) {
        this.lucro = lucro;
    }

    public BigDecimal getVendaJogador() {
        return vendaJogador;
    }

    public void setVendaJogador(BigDecimal vendaJogador) {
        this.vendaJogador = vendaJogador;
    }

    public BigDecimal getValorJogador() {
        return valorJogador;
    }

    public void setValorJogador(BigDecimal valorJogador) {
        this.valorJogador = valorJogador;
    }

    public BigDecimal getTaxaFifa() {
        return taxaFifa;
    }

    public void setTaxaFifa(BigDecimal taxaFifa) {
        this.taxaFifa = taxaFifa;
    }
}
