package aplicacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entidades.Produto;
import entidades.ProdutoImportado;
import entidades.ProdutoUsado;

public class Programa {

	public static void main(String[] args) {
			
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Produto> list = new ArrayList<>();
		
		System.out.print("Digite a quantidade de produtos: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do #" + i + " produto: ");
			System.out.print("Comum, usado ou importado (c/u/i)?");
			char cui = sc.next().charAt(0);
			
			System.out.print("Nome:");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.println("Preço:");
			double preco = sc.nextDouble();		
			if (Character.toUpperCase(cui) == 'I') {
				System.out.println("Taxa alfandegária: ");
				double taxaAlfandegaria = sc.nextDouble();
				
				list.add(new ProdutoImportado(nome , preco, taxaAlfandegaria)); 			
			}
			else if (Character.toUpperCase(cui) == 'I') {
				System.out.println("Data de fabricação (DD/MM/AAAA):");
				LocalDate data = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new ProdutoUsado(nome, preco, data));
			}
			else {
				list.add(new Produto(nome, preco));
			}
		}
		
		    System.out.println();
		    System.out.println("ETIQUETAS DE PREÇO:");
		    for(Produto pdt : list) {
		    	System.out.println(pdt.etiquetaDePreco());
		    }
		
		sc.close();
	}
}
