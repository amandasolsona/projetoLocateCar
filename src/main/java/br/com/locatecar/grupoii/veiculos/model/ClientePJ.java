package br.com.locatecar.grupoii.veiculos.model;

import br.com.locatecar.grupoii.veiculos.enums.TipoCliente;

public class ClientePJ extends Cliente {

    private String cnpj;

    public ClientePJ() {
        super.setTipoCliente(TipoCliente.PESSOA_JURIDICA);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

}
