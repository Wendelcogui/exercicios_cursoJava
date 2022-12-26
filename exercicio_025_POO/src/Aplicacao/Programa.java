package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

import Entidades.Aluno;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.print("Nome do aluno: ");
		aluno.nome = sc.nextLine();
		System.out.print("Primeiro trimestre: ");
		aluno.nota1 = sc.nextDouble();
		System.out.print("Segundo trimestre: ");
		aluno.nota2 = sc.nextDouble();
		System.out.print("Terçeiro trimestre: ");
		aluno.nota3 = sc.nextDouble();
		
		System.out.println();
		
		System.out.printf("nota final: %.2f%n" , aluno.notaTotal());
		
		if (aluno.notaTotal() < 60.0) {
			System.out.println("REPROVADO");
			System.out.printf("Faltou %.2f Pontos%n", aluno.notaFinal());
		}
		else {
			System.out.println("PASSOU");
		}
		
		
		sc.close();

	}

}
