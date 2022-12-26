package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos alunos seram digitados? ");
		int n =sc.nextInt();
		
		String[] nome = new String[n];
		double[] notaUm = new double[n];
		double[] notaDois = new double[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i+1) + "a aluno:");
			sc.nextLine();
			nome[i] = sc.nextLine();
			notaUm[i] = sc.nextDouble();
			notaDois[i] = sc.nextDouble();
		}
		System.out.println("Alunos aprovados:");
		double media ;
		for(int i=0;i<n;i++) {
			media = notaUm[i] + notaDois[i] /2;
			
			if(media >= 6.0) {
				System.out.println(nome[i]);
			}
		}	
		sc.close();
	}
}
