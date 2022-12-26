package Aplicacao;

import java.util.Locale;
import java.util.Scanner;
import Entidade.Retangulo;


public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
           
          Retangulo retangulo = new Retangulo();
          
          System.out.println("Digite largura e altura do retângulo: ");
          System.out.print("largura: ");
          retangulo.setLargura(sc.nextDouble());
          System.out.print("altura: ");
          retangulo.setAltura(sc.nextDouble());
          
          System.out.println();
          
          System.out.println("AREA = " + formatarCasaDecimal(retangulo.area()));
          System.out.println("PERIMETRO = " + formatarCasaDecimal(retangulo.perimetro()));
          System.out.println("DIAGONAL = " + formatarCasaDecimal(retangulo.diagonal()));
          
          
        
        sc.close();
	}
	private static String formatarCasaDecimal(double valor) {
		return String.format("%.2f" , valor);
	}

}
