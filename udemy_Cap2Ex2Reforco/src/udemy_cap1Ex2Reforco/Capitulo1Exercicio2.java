package udemy_cap1Ex2Reforco;

import java.util.Scanner;

public class Capitulo1Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter glucose measure:");
		double glicose =sc.nextDouble();
		
		if (glicose <=100) {
			System.out.println("Normal");
		}
		else if (glicose <=140) {
			System.out.println("High");
		}
		else {
			System.out.println("Diabetes");
		}
		
		sc.close();

		
	}

}
