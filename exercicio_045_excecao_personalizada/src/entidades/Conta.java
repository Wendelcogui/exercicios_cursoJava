package entidades;

import modelo.excecao.DominioExcecao;

public class Conta {
	
	private Integer numero;
	private String titular;
	private Double equilibrio;
	private Double limiteDeRetirada;
	
	public Conta() {
	}

	public Conta(Integer numero, String titular, Double equilibrio, Double limiteDeRetirada) {
		this.numero = numero;
		this.titular = titular;
		this.equilibrio = equilibrio;
		this.limiteDeRetirada = limiteDeRetirada;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getEquilibrio() {
		return equilibrio;
	}

	public void setEquilibrio(Double equilibrio) {
		this.equilibrio = equilibrio;
	}

	public Double getLimiteDeRetirada() {
		return limiteDeRetirada;
	}

	public void setLimiteDeRetirada(Double limiteDeRetirada) {
		this.limiteDeRetirada = limiteDeRetirada;
	}
	
	public void deposito(double quantidade) {
		equilibrio += quantidade;
	}
	
	public void retirada(double quantidade) {
		validarRetirada(quantidade);
		equilibrio -= quantidade;
	}
	
	public void validarRetirada(double quantidade) {
	
		if (quantidade > getLimiteDeRetirada()) {
			throw new DominioExcecao("Erro de saque: A quantia excede o limite de saque");
		}
		if(quantidade > getEquilibrio()) {
			throw new DominioExcecao("Erro de saque: Saldo insuficiente");
		}
	}
}
