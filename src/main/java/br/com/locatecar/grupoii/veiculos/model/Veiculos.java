package br.com.locatecar.grupoii.veiculos.model;

import java.util.List;

public abstract class Veiculos {
	
	private String placa;
	private TipoVeiculo tipoVeiculo;
	private StatusVeiculo statusVeiculo;
	private List<HistoricoAluguel> historicoAluguel;
	private String marca;
	private String modelo;
	private Integer anoDeFabricao;
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Integer getAnoDeFabricao() {
		return anoDeFabricao;
	}
	public void setAnoDeFabricao(Integer anoDeFabricao) {
		this.anoDeFabricao = anoDeFabricao;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public TipoVeiculo getTipoVeiculo() {
		return tipoVeiculo;
	}
	public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}
	public StatusVeiculo getStatusVeiculo() {
		return statusVeiculo;
	}
	public void setStatusVeiculo(StatusVeiculo statusVeiculo) {
		this.statusVeiculo = statusVeiculo;
	}
	public List<HistoricoAluguel> getHistoricoAluguel() {
		return historicoAluguel;
	}
	public void setHistoricoAluguel(List<HistoricoAluguel> historicoAluguel) {
		this.historicoAluguel = historicoAluguel;
	}
	
	@Override
	public String toString() {
		return "placa: "+ this.placa+" Tipo Veiculo: "+ this.tipoVeiculo+" Status Veiculo: "+ this.statusVeiculo+
				" Marca: "+this.marca+" Modelo: "+this.modelo+" Ano Fabricacao: "+this.anoDeFabricao;
	}
	
	

}
