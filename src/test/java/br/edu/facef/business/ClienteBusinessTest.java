package br.edu.facef.business;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import br.edu.facef.dao.ClienteDAO;
import br.edu.facef.model.Cliente;

@RunWith(MockitoJUnitRunner.class)
public class ClienteBusinessTest {

	@Mock
	private ClienteDAO clienteDAO;
	
	
	@Test
	public void deveriaSalvarClienteSucesso() {
		
		Cliente clienteMock = new Cliente();
		clienteMock.setId(111L);
		clienteMock.setNome("Maria da Silva");
		clienteMock.setCidade("Monte Santo de Minas");
		clienteMock.setEstado("MG");
		
		Cliente novoCliente = new Cliente();
		novoCliente.setNome("Jose da silva");
		novoCliente.setEstado("SP");
		novoCliente.setCidade("Franca City");
		
		Mockito.when(clienteDAO.salvar(novoCliente))
			.thenReturn(clienteMock);
		
		ClienteBusiness clienteBusiness = 
				new ClienteBusiness(clienteDAO);
		
		Cliente clienteSalvo = 
				clienteBusiness.salvarCliente(novoCliente);
		
		System.out.println(clienteSalvo);
		
		assertEquals(new Long(111), clienteSalvo.getId());
		
	}

}
