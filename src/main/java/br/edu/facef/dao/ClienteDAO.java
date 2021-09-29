package br.edu.facef.dao;

import br.edu.facef.model.Cliente;

public class ClienteDAO {

	public Cliente salvar(final Cliente cliente) {
		
		cliente.setId(999L);
		
		/*
		 * ConexaoBD(user, senha, host)
		 * conexao.statement(insert into cliente (
		 */
		
		//TODO: chamar função salvar bd
		
		return cliente;
	}
}
