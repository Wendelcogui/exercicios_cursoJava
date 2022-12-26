package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

import Entidades.Pessoa;

public class Programa {

	public static void main(String[] args) {
	   Locale.setDefault(Locale.US);
	   Scanner sc = new Scanner(System.in);
	   
	   Pessoa pessoa = new Pessoa();
	   
	   System.out.print("Digite o número da conta: ");
	   pessoa.setnumeroConta(sc.nextInt());
	   
	   System.out.print("Digite o titular da conta: ");
	   pessoa.setNomeTitular(sc.next());
	   
	   System.out.print("Existe um depósito inicial (s/n)?");
	    char resposta = sc.next().charAt(0);
	     if (resposta == 's') {
		   System.out.println("Digite o valor inicial do depósito: ");
		    pessoa.setValorDeposito(sc.nextDouble());	
	    }
	     
	        System.out.println();
	        System.out.println("Conta "+ pessoa.getNumeroConta() 
	        + " Titular: "+ pessoa.getNomeTitular()
	        +" Equilíbrio: R$ "+ Pessoa.formatarCasaDecimal(pessoa.getValorDeposito()));
	   
	         System.out.println("Digite um valor de depósito: ");
	         double novoDeposito = sc.nextDouble();
	         System.out.println("Dados atualizados da conta: ");
	         System.out.println("Conta "+ pessoa.getNumeroConta() 
	         			    	        + " Titular:"+ pessoa.getNomeTitular()
	         		 	    	        +" Equilíbrio: R$"+ Pessoa.formatarCasaDecimal(pessoa.getValorDeposito()+novoDeposito));
	         System.out.println("Digite um valor de retirada: ");
	         double saque = sc.nextDouble();
	         System.out.println("Conta "+ pessoa.getNumeroConta() 
 	           + " Titular: "+ pessoa.getNomeTitular()
 	           + " Equilíbrio: R$"+ Pessoa.formatarCasaDecimal(pessoa.getValorDeposito()+ novoDeposito - saque - 5.00));
	         	   
	   sc.close();
	}
		
}
