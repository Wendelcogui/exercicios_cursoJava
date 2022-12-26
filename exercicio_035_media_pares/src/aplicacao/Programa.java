package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);
		
		int somaPares = 0,npares= 0;
		double mediapares;
		
		System.out.println("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		int vect[] = new int[n];
		
		 for(int i=0; i<n;i++) {
			 System.out.print("Digite um numero: ");
			 vect[i] = sc.nextInt();
		 }	    
			for(int i =0; i<n; i++)	{
				if (vect[i] % 2 == 0) {
					somaPares = somaPares + vect[i];
					npares++;
				}
			}
			if (npares == 0) {
		    	System.out.println("NENHUM NUMERO PAR");
		    }
		    else {
		        mediapares = (double)somaPares / npares;

		        System.out.printf("MEDIA DOS PARES = %.1f\n", mediapares);
		    }
			  
		sc.close();

	}

}
