package application;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Set<Integer> courseA = new HashSet<>();
		Set<Integer> courseB = new HashSet<>();
		Set<Integer> courseC = new HashSet<>();
		

		System.out.print("How many students for course A?");
		int numberA = sc.nextInt();

		for (int i = 1; i <= numberA; i++) {
			int studentCode = sc.nextInt();
			courseA.add(studentCode);
		}

		System.out.print("How many students for course B?");
		int numberB = sc.nextInt();

		for (int i = 1; i <= numberB; i++) {
			int studentCode = sc.nextInt();
			courseB.add(studentCode);
		}

		System.out.print("How many students for course C?");
		int numberC = sc.nextInt();

		for (int i = 1; i <= numberC; i++) {
			int studentCode = sc.nextInt();
			courseC.add(studentCode);
		}
		
		Set<Integer> total = new HashSet<>(courseA);
		total.addAll(courseB);
		total.addAll(courseC);
		
		System.out.print("Total students:"+total.size());
		

		sc.close();
	}

}