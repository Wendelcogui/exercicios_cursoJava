package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

import Entidades.Funcionario;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		   
		  Funcionario funcionario = new Funcionario();
		  System.out.println("NOME: ");
		  funcionario.setnome(sc.next());
		  
		  System.out.println("Salario bruto: ");
		  funcionario.setsalarioBruto(sc.nextDouble());
		  
		  System.out.println("Imposto: ");
		  funcionario.setimposto(sc.nextDouble());
		  
		  System.out.println("Funcionario: " + funcionario.getnome() +", R$"+ formatarCasaDecimal(funcionario.salarioLinquido()));
		  
		  System.out.println();
		  System.out.println("Qual porcentagem aumentar o salário?");
		  double porcentagem = sc.nextDouble();
		  System.out.println();
		  System.out.println("Dados atualizados: "+ funcionario.getnome()+ ", R$"+ formatarCasaDecimal(funcionario.aumentarSalario(porcentagem)));
		
		sc.close();

	}
	private static String formatarCasaDecimal(double valor) {
		return String.format("%.2f" , valor);
	}
}
