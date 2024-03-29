import java.util.Locale;
import java.util.Scanner;

public class Celsius_para_Fahrenheight_while{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        char resp = "s";

        while(resp != "n"){
            System.out.print("Digite a temperatura em Celsiud: ");
            double C = sc.nextDouble();
            double F = 9.0 * C / 5.0 + 32;
            System.out.printf("Equivalente em Fahrenheight: %.1f%n", F);
            System.out.print("Deseja repetir(s/n)? ");
            resp = sc.next().charAt(0);
        }
        sc.close();
    }

}