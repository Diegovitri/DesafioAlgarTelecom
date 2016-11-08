package com.example;

import java.util.ArrayList;
import java.util.List;

import model.Cliente;

public class Principal {
	
	public static void main(String[] args) throws Exception{
		List<Cliente> clientes = new ArrayList<Cliente>();
		
		Cliente c1 = new Cliente("douglas","079.967.176-21",28,"M");
		Cliente c2 = new Cliente("diego","454.897.987-11",24,"M");
		Cliente c3 = new Cliente("paulo","3",21,"F");
		
		
		clientes.add(c1);
		clientes.add(c2);
		clientes.add(c3);
		
		for (Cliente cliente : clientes) {
			if(cliente.getNome().equals("diego")){
			System.out.println(cliente);
			}
		}
	}

}
