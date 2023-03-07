package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;
import modelo.excecao.DominioExcecao;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inserir dados da conta");
		System.out.print("Número:");
		int numero = sc.nextInt();
		sc.nextLine();
		System.out.print("Titular:");
		String titular = sc.nextLine();
		System.out.print("Saldo inicial:");
		double saldoInicial = sc.nextDouble();
		System.out.print("Limite de retirada:");
		double limiteDeRetirada = sc.nextDouble();
		
		Conta conta = new Conta(numero, titular, saldoInicial, limiteDeRetirada);
		
		System.out.println();
		System.out.print("Insira o valor para retirada: ");
		double valorRetirada = sc.nextDouble();
		
		try {
			conta.retirada(valorRetirada);
			System.out.printf("Novo saldo: %.2f%n", conta.getEquilibrio());
		}
		catch (DominioExcecao e) {
			System.out.println(e.getMessage());
		}	
		sc.close();
	}
}
