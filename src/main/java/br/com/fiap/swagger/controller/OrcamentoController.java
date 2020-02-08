package br.com.fiap.swagger.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import br.com.fiap.swagger.model.Orcamento;

@RestController
@RequestMapping("orcamento")
public class OrcamentoController {
	
	@RequestMapping(method= RequestMethod.POST)
	public Orcamento orcamentoVenda(@RequestBody Orcamento orc) {
		return orc;
	}

}
