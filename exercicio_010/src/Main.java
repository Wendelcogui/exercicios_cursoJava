import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double valorapagar = 0;
        
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();

		switch (codigo) {
		case 1:
			valorapagar = quantidade * 4.00;
			break;
		case 2:
			valorapagar = quantidade * 4.50;
			break;
		case 3:
			valorapagar = quantidade * 5.00;
			break;
		case 4:
			valorapagar = quantidade * 2.00;
			break;
		case 5:
			valorapagar = quantidade * 1.50;
			break;
		default:
			System.out.println("Codigo invalido");
			break;

		}
		if (valorapagar > 0)
			System.out.printf("TOTAL: R$ %.2f%n ", valorapagar);

		sc.close();

	}

}
