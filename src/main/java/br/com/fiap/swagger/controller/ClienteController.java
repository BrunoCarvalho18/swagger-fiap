package br.com.fiap.swagger.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import br.com.fiap.swagger.model.Cliente;

@RestController
@RequestMapping("cliente") 
public class ClienteController {
	
	
	@RequestMapping(method= RequestMethod.POST)
	public Cliente cadastroCliente(@RequestBody Cliente cliente) {
		return cliente;
	}
	
	@RequestMapping("{cpf}")
	public void buscarCliente(@PathVariable String cpf) {
		
	
	}
	

}
