package br.com.locatecar.grupoii.veiculos.model;


public class Carro extends Veiculos{
	
	public Carro() {
		super.setTipoVeiculo(TipoVeiculo.CARRO);
		super.setStatusVeiculo(StatusVeiculo.DISPONÍVEL);
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

}
