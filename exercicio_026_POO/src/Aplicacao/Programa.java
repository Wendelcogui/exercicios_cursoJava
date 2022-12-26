package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

import Entidades.conversorDeMoeda;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	    System.out.println("qual é o preço do dólar: $");
	    double cotacaoMoeda = sc.nextDouble();
		
		System.out.println("quantos dólares serão comprados: $");
		double valorEmDolares = sc.nextDouble();
		
	double valor = conversorDeMoeda.valorLiquido(cotacaoMoeda,valorEmDolares);
		
		System.out.printf("Valor a ser pago em reais = %.2f%n",valor);
		
		sc.close();

	}

}
