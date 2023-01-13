package br.com.locatecar.grupoii.veiculos.service;

import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import br.com.locatecar.grupoii.veiculos.model.Carro;

public class CarroService implements CrudVeiculos<Carro> {
	
	static Path path = Paths.get("C:\\Users\\agame\\IdeaProjects\\projetoLocateCar\\src\\main\\java\\arquivos\\carros.txt");

	@Override
	public void adicionar(List<Carro> veiculos) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String saidaCarroJson = gson.toJson(veiculos);
		
		try{
            if(!Files.exists(path)){
                Files.createFile(path);
                Files.writeString(path, "[]");
            }
            Files.writeString(path, saidaCarroJson);
		}catch (Exception e) {
			System.out.println("N�o � poss�vel cadastrar veiculos");
		}    
		
	}
	
	@Override
	public List<Carro> listar() {
		List<Carro> carros = new ArrayList<Carro>();
		Gson gson = new Gson();
		String linha = "";
		try {
			if(!Files.exists(path)) {
				Files.createFile(path);
			}
			linha = Files.readString(path);
		}catch (Exception e) {
			System.out.println("Lista n�o encontrada");
			return carros;
		}
		
		Type tipoDeLista = new TypeToken<ArrayList<Carro>>(){}.getType();
		carros = gson.fromJson(linha, tipoDeLista);
		
		return carros;
	}

	@Override
	public void remover(List<Carro> veiculos, String placa) {
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		for(int i = 0; i< veiculos.size(); i++) {
			if(veiculos.get(i).getPlaca().equals(placa)){
				veiculos.remove(i);
				}
		}	
			
		String saidaCarroJson = gson.toJson(veiculos);
		
		try{
            if(!Files.exists(path)){
                Files.createFile(path);
                Files.writeString(path, "[]");
            }
            Files.writeString(path, saidaCarroJson);
		}catch (Exception e) {
			System.out.println("N�o � poss�vel excluir veiculo");
		}    
		
	}

	@Override
	public void editar(List<Carro> veiculos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(List<Carro> veiculos) {
		// TODO Auto-generated method stub
		
	}

}
