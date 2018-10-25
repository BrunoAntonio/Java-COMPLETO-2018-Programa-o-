package udemy_cap1Ex5Reforco;

import java.util.Scanner;

public class Capitulo1Exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter number of students:");
		int numbAlunos=sc.nextInt();
		
		for (int i=1;i<=numbAlunos;i++) {
			System.out.print("Student "+i+":");
			double nota1=sc.nextDouble();
			double nota2=sc.nextDouble();
			double nota3=sc.nextDouble();
			double finalScore=nota1+nota2+nota3;
			System.out.printf("Final score: %.2f%n",finalScore);
		}
		
		sc.close();

	}

}
