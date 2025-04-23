import java.util.Scanner;

public class duracaoJogo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inicio = sc.nextInt();
		int fim = sc.nextInt();
		int tempo;
		if (inicio < fim) {
			tempo = fim - inicio;
		} else {
			tempo = 24 - inicio + fim;
		}
		System.out.println("O JOGO DUROU " + tempo + " HORA(S)");

	}

}
