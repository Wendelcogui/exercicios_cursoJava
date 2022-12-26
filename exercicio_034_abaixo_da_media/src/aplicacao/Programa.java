package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for (int i =0; i< n;i++) {
			System.out.println("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		System.out.println();
		double sm = 0.0;
		for (int i= 0; i<n; i++) {
			sm += vect[i];
		}		
		double media = sm / n;
		System.out.printf("MEDIA DO VETOR = %.3f%n",media);
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		for(int i =0; i<n; i++) {
		if ( vect[i] < media) {	
			System.out.println(vect[i]);
		   }		
		}	
		sc.close();
	}
}
