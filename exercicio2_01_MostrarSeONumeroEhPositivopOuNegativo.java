import java.util.Scanner;

public class exercicio2_01_MostrarSeONumeroEhPositivopOuNegativo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if (n < 0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("NAO NEGATIVO");
		}
		
		sc.close();

	}

}
