package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product1Interface;

public class Program5InlineLambdaExpressionMelhorSolucao {

	public static void main(String[] args) {

		List<Product1Interface> list = new ArrayList<>();

		list.add(new Product1Interface("Tv", 900.00));
		list.add(new Product1Interface("Mouse", 50.00));
		list.add(new Product1Interface("Tablet", 350.50));
		list.add(new Product1Interface("HD Case", 80.90));

		double factor = 1.1;

		list.forEach(p -> p.setPrice(p.getPrice() * factor));

		list.forEach(System.out::println);

	}
}