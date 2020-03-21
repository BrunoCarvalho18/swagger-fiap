package br.com.fiap.swagger.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import br.com.fiap.swagger.model.Venda;

@RestController
@RequestMapping("venda")
public class VendaController {
	
	@RequestMapping(method= RequestMethod.POST)
	public Venda venda(@RequestBody Venda venda) {
		return venda;
	}
	
	@RequestMapping(method=RequestMethod.GET ,path= "{venda}")
	public void buscarRecebimentoTitulo(@PathVariable String venda) {
		
	
	}
	
	@RequestMapping(method=RequestMethod.DELETE ,path= "{venda}")
	public void deletarRecebimentoTitulo(@PathVariable String venda) {
		
	
	}
	
	@RequestMapping(method=RequestMethod.PUT ,path= "{devolucaoId}")
	public Venda alterarRecebimentoTitulo(@RequestBody Venda venda,@PathVariable String vendaId) {
		return venda;
	
	}


}
