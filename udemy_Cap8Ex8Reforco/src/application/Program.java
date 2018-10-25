package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {

		List<TaxPayer> list = new ArrayList<>();

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of tax payers:");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char type = sc.next().charAt(0);
			
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			
			if (type == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpenditures));
			} else {
				System.out.print("Number of employees: ");
				int numbEmployees = sc.nextInt();

				//Company company = new Company(name, anualIncome, numbEmployees);
				//list.add(company);
				list.add(new Company(name, anualIncome, numbEmployees));

			}

		}
		System.out.println("");
		System.out.println("TAXES PAID:");

		double sum = 0.0;
		for (TaxPayer payer : list) {
			System.out.println(payer.getName() + ": $ " + String.format("%.2f", payer.tax()));
			sum += payer.tax();
		}
		System.out.println("");
		System.out.println("TOTAL TAXES: $ "+String.format("%.2f",sum));

		sc.close();
	}

}
