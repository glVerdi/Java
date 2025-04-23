import java.util.Locale;
import java.util.Scanner;

public class conversaoTempratura {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char resposta;
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f\n", F);
			System.out.print("Deseja repetir (s/n)? ");
			resposta = sc.next().charAt(0);
		} while (resposta != 'n');

		/*
		 * int N = sc.nextInt();
		 * int soma = 0;
		 * for (int i = 0; i < N; i++) {
		 * int x = sc.nextInt();
		 * soma = soma + x;
		 * }
		 * int x3 = sc.nextInt();
		 * int soma = 0;
		 * while (x3 !=0) {
		 * soma = soma + x3;
		 * x3 = sc.nextInt();
		 * }
		 * int x1 = 5;
		 * int y = 32;
		 * double x = 10.35784;
		 * String nome = "Maria";
		 * int idade = 31;
		 * double renda = 4000.0;
		 * double a;
		 * int b;
		 * a = 5.0;
		 * b = (int) a;
		 * String w;
		 * int u;
		 * double o;
		 * char t;
		 * String s1, s2, s3;
		 * int minutos = sc.nextInt();
		 * double conta = 50.0;
		 * int x2 = sc.nextInt();
		 * String dia;
		 * double preco = 34.5;
		 * double desconto = (preco < 20.0) ? preco * 0.01 : preco * 0.05;
		 * System.out.println(y);
		 * System.out.println(x);
		 * System.out.printf("%.2f\n", x);
		 * Locale.setDefault(Locale.US);
		 * System.out.printf("%.4f\n", x);
		 * System.out.println("Bom dia!");
		 * System.out.println("Resultado = " + x + " metros");
		 * System.out.printf("Resultado = %.2f metros\n", x);
		 * System.out.printf("%s tem %d anos e ganha R$ %.2f reais\n", nome, idade,
		 * renda);
		 * System.out.println(b);
		 * w = sc.next();
		 * System.out.println("Você digitou: " + w);
		 * sc.nextLine();
		 * u = sc.nextInt();
		 * System.out.println("Você digitou: " + u);
		 * sc.nextLine();
		 * o = sc.nextDouble();
		 * System.out.printf("Você digitou: %.2f\n", o);
		 * sc.nextLine();
		 * t = sc.next().charAt(0);
		 * System.out.println("Você digitou: " + t);
		 * sc.nextLine();
		 * s1 = sc.nextLine();
		 * s2 = sc.nextLine();
		 * s3 = sc.nextLine();
		 * System.out.println("Dados Digitados:");
		 * System.out.println(s1);
		 * System.out.println(s2);
		 * System.out.println(s3);
		 * sc.close();
		 * System.out.println("Bom dia!");
		 * 
		 * if (x1 < 0) {
		 * System.out.println("Boa tarde!");
		 * }
		 * 
		 * System.out.println("Boa noite!");
		 * if (minutos > 100) {
		 * conta += (minutos - 100) * 2;
		 * }
		 * System.out.printf("Valor da conta = R$ %.2f\n", conta);
		 * switch(x2 ) {
		 * case 1:
		 * dia = "Domingo";
		 * break;
		 * case 2:
		 * dia = "Segunda";
		 * break;
		 * case 3:
		 * dia = "Terça";
		 * break;
		 * case 4:
		 * dia = "Quarta";
		 * break;
		 * case 5:
		 * dia = "Quinta";
		 * break;
		 * case 6:
		 * dia = "Sexta";
		 * break;
		 * case 7:
		 * dia = "Sábado";
		 * break;
		 * default:
		 * dia = "valor inváloido";
		 * break;
		 * }
		 * System.out.println("Dia da semana: " + dia);
		 * System.out.println(desconto);
		 * System.out.println(soma);
		 * System.out.println(soma);
		 */
		sc.close();
	}

}
