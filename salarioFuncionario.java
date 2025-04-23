import java.util.Scanner;

public class salarioFuncionario {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int numero, horas;
		double salario, valorHora;
		numero = sc.nextInt();
		horas = sc.nextInt();
		valorHora = sc.nextDouble();
		salario = valorHora * horas;
		System.out.println("NUMBER = " + numero);
		System.out.printf("SALARY = U$ %.2f\n", salario);
		
		
	}
}
