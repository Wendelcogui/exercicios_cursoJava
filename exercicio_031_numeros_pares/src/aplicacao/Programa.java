package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
         
		Scanner sc = new Scanner(System.in);
		
		int n,quantidadePares;
		
		System.out.print("Quantos numeros voce vai digitar?");
	    n = sc.nextInt();
		
		int[] numeros = new int[n];
		
		for (int i =0; i<n; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS PARES: ");
		
		quantidadePares = 0;
		for(int i =0; i<n; i++)	{
			if (numeros[i] % 2 == 0) {
				System.out.printf("%d ",numeros[i]);
				quantidadePares++;
			}
		}
		System.out.println();
		System.out.printf("QUANTIDADE DE PARES = %d",quantidadePares);
		
		sc.close();
	}

 }

