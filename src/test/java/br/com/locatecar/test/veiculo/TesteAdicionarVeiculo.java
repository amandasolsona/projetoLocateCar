package br.com.locatecar.test.veiculo;

import java.util.ArrayList;
import java.util.List;

import br.com.locatecar.grupoii.veiculos.model.Caminhao;
import br.com.locatecar.grupoii.veiculos.model.Carro;
import br.com.locatecar.grupoii.veiculos.model.Moto;
import br.com.locatecar.grupoii.veiculos.service.CaminhaoService;
import br.com.locatecar.grupoii.veiculos.service.CarroService;

public class TesteAdicionarVeiculo {

	public static void main(String[] args) {
		Carro c1 = new Carro();
		c1.setPlaca("ZZZ-9999"); c1.setMarca("FIAT");c1.setModelo("PALIO"); ;c1.setAnoDeFabricao(2010);
		Carro c2 = new Carro();
		c2.setPlaca("AAA-0000"); c2.setMarca("JEEP");c2.setModelo("RENEGADE"); ;c2.setAnoDeFabricao(2023);
		Moto m1 = new Moto();
		m1.setPlaca("BBB-9191"); m1.setMarca("HONDA");m1.setModelo("CG160"); ;m1.setAnoDeFabricao(2022);
		Moto m2 = new Moto();
		m2.setPlaca("BCB-9792"); m2.setMarca("YAMAHA");m2.setModelo("FAZER250"); ;m2.setAnoDeFabricao(2022);
		Caminhao caminhao = new Caminhao();
		caminhao.setPlaca("ABC-9792"); caminhao.setMarca("SCANIA");caminhao.setModelo("Highline R440"); ;c1.setAnoDeFabricao(2020);
		
	    List<Carro> carros = new ArrayList<Carro>();
		List<Moto> motos = new ArrayList<Moto>();
		List<Caminhao> caminhoes = new ArrayList<Caminhao>();
		
		carros.add(c1); carros.add(c2);
		motos.add(m1); motos.add(m2);
		caminhoes.add(caminhao);
		
		CaminhaoService caminhaoService = new CaminhaoService();
		caminhaoService.adicionar(caminhoes);
		
		CarroService carroService = new CarroService();
		carroService.adicionar(carros);
		List<Carro> listarCarros = carroService.listar();
		for(int i = 0; i<listarCarros.size(); i++) {
			System.out.println(listarCarros.get(i));
		}
		
		carroService.remover(listarCarros, "ZZZ-9999");
		
	}

}
