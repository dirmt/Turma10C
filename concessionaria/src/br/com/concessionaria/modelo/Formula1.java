package br.com.concessionaria.modelo;

public class Formula1 {
	private String cor;
	private String escuderia;
	private boolean	status;
	private float velocidadeAtual;
	private float valor;

	public void preencherEscuderia(String pEscuderia) {
		escuderia=pEscuderia.toUpperCase();
	}
	public String retornarEscuderia() {
		return escuderia;
	}
	public void preencherCor(String pCor); {
		cor = pCor.toUpperCase();
	}
	
	public String ligar () {
		status=true();
		return "Carro ligado";
	}
	public String desligar () {
			status=false();
			return "Carro ligado";
	}
}

