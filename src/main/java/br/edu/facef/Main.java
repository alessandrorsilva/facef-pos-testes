package br.edu.facef;

import br.edu.facef.business.Calculos;
import br.edu.facef.business.ClienteBusiness;
import br.edu.facef.dao.ClienteDAO;
import br.edu.facef.model.Cliente;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Calculadora");
		
		Calculos calculos = new Calculos();
		
		Integer soma = calculos.somar(3, 5);
		
		System.out.println("resultado: " + soma);
		
		System.out.println("---- salvar cliente");
		
		Cliente novoCliente = new Cliente();
		novoCliente.setNome("Jose da silva");
		novoCliente.setEstado("SP");
		novoCliente.setCidade("Franca City");
		
		ClienteBusiness clienteBusiness = 
				new ClienteBusiness(new ClienteDAO());
		
		Cliente clienteSalvo = 
				clienteBusiness.salvarCliente(novoCliente);
		
		System.out.println("Cliente salvo: " + clienteSalvo);

	}

}
