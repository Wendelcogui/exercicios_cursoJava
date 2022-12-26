package aplicacao;

import java.util.Scanner;

import entidade.Pessoas;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Pessoas[] vetor = new Pessoas[10];
		
		System.out.println("Quantos quartos serão alugados? ");
		int n = sc.nextInt();
		
		for(int i =0; i<n; i++) {
			System.out.println("Aluguel #" + ( i+1 )+" :");
			System.out.print("Nome: ");
			sc.nextLine();
		    String nome = sc.nextLine();
		    System.out.print("Email: ");
		    String email = sc.nextLine();
		    System.out.print("Quartos: ");
		    int quartos = sc.nextInt();	
		    vetor[quartos] = new Pessoas(nome,email);
		}
		System.out.println();
		System.out.println("Quartos ocupados: ");
		for(int i = 0; i < 10; i++) {
			if(vetor[i] != null) {
				System.out.println(i + ": " + vetor[i].getNome() + ":" + vetor[i].getEmail());
			}
		}
		sc.close();
	}

}
