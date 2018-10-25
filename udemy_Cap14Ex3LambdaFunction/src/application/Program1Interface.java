package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import entities.Product1Interface;
import util.UpperCaseName;

public class Program1Interface {

	public static void main(String[] args) {

		List<Product1Interface> list = new ArrayList<>();

		list.add(new Product1Interface("Tv", 900.00));
		list.add(new Product1Interface("Mouse", 50.00));
		list.add(new Product1Interface("Tablet", 350.50));
		list.add(new Product1Interface("HD Case", 80.90));

		/*  .stream() -convers�o de lista para stream
		 *  .map - uma fun��o que aplica uma fun��o a todos elementos de uma stream
		 *  .collect(Collectors.toList()) - convers�o de Stream para Lista
		 */
		
		//fun��o Function: recebe um objecto do tipo T e retorna um do tipo R
		List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());

		names .forEach(System.out::println);
	}
}