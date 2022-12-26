import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		   
		  int n = sc.nextInt();
		  int resposta = 0;
		  int aux = 1 ;
		  
		  if (n > 0) {
			  for (int i = 1; i < n; i++) {
				resposta = n - i ;
				aux = resposta * aux;	
			}
			   resposta = aux * n * 1;
			   System.out.println("o fatorial de " + n + " é : " + resposta);
		  }
		  
		  else {
			  System.out.println("o fatorial de " + n + " é : 1");
		  }
		   
		
		
		sc.close();

	}

}
