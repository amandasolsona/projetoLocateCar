package br.com.locatecar.grupoii.veiculos.model;

import br.com.locatecar.grupoii.veiculos.enums.TipoCliente;

public abstract class Cliente {

    private TipoCliente tipoCliente;

    private String nome;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    protected void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}
