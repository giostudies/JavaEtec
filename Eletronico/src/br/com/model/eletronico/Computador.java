package br.com.model.eletronico;

public class Computador extends Eletronico {
	private String configuracao;
	private double precoFinal;

	public String getConfiguracao() {
		return configuracao;
	}

	public void setConfiguracao(String configuracao) {
		this.configuracao = configuracao;
	}

	public double getPrecoFinal() {
		return precoFinal;
	}

	public void setPrecoFinal(double precoFinal) {
		this.precoFinal = precoFinal;
	}
	
	public double calcularPrecoFinal (double precoFinal) {
		double diferencaPreco = precoFinal - precoOrcamento;
		String retornoFinal = "A diferença do preco é:" + diferencaPreco;
		return  diferencaPreco;
	}
	
}
