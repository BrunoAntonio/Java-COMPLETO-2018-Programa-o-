package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product1Interface;

public class Program4DeclaredLambdaExpression {

	public static void main(String[] args) {

		List<Product1Interface> list = new ArrayList<>();

		list.add(new Product1Interface("Tv", 900.00));
		list.add(new Product1Interface("Mouse", 50.00));
		list.add(new Product1Interface("Tablet", 350.50));
		list.add(new Product1Interface("HD Case", 80.90));

		double min = 100.0;
		
		Predicate<Product1Interface> pred = p -> p.getPrice() >= min;
		
		list.removeIf(pred);

		for (Product1Interface p : list) {
			System.out.println(p);
		}
	}
}