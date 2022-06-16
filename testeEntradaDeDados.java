import java.util.Locale;
import java.util.Scanner;

public class testeEntradaDeDados {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String x;
		x = sc.next();
		System.out.println("Você digitou: " + x);
		sc.close();

		Scanner sc1 = new Scanner(System.in);
		int x1;
		x1 = sc.nextInt();
		System.out.println("Você digitou: " + x1);
		sc1.close();

		Locale.setDefault(Locale.US);
		Scanner sc2 = new Scanner(System.in);
		double x2;
		x2 = sc2.nextDouble();
		System.out.printf("Você digitou: %.2f%b", x2);
		sc2.close();

		Scanner sc3 = new Scanner(System.in);
		char x3;
		x3 = sc3.next().charAt(0);
		System.out.println("Você digitou: " + x3);
		sc3.close();

		Scanner sc4 = new Scanner(System.in);
		String x4;
		int y;
		double z;
		x4 = sc4.next();
		y = sc4.nextInt();
		z = sc4.nextDouble();
		System.out.println("Dados digitados");
		System.out.println(x4);
		System.out.println(y);
		System.out.println(z);
		sc4.close();

		Scanner sc5 = new Scanner(System.in);
		int x5;
		String s1, s2, s3;
		x5 = sc5.nextInt();
		sc5.nextLine();
		s1 = sc5.nextLine();
		s2 = sc5.nextLine();
		s3 = sc5.nextLine();
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x5);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		sc5.close();

	}

}
