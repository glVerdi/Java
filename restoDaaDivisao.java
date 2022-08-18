import java.util.Locale;
import java.util.Scanner;

public class restoDaaDivisao {
    public static void main (String[] args) {
        System.out.println("Digite dois numeros reais: o primeiro para ser o divisor e o segundo para ser o quociente e ira mostrar qual o resultado e o resto dessa divisao");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        //int d, n, resto;
        float resultado, d, n, resto;
        n = sc.nextFloat();
        d = sc.nextFloat();
        resultado = n / d;
        resto = n % d;
        System.out.println("resultado = " + resultado);
        System.out.println("resto = " + resto);
        sc.close();
    }
}