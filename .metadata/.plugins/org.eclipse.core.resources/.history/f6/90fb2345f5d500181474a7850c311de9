package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product1Interface;

public class Program4DeclaredLambdaExpression {

	public static void main(String[] args) {

		List<Product1Interface> list = new ArrayList<>();

		list.add(new Product1Interface("Tv", 900.00));
		list.add(new Product1Interface("Mouse", 50.00));
		list.add(new Product1Interface("Tablet", 350.50));
		list.add(new Product1Interface("HD Case", 80.90));

		double factor = 1.1;

		Consumer<Product1Interface> cons = p -> {
			p.setPrice(p.getPrice() * factor);
		};

		list.forEach(cons);

		list.forEach(System.out::println);
	}
}