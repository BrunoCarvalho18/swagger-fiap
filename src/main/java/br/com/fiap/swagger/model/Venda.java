package br.com.fiap.swagger.model;

public class Venda {

	
	private Venda() {
	}

	private String produto;
	Cliente cpf;
	private double valor;
	private String tipoPagamento;
	private String notaFiscal;

	public String getProduto() {
		return produto;
	}

	public double getValor() {
		return valor;
	}

	public String getTipoPagamento() {
		return tipoPagamento;
	}

	public String getNotaFiscal() {
		return notaFiscal;
	}
	
	@Override
	public String toString() {
		return "Venda [produto=" + produto + ", cpf=" + cpf + ", valor=" + valor + ", tipoPagamento=" + tipoPagamento
				+ ", notaFiscal=" + notaFiscal + "]";
	}


}
