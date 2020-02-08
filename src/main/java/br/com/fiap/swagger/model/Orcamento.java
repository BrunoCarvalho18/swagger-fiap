package br.com.fiap.swagger.model;

import java.util.Date;

public class Orcamento {
	
	private Orcamento() {}
	
	Venda produto;
	Cliente cpf;
	private Date vencimento;
	private long valorOrcamento;
	private int quantidade;


	public Date getVencimento() {
		return vencimento;
	}

	public long getValorOrcamento() {
		return valorOrcamento;
	}

	public int getQuantidade() {
		return quantidade;
	}
	
	@Override
	public String toString() {
		return "Orcamento [produto=" + produto + ", cpf=" + cpf + ", vencimento=" + vencimento + ", valorOrcamento="
				+ valorOrcamento + ", quantidade=" + quantidade + "]";
	}

}
