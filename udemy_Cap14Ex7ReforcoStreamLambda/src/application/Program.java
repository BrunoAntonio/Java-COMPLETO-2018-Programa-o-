package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Worker;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter full file path: ");
		String path = sc.next();

		// C:\\Users\\Bruno\\Desktop\\Java\\Eclipse-Workspace\\.metadata\\udemy_Cap14Ex7ReforcoStreamLambda\\in.txt

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<Worker> list = new ArrayList<>();

			String line = br.readLine();

			while (line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				String email = fields[1];
				double salary = Double.parseDouble(fields[2]);

				Worker worker = new Worker(name, email, salary);
				list.add(worker);
				line = br.readLine();

			}

			System.out.print("Enter salary: ");
			double salaryComp = sc.nextDouble();

			List<String> salarys = list.stream().filter(w -> w.getSalary() > salaryComp).map(p -> p.getEmail())
					.sorted().collect(Collectors.toList());

			System.out.println("Email of people whose salary is more than " + String.format("%.2f", salaryComp) + ":");

			salarys.forEach(System.out::println);

			double sum = list.stream().filter(w -> w.getName().charAt(0) == 'M').map(p -> p.getSalary()).reduce(0.0,
					(x, y) -> x + y);

			System.out
					.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sum) + ":");

		} catch (IOException e) {
			System.out.print("Error: " + e.getMessage());
		}

		sc.close();

	}

}