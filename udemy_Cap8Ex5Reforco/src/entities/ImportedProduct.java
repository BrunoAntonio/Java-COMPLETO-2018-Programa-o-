package entities;

public class ImportedProduct extends Product {

	private double customsFee;

	public ImportedProduct() {
		super();
	}
	
	public ImportedProduct(String name, double price, double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(double customsFee) {
		this.customsFee = customsFee;
	}
	
	@Override
	public String TagPrice() {
		return getName() 
				+" $ "
				+String.format("%.2f", totalPrice())
				+" (Customs fee: $ "
				+String.format("%.2f",customsFee)
				+")";
	}
	
	public double totalPrice() {
		return getPrice()+customsFee;
				
	}
	
}