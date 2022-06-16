package Employes;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employe> list = new ArrayList<>();
		
		System.out.print("How many employes will be registered? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println();
			System.out.println("Employe #" + i + ": ");

			System.out.print("Id: ");
			int id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Employe(id, name, salary));
		}
		
		System.out.println();
		System.out.print("Enter the employe id that will have salary increase: ");
		int id = sc.nextInt();
		Employe emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increasesalary(percentage);
		}

		
		System.out.println();
		System.out.println("List of employes:");
		for (Employe obj : list) {
			System.out.println(obj);
		}
				
		sc.close(); 
	}
	
	public static boolean hasId(List<Employe> list, int id) {
		Employe emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}