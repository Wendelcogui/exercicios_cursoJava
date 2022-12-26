package Entidades;

public class Funcionario {
	
	private String nome;
	private double salarioBruto;
	private double imposto;
	
	public String getnome() {
		 return nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	public double getsalarioBruto() {
		return salarioBruto;
	}
	public void setsalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	public double getimposto() {
		return imposto;
	}
	public void setimposto(double imposto) {
		this.imposto = imposto;
	}
	
	public double salarioLinquido() {
		return salarioBruto - imposto;
	}
	public double aumentarSalario(double porcentagem) {
		return porcentagem * salarioBruto / 100 + salarioLinquido();
		
	}

}
