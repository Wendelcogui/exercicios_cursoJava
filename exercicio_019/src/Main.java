 import java.util.Locale;


 import java.util.Scanner;
    public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		  
		int N = sc.nextInt();
		   
		   for (int i = 0; i < N ; i++) {
			   
			   double primeiroP = sc.nextDouble();
		       double segundoP = sc.nextDouble();
		       double terceiroP = sc.nextDouble();
		       
		       double media = (primeiroP * 2.0 + segundoP * 3.0 + terceiroP * 5.0) / 10;
		       
		       System.out.printf("%.1f%n" , media);
		       
		   }
		
		sc.close();

	}

}
