package br.com.fiap.swagger.controller;

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

}
