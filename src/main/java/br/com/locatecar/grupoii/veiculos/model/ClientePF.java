package br.com.locatecar.grupoii.veiculos.model;

import br.com.locatecar.grupoii.veiculos.enums.TipoCliente;

public class ClientePF extends Cliente {

    private String cpf;

    public ClientePF() {
        super.setTipoCliente(TipoCliente.PESSOA_FISICA);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
