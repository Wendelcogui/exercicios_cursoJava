package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		
		String nome[] = new String[n];
		int idade[] = new int[n];
		
		for(int i =0;i<n;i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa: ");
			System.out.print("nome:");
			nome[i] = sc.next();
			System.out.print("idade: ");
			idade[i] = sc.nextInt();
		}
		int maiorIdade = idade[0];
		int posicaoMaior =0;
		
		for(int i=0;i<n;i++) {
		if (idade[i] > maiorIdade) {
            maiorIdade = idade[i];
            posicaoMaior = i;
		   }
		}
		System.out.printf("PESSOA MAIS VELHA: %s\n", nome[posicaoMaior]);
		
		sc.close();

	}

}
