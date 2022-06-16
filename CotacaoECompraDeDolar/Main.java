package CotacaoECompraDeDolar;

import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the dollar price? ");
        double dollar = sc.nextDouble();
        System.out.print("Who many dollars will be bough? ");
        double quantity = sc.nextDouble();
        double conversorValue = CurrencyConverter.conversor(dollar, quantity);
        System.out.printf("Amount to be paid in reais = %.2f%n", conversorValue);
    }
}
