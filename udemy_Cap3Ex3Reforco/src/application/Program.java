package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Student s=new Student();
		
		s.name = sc.nextLine();
		s.nota1 = sc.nextDouble();
		s.nota2 = sc.nextDouble();
		s.nota3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n",s.finalGrade()); 
		
		if (s.finalGrade()>60) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Failed");
			System.out.printf("MISSING %.2f POINTS%n",s.missingPoints());
		}
		
			sc.close();	
		}

}
