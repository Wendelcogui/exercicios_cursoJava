package Entidades;

public class Pessoa {
	
    private int numeroConta;
    private String nomeTitular;
    private double valorDeposito;
    
    public static String formatarCasaDecimal(double valor) {
		return String.format("%.2f" , valor);
    }
	public Pessoa(String nomeTitular,int numeroConta) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}
	public Pessoa(int numeroConta, String nomeTitular, double novoDeposito) {
			this.numeroConta = numeroConta;
			this.nomeTitular = nomeTitular;
			this.valorDeposito = novoDeposito;				
	}
	
	public Pessoa() {
		
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setnumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public double getValorDeposito() {
		return valorDeposito;
	}
	public void setValorDeposito(double valorDeposito) {
		this.valorDeposito = valorDeposito;		
	}
	  
}
