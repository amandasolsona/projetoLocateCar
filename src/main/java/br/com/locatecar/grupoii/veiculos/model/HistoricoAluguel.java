package br.com.locatecar.grupoii.veiculos.model;


import br.com.locatecar.grupoii.veiculos.enums.TipoOperacao;

import java.time.LocalDate;

public class HistoricoAluguel {

    private TipoOperacao tipoOperacao;

    private Agencia agencia;

    private Cliente cliente;

    private LocalDate dataRegistro;

    public TipoOperacao getTipoOperacao() {
        return tipoOperacao;
    }

    public void setTipoOperacao(TipoOperacao tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }
}
