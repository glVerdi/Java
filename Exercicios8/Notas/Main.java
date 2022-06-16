package Exercicios8.Notas;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        System.out.print("Name: ");
        student.name = sc.nextLine();
        System.out.print("Grade 1: ");
        student.grade1 = sc.nextDouble();
        System.out.print("Grade 2: ");
        student.grade2 = sc.nextDouble();
        System.out.print("Grade 3: ");
        student.grade3 = sc.nextDouble();
        System.out.printf("Final Grde: %.2f%n", student.finalGrade());
        if(student.finalGrade() < 60.0){
            System.out.println("Failed");
            System.out.printf("Missing %.2f points%n", student.missingPoints());
        }else{
            System.out.println("Pass");
        }
        sc.close();
    }
}
