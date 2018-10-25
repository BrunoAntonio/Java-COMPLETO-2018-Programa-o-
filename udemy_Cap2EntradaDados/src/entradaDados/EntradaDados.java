package entradaDados;

import java.util.Scanner;

public class EntradaDados {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter your full Name:");
		String name=sc.nextLine();
		System.out.println(name);
		
		System.out.println("How many bedrooms are there in your house? :");
		int numb =sc.nextInt();
		System.out.printf("%d%n", numb);
	
		System.out.println("Enter product price:");
		double price =sc.nextDouble();
		System.out.printf("%.2f%n", price);
				
		System.out.println("Enter your last name ,gender ,age and height (same line):");
		String name2=sc.next();
		char ch = sc.next().charAt(0);
		int age =sc.nextInt();
		double height =sc.nextDouble();
		
		System.out.println(name2);
		
		System.out.printf("Last Name: %s%n Gender: %c%n Age: %d%n Heigth: %.2f", name2,ch,age,height);
		
		sc.close();
		
		
	}

}
