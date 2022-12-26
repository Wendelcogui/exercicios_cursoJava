import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		double salario,a,total;
		
		
		salario = sc.nextDouble();
		
		if (salario < 2000.00) {
			 
			System.out.println("Isento");
		}
		else if(salario > 2000.00) {
			total = salario - 2000.00;
			 
			
			System.out.println( (total * 28/100 + 1500.00 * 18/100 + 1000.00 * 8/100));
		}
		else if (salario > 4500.00) {
			
		}
		else {
			
		}
		
		
		
		sc.close();

	}

}
