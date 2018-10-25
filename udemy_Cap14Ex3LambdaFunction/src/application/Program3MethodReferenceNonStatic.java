package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entities.Product3NonStatic;

public class Program3MethodReferenceNonStatic {

	public static void main(String[] args) {

		List<Product3NonStatic> list = new ArrayList<>();

		list.add(new Product3NonStatic("Tv", 900.00));
		list.add(new Product3NonStatic("Mouse", 50.00));
		list.add(new Product3NonStatic("Tablet", 350.50));
		list.add(new Product3NonStatic("HD Case", 80.90));

		List<String> names = list.stream().map(Product3NonStatic::nonStaticUpperCaseName).collect(Collectors.toList());

		names.forEach(System.out::println);
	
		}
	}