package util;

import java.util.function.Predicate;

import entities.Product1Interface;

public class ProductPredicate implements Predicate<Product1Interface> {

	@Override
	public boolean test(Product1Interface p) {
		return p.getPrice() >= 100.0;
	}
}