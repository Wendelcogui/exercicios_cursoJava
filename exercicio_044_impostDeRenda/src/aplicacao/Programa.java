package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Pessoa;
import entidades.PessoaFisica;
import entidades.PessoaJuridica;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> list = new ArrayList<>();
		
		System.out.print("Digite o número de contribuintes: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Dados do #" + i + " contribuintes:");
			System.out.print("Individual or company (i/c)? ");
			char ic = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome:");
			String nome = sc.nextLine();
			System.out.print("Rendimento anual:");
			double rendimentoAnual = sc.nextDouble();
				
			if (ic  == 'i'){
				System.out.print("Despesas com saúde:");
				double despesaSaude = sc.nextDouble();
				list.add(new PessoaFisica(nome, rendimentoAnual, despesaSaude));
			}
			else if (ic  == 'c') {
				System.out.print("Número de empregados: ");
				int funcionarios = sc.nextInt();
				
				list.add(new PessoaJuridica(nome, rendimentoAnual, funcionarios));
			}
		}	
		    double soma = 0.0;
			System.out.println();
			System.out.println("IMPOSTOS PAGOS: ");
		    for(Pessoa pessoa : list) {
		    	double tax = pessoa.tax();
				System.out.println(pessoa.getNome() + ": $ " + String.format("%.2f", tax));	
				soma += tax;
			}
		    System.out.println();
		    System.out.println("Total de impostos: $ " + String.format("%.2f", soma));
		    
		
		sc.close();
	}
}
