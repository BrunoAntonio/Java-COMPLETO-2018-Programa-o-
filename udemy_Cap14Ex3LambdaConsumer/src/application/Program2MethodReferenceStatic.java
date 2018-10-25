package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product2Static;

public class Program2MethodReferenceStatic {

	public static void main(String[] args) {
		List<Product2Static> list = new ArrayList<>();

		list.add(new Product2Static("Tv", 900.00));
		list.add(new Product2Static("Mouse", 50.00));
		list.add(new Product2Static("Tablet", 350.50));
		list.add(new Product2Static("HD Case", 80.90));

		list.forEach(Product2Static::staticPriceUpdate);

		list.forEach(System.out::println);
	}

}
