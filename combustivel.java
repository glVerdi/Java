import java.util.Scanner;

public class combustivel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		while (x !=4 ) {
			if (x == 1) {
				alcool = alcool + 1;
			} else if ( x == 2) {
				gasolina = gasolina + 1;
			}else if (x == 3) {
				diesel = diesel + 1;
			}
			x = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("gasolina: " + gasolina);
		System.out.println("diesel: " + diesel);

	}

}
