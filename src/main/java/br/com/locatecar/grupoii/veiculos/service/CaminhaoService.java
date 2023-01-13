package br.com.locatecar.grupoii.veiculos.service;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.locatecar.grupoii.veiculos.model.Caminhao;

public class CaminhaoService implements CrudVeiculos<Caminhao> {
	static Path path = Paths.get("C:\\Users\\agame\\IdeaProjects\\projetoLocateCar\\src\\main\\java\\arquivos\\caminhao.txt");

	@Override
	public void adicionar(List<Caminhao> veiculos) {
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
	public List<Caminhao> listar() {
		List<Caminhao> caminhoes = new ArrayList<Caminhao>();
		
		return caminhoes;
	}

	@Override
	public void remover(List<Caminhao> veiculos, String placa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editar(List<Caminhao> veiculos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(List<Caminhao> veiculos) {
		// TODO Auto-generated method stub
		
	}
	
	

}
