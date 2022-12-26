import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		
		int qte1,qte2;
		double valorpeca,valorpeca2,valorapagar;
		
		sc.nextInt();
		qte1 = sc.nextInt();
		valorpeca = sc.nextDouble();
		
		
		
		sc.nextInt();
		qte2 = sc.nextInt();
		valorpeca2 = sc.nextDouble();
		
		
		
		valorapagar = valorpeca*qte1 + valorpeca2 * qte2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n",valorapagar);
		
		
		
		
		sc.close();
	}

}
