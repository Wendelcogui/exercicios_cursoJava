import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
			int Alcool = 0;
			int Gasolina = 0;
			int diesel = 0;
			
			int codigo = sc.nextInt();
			
				while (codigo != 4 ) {
						
					
					 if(codigo == 1) {
						 Alcool = Alcool + 1;
						System.out.println("Alcool");
					}
					 else if (codigo == 2) {
						 Gasolina = Gasolina + 1;
					 System.out.println("Gasolina");
					 }
					 else if (codigo == 3) {
						 diesel = diesel + 1;
						 System.out.println("Diesel");
					
					 }
					 else {
						 System.out.println("CODIGO INVALIDO");
					 }
				   codigo = sc.nextInt();
				}
				System.out.println("Muito obrigado");
				System.out.println("Alcool :" + Alcool );
				System.out.println("Gasolina :" + Gasolina);
				System.out.println("Diesel : " + diesel);
				
		sc.close();		

	}

}
