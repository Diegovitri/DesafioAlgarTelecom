package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import model.Cliente;
import model.JsonResponse;
import service.ClienteService;

@RestController
public class ClienteController {

	@Autowired
	ClienteService cli;

	@RequestMapping("/clientes")
	public List<Cliente> getAll() {
		return cli.getAll();
	}

	@RequestMapping(value = "/nome", method = RequestMethod.GET)
	public ArrayList<Cliente> getCliente(@RequestParam("nome") String nome) {
		return cli.getCliente(nome);
	}
	
	@RequestMapping(value = "/cpf", method = RequestMethod.GET)
	public Cliente getCpf(@RequestParam("cpf") String cpf) {
		return cli.getCpf(cpf);
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@ResponseBody
	public  JsonResponse clienteAdd(@RequestBody Cliente clien) {
		boolean resposta = cli.clienteAdd(clien);
		JsonResponse resp = new JsonResponse();
		
		if(resposta){
			resp.setStatus(0);
		}else{
			resp.setStatus(1);
		}		
		return resp;
	}
}
