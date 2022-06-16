import java.util.Locale;
import java.util.Scanner;

public class exercicio04_Salario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int numerofunc, horastrab;
		double valorhora, salario;
		numerofunc = sc.nextInt();
		horastrab = sc.nextInt();
		valorhora = sc.nextDouble();
		salario = horastrab * valorhora;
		System.out.println("NUMBER = " + numerofunc);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		sc.close();

	}

}
