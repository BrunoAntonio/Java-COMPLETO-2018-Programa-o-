package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		List<Product> list = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char prodType = sc.next().charAt(0);
			if (prodType == 'i') {
				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Price: ");
				Double price = sc.nextDouble();
				System.out.print("Customs fee: ");
				Double fee = sc.nextDouble();

				//ImportedProduct imported = new ImportedProduct(name, price, fee);
				//list.add(new ImportedProduct(imported);
				list.add(new ImportedProduct(name, price, fee));
			}

			else if (prodType == 'c') {
				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Price: ");
				Double price = sc.nextDouble();

				//Product product = new Product(name, price);
				//list.add(product);
				list.add(new Product(name, price));
			}

			else {
				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Price: ");
				Double price = sc.nextDouble();
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());

				//UsedProduct used = new UsedProduct(name, price, date);
				//list.add(used);
				list.add(new UsedProduct(name, price, date));
			}

		}

		System.out.println("");
		System.out.println("PRICE TAGS:");
		for (Product p : list) {
			System.out.println(p.TagPrice());
		}

		sc.close();
	}

}
