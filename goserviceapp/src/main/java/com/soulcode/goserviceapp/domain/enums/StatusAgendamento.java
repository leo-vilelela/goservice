package com.soulcode.goserviceapp.domain.enums;

public enum StatusAgendamento {

    AGUARDANDO_CONFIRMACAO("Aguardando confirmação"),
    CONFIRMADO("Confirmado"),
    CONCLUIDO("Concluido"),
    CANCELADO_PELO_CLIENTE("Cancelado pelo cliente"),
    CANCELADO_PELO_PRESTADOR("Cancelado pelo prestador");

    private final String descricao;

    private StatusAgendamento(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
}
