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

		double min = 100.0;

		list.removeIf(p -> p.getPrice() >= min);

		System.out.println("Melhor Solução");
		for (Product1Interface p : list) {
			System.out.println(p);
		}
	}
}