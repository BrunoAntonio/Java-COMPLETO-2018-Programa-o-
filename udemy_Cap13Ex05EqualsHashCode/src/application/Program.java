package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
	
		String a = "Maria";
		String b = "Alex";
		System.out.println(a.equals(b));
		
		System.out.println();
		
		String c = "Maria";
		String d = "Alex";
		System.out.println(c.hashCode());
		System.out.println(d.hashCode());
		
		System.out.println();
		
		String s1 = "test";
		String s2 = "test";
		String s3 = new String ("test");
		String s4 = new String ("test");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		
		
		System.out.println("-------------------------------------------------------------------");
		
		
		//HashCode personalizado
		
		Client c1= new Client("Maria", "maria@gmail.com");
		Client c2= new Client("Manuel", "manuel@gmail.com");
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		
		System.out.println("-------------------------------------------------------------------");
		
	}

}