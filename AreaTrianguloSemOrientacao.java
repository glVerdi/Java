//package application;
import java.util.Scanner;
import java.util.Locale;
public class AreaTrianguloSemOrientacao {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double xa, xb, xc, ya, yb, yc;
        System.out.println("Digite os valores para o triângulo x: ");
        xa = sc.nextDouble();
        xb = sc.nextDouble();
        xc = sc.nextDouble();
        System.out.println("Digite os valores para o triângulo y: ");
        ya = sc.nextDouble();
        yb = sc.nextDouble();
        yc = sc.nextDouble();
        double px = (xa + xb + xc) / 2.0;
        double areax = Math.sqrt(px * (px - xa) * (px - xb) * (px - xc));
        double py = (ya + yb + yc) / 2.0;
        double areay = Math.sqrt(py * (py - ya) * (py - yb) * (py - yc));
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
