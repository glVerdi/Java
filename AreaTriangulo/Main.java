import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();
        System.out.println("Digite os valores para o triângulo x: ");
        x.a= sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Digite os valores para o triângulo y: ");
        y.a = sc.nextDouble();
        y.b= sc.nextDouble();
        y.c= sc.nextDouble();
        double areax = x.area();
        double areay = y.area();
        System.out.printf("A área do triângulo x é: %.4f%n", areax);
        System.out.printf("A área do triângulo y é: %.4f%n", areay);
        if (areax > areay){
            System.out.println("A maior área é a do triângulo x");
        }
        else {
            System.out.println("A maior área é a do triângulo y");
        }
        sc.close();
    }
}
