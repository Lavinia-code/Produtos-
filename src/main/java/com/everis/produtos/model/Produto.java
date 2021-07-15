package com.everis.produtos.model;

import com.everis.produtos.enums.UnidadeMedida;

public class Produto {
    private String nome;
    private String utilidade;
    private UnidadeMedida unidadeDeMedida;
    private int valor;
    private String descricao;

    public String getNome() {
        return nome;
    }

    public Produto setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getUtilidade() {
        return utilidade;
    }

    public Produto setUtilidade(String utilidade) {
        this.utilidade = utilidade;
        return this;
    }

    public UnidadeMedida getUnidadeDeMedida() {
        return unidadeDeMedida;
    }

    public Produto setUnidadeDeMedida(UnidadeMedida unidadeDeMedida) {
        this.unidadeDeMedida = unidadeDeMedida;
        return this;
    }

    public int getValor() {
        return valor;
    }

    public Produto setValor(int valor) {
        this.valor = valor;
        return this;
    }

    public String getDescricao() {
        return descricao;
    }

    public Produto setDescricao(String descricao) {
        this.descricao = descricao;
        return this;
    }
}
