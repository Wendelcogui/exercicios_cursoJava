package Entidades;

public class conversorDeMoeda {
	
	public static double IOF = 0.06;
	
	public static double valorLiquido(double cotacaoMoeda , double valorEmDolares) {
		return cotacaoMoeda * valorEmDolares * (1.0 + IOF);
	}
}
