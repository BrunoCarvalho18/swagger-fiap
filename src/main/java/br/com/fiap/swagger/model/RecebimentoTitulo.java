package br.com.fiap.swagger.model;

public class RecebimentoTitulo {
	
	public RecebimentoTitulo() {}
	
	private String fatura;
	Cliente cpf;
	Venda tipoPagamento;
	private String atualizacaoFinanceira;
	
	
	public String getFatura() {
		return fatura;
	}
	public String getAtualizacaoFinanceira() {
		return atualizacaoFinanceira;
	}
	
	@Override
	public String toString() {
		return "RecebimentoTitulo [fatura=" + fatura + ", cpf=" + cpf + ", tipoPagamento=" + tipoPagamento
				+ ", atualizacaoFinanceira=" + atualizacaoFinanceira + "]";
	}

}
