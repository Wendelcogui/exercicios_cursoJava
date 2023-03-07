package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.Cliente;
import entidades.ItemDoPedido;
import entidades.Ordem;
import entidades.Produto;
import entidades.enums.StatusDoPedido;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Dados do cliente:");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Data de aniversario (DD/MM/YYY): ");
		Date dataAniversario = sdf.parse(sc.next()); // de string para date
		
		Cliente cliente = new Cliente(nome , email , dataAniversario); // instanciando os dados do cliente
		
		System.out.println("Insira os dados do pedido: ");
		System.out.print("Status: ");
		StatusDoPedido status = StatusDoPedido.valueOf(sc.next());
		
		Ordem ordem = new Ordem(new Date(), status, cliente); //instancia da ordem com status
			
		System.out.print("Quantos itens para este pedido? ");
		int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			System.out.println("Entre com o #" + (i+1)+ " item:");
			System.out.print("Nome do produto:");
			sc.nextLine();
			String nomeProduto = sc.nextLine();
			System.out.print("Preço do produto:");
			double precoProduto = sc.nextDouble();
			
			Produto produto = new Produto(nomeProduto, precoProduto);
			
			System.out.print("Quantidade: ");
			int quantidadeItens = sc.nextInt();
			
			ItemDoPedido itemDoPedido = new ItemDoPedido(quantidadeItens, precoProduto,produto);
			
			ordem.addItems(itemDoPedido);
		}
			System.out.println();
			System.out.println(ordem);
		
		sc.close();

	}

}
