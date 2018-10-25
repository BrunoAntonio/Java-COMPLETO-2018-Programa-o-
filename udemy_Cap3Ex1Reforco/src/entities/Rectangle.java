package entities;

public class Rectangle {
	
	public double heigth;
	public double width;
	
	public double area(double heigth, double width) { //funciona sem identificação variaveis 
		return heigth*width;
	}
	
	public double perimeter() {
		return 2*(heigth+width);
	}
	
	public double diagonal() {
		return Math.sqrt(heigth*heigth+width*width);
	}

}
