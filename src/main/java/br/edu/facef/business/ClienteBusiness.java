package br.edu.facef.business;

import br.edu.facef.dao.ClienteDAO;
import br.edu.facef.model.Cliente;

public class ClienteBusiness {

	private ClienteDAO clienteDAO;
	
	public ClienteBusiness(ClienteDAO dao) {
		this.clienteDAO = dao;
	}
	
	public Cliente salvarCliente(Cliente cliente) {
		
		if(cliente == null
				|| cliente.getNome().isEmpty()) {
			
			throw new RuntimeException("nome requerido");
		}
		
		return this.clienteDAO.salvar(cliente);		
		
	}
}
