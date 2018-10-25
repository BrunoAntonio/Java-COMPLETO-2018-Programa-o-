package udemy_cap1Ex1Reforco;

import java.util.Scanner;

public class Capitulo1Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Introduza as notas dos 3 trimestres");
		double nota1 =sc.nextDouble();
		double nota2 =sc.nextDouble();
		double nota3 =sc.nextDouble();
		
		double total= nota1+nota2+nota3;
		
		System.out.printf("Final Score=%.2f%n Passed",total);
		
		if (total<60){
			System.out.printf("Final Score=%.2f%n Failed",total);	
		}
		
		sc.close();
	}

}
