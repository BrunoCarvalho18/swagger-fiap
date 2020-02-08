package br.com.fiap.swagger.model;

public class Cliente {
	
	public Cliente() {}

	private String cpf;

	public String getCpf() {
		return cpf;
	}
	public String setCpf() {
		return cpf;
	}
	
	@Override
	public String toString() {
		return "Cliente [cpf=" + cpf + "]";
	}

}
