package br.com.locatecar.grupoii.veiculos.service;

import java.util.List;

public interface CrudVeiculos<T> {

	public void adicionar(List<T> veiculos);
	
	public List<T> listar();

	public void remover(List<T> veiculos, String placa);

	public void editar(List<T> veiculos);

	public void atualizar(List<T> veiculos);
}
