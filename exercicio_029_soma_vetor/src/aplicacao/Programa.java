package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar ?");
		int n = sc.nextInt();
		
		double vect[] = new double[n];
		
		for(int i = 0; i<n; i++ ) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		System.out.print("Valores = ");
		
		for(int i = 0; i<n; i++ ) {
			
			System.out.printf("%.1f " ,vect[i]);
		}
		System.out.println();
		double sm = 0.0;
		for(int i = 0; i<n; i++ ) {
			sm += vect[i];	
		}
		
		System.out.printf("Soma = %.2f%n ", sm);
		double media = sm / n;
		System.out.printf("Media = %.2f%n ", media);
		
		
		
		sc.close();

	}

}
