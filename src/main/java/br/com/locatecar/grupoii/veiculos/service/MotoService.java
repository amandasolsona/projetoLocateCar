package br.com.locatecar.grupoii.veiculos.service;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.locatecar.grupoii.veiculos.model.Moto;

public class MotoService implements CrudVeiculos<Moto> {
	static Path path = Paths.get("C:\\Users\\agame\\IdeaProjects\\projetoLocateCar\\src\\main\\java\\arquivos\\motos.txt");

	@Override
	public void adicionar(List<Moto> veiculos) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String saidaVeiculosJson = gson.toJson(veiculos);
		
		try{
            if(!Files.exists(path)){
                Files.createFile(path);
                Files.writeString(path, "[]");
            }
            Files.writeString(path, saidaVeiculosJson);
		}catch (Exception e) {
			System.out.println("N�o � poss�vel cadastrar veiculos");
		}    
		
	}
	
	@Override
	public List<Moto> listar() {
		List<Moto> motos = new ArrayList<Moto>();
		
		return motos;
		
	}

	@Override
	public void remover(List<Moto> veiculos, String placa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editar(List<Moto> veiculos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(List<Moto> veiculos) {
		// TODO Auto-generated method stub
		
	}

}
