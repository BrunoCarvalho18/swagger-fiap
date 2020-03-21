package br.com.fiap.swagger.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import br.com.fiap.swagger.model.TrocaDevolucao;

@RestController
@RequestMapping("devolucao")
public class TrocaDevolucaoController {
	
	@RequestMapping(method= RequestMethod.POST)
	public TrocaDevolucao recebimentoTitulo(@RequestBody TrocaDevolucao devolucao) {
		return devolucao;
	}
	
	@RequestMapping(method=RequestMethod.GET ,path= "{devolucao}")
	public void buscarRecebimentoTitulo(@PathVariable String devolucao) {
		
	
	}
	
	@RequestMapping(method=RequestMethod.DELETE ,path= "{devolucao}")
	public void deletarRecebimentoTitulo(@PathVariable String devolucao) {
		
	
	}
	
	@RequestMapping(method=RequestMethod.PUT ,path= "{devolucaoId}")
	public TrocaDevolucao alterarRecebimentoTitulo(@RequestBody TrocaDevolucao devolucao,@PathVariable String devolucaoId) {
		return devolucao;
	
	}

}
