package Exercicios8.salario;

import java.util.Locale;
import java.util.Scanner;

public class  Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employes employes = new Employes();
        System.out.println("Name");
        employes.name = sc.nextLine();
        System.out.println("Gross Salary");
        employes.grossSalary = sc.nextDouble();
        System.out.println("Tax");
        employes.tax = sc.nextDouble();
        System.out.println();
        System.out.println("Emplyes: "+ employes);
        System.out.println();
        System.out.print("With percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employes.increaseSalary(percentage);
        System.out.println();
        System.out.println("Updated data: "+ employes);
        sc.close();
    }
}
