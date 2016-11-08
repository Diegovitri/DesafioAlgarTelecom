package service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import model.Cliente;

@Service
public class ClienteService {
	private List<Cliente> clientes = new ArrayList<Cliente>();

/*	public ClienteService() {

		Cliente c1 = new Cliente("douglas", "043.134.134-55", 28, "M");
		Cliente c2 = new Cliente("diego", "454.897.987-11", 24, "M");
		Cliente c3 = new Cliente("paulo", "333.333.333-33", 21, "F");
		Cliente c4 = new Cliente("paulo", "123.123.123.12", 21, "m");

		clientes.add(c1);
		clientes.add(c2);
		clientes.add(c3);
		clientes.add(c4);

	}*/

	public ArrayList<Cliente> getCliente(String nome) {
		ArrayList<Cliente> agenda = new ArrayList<Cliente>();
		for (Cliente cliente : clientes) {
			if (cliente.getNome().equals(nome)) {
				agenda.add(cliente);
			}	
		}
		return agenda;
	}

	public Cliente getCpf(String cpf) {
		Object a = null;
		for (Cliente cliente : clientes) {
			if (cliente.getCpf().equals(cpf)) {
				a = cliente;
			}
				
		}
		return (Cliente) a;
	}

	public List<Cliente> getAll() {
		return clientes;
	}

	public boolean clienteAdd(Cliente clien) {
		return clientes.add(clien);
		
	}


}