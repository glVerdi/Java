import java.util.Locale;
import java.util.Scanner;

public class exercicio05_ValorAPagarPorPeca {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int codpeca1, numpeca1, codpeca2, numpeca2;
		float valorpeca1, valorpeca2, total;
		codpeca1 = sc.nextInt();
		numpeca1 = sc.nextInt();
		valorpeca1 = sc.nextFloat();
		codpeca2 = sc.nextInt();
		numpeca2 = sc.nextInt();
		valorpeca2 = sc.nextFloat();
		total = (valorpeca1 * numpeca1) + (valorpeca2 * numpeca2);
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		sc.close();

	}

}
