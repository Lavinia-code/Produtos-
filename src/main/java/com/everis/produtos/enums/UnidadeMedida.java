package com.everis.produtos.enums;

public enum UnidadeMedida {

    TONELADA("Tonelada"),
    QUILOGRAMA("Quilograma"),
    GRAMA("Grama"),
    MILIGRAMA("Miligrama");

    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    UnidadeMedida(String descricao) {
        this.descricao = descricao;
    }
}
