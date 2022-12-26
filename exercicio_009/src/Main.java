import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		
		int A,B,duracao;
		
		
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		if(A > B ) {
			duracao=A-B;
			
		}
		else {
			duracao=24 -A + B;
		}
		
		System.out.printf("O JOGO DUROU "+ duracao+ " HORAS ");
		
		sc.close();

	}

}
