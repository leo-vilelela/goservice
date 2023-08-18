package com.soulcode.goserviceapp.domain.enums;

public enum Perfil {
    ADMIN("Administrador"),
    Prestador("Prestador"),
    CLIENTE("Cliente");

    private final String descricao;

    private Perfil(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
}
