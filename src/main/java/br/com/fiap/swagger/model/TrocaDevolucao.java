package br.com.fiap.swagger.model;

public class TrocaDevolucao {
	
	public TrocaDevolucao() {}

	Venda produto;
	Cliente cpf;
	Venda notaFiscal;
	private int notaCredito;
	private String estoque;
		
	public int getNotaCredito() {
		return notaCredito;
	}
	public String getEstoque() {
		return estoque;
	}
	
	@Override
	public String toString() {
		return "TrocaDevolucao [produto=" + produto + ", cpf=" + cpf + ", notaFiscal=" + notaFiscal + ", notaCredito="
				+ notaCredito + ", estoque=" + estoque + "]";
	}

}
