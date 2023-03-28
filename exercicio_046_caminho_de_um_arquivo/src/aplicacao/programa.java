package aplicacao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class programa {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Produto> list = new ArrayList<>();
		
		System.out.print("Entre com caminho do arquivo: ");
		String arquivoDeOrigemStr = sc.nextLine();
		
		File fonteDoArquivo = new File(arquivoDeOrigemStr);
		String pastaDeOrigemStr = fonteDoArquivo.getParent();
		
		boolean sucesso = new File(pastaDeOrigemStr + "\\out").mkdir();
		
		String arquivoDeDestinoStr = pastaDeOrigemStr + "\\out\\summary.csv";
		
		try(BufferedReader br = new BufferedReader(new FileReader(arquivoDeOrigemStr))){
			
			String itemCsv = br.readLine();
			while(itemCsv != null) {
				
				String[] campos = itemCsv.split(",");
				String nome = campos[0];
				Double preco = Double.parseDouble(campos[1]);
				int quantidade = Integer.parseInt(campos[2]);
				
				list.add(new Produto(nome, preco, quantidade));
				
				itemCsv = br.readLine();
			}
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoDeDestinoStr))){
				
				for(Produto item: list) {
					bw.write(item.getNome() + "," + String.format("%.2f", item.total()));
					bw.newLine();
				}
				
				System.out.println(arquivoDeDestinoStr + " : CRIADO");
				
			}catch(IOException e) {
				System.out.println("Erro ao gravar arquivo: " + e.getMessage());
			}
			
		}catch (IOException e) {
			System.out.println("Erro ao gravar arquivo: " + e.getMessage());
		}
		
		
		sc.close();
		

	}

}
