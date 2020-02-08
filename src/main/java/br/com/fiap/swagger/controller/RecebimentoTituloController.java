package br.com.fiap.swagger.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.swagger.model.RecebimentoTitulo;

@RestController
@RequestMapping("recebimento")
public class RecebimentoTituloController {
	
	@RequestMapping(method= RequestMethod.POST)
	public RecebimentoTitulo recebimentoTitulo(@RequestBody RecebimentoTitulo receb) {
		return receb;
	}

}
