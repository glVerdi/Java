import java.util.Locale;
import java.util.Scanner;

public class exercicio06_AreaTrianguloRetangulo_AreaCirculo_AreaTrapezio_AreaQuadrado_AreaRetangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double A, B, C, area_triangulo_retangulo, area_circulo, pi, area_trapezio, 
		area_quadrado, area_retangulo;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		pi = 3.14159;
		area_triangulo_retangulo = (A * C) / 2;
		area_circulo = pi * C * C;
		area_trapezio = (A + B) * C / 2;
		area_quadrado = B * B;
		area_retangulo = A * B;
		System.out.printf("TRIANGULO: %.3f%n", area_triangulo_retangulo);
		System.out.printf("CIRCULO: %.3f%n", area_circulo);
		System.out.printf("TRAPEZIO: %.3f%n", area_trapezio);
		System.out.printf("QUADRADO: %.3f%n", area_quadrado);
		System.out.printf("RETANGULO: %.3f%n", area_retangulo);
		sc.close();

	}

}
