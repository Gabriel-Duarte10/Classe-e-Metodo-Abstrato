package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.People;
import entities.PeopleFisica;
import entities.PeopleJuridica;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<People> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i=1 ; i<=n; i++) {
			System.out.println("Tax payer " + i + "# data:");
			System.out.print("Individual or company (f/j)? ");
			char op = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			double anual = sc.nextDouble();
			if(op == 'f') {
				System.out.print("Health expenditures: ");
				double medico = sc.nextDouble();
				PeopleFisica pep = new PeopleFisica(name, anual, medico);
				list.add(pep);
			}else {
				
					System.out.print("Number of employees: ");
					int num = sc.nextInt();
					PeopleJuridica jud = new PeopleJuridica(name, anual, num);
					list.add(jud);
				
			}
		}
		
		for(People c : list) {
			System.out.println(c.getName() + " $ " + c.calculoImp());
		}
		
		System.out.println();
		double sum=0;
		for(People c : list) {
			sum = sum + c.calculoImp();
		}
		System.out.print("TOTAL TAXES: " + String.format("%.2f", sum));
		
		
		sc.close();
	}

}
