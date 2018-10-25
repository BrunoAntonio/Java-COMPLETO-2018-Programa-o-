package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();

		System.out.print("Enter file path: ");
		String source = sc.nextLine();
		System.out.println();
		// "C:\\Users\\Bruno\\Desktop\\Java\\Eclipse-Workspace\\.metadata\\udemy_Cap11Ex5Reforco\\sourceFile.csv"

		try (BufferedReader br = new BufferedReader(new FileReader(source))) {
			String line = br.readLine();

			while (line != null) {
				System.out.println(line);

				String[] vect = line.split(",");
				String name = vect[0];
				double price = Double.parseDouble(vect[1]);
				int quantity = Integer.parseInt(vect[2]);

				Product product = new Product(name, price, quantity);
				list.add(product);

				line = br.readLine();

			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println();
		File sourceFile = new File(source);
		String folder = sourceFile.getParent();
		System.out.print(folder);
		System.out.println();

		boolean success = new File(folder + "\\out").mkdir();
		System.out.println("Directory created successfully: " + success);

		String summary = folder + "\\out\\summary.csv";

		System.out.println();

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(summary))) {

			for (Product item : list) {
				String line = item.getName() + "," + String.format("%.2f", item.total());
				bw.write(line);
				bw.newLine();
				System.out.println(line);
			}

			System.out.println(summary + " CREATED!");

		} catch (IOException e) {
			e.printStackTrace();
		}

		sc.close();
	}

}
