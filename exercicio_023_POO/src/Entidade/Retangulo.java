package Entidade;

public class Retangulo {

	private double largura;
	private double altura;

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double area() {
		return largura * altura;	
	}

	public double perimetro() {
		return 2 * (largura + altura);
		
	}

	public double diagonal() {
	   return Math.sqrt((altura * altura)+(largura * largura));
	  
  }
}
