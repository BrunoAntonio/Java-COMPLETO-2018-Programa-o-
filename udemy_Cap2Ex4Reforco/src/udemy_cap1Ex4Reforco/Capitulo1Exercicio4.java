package udemy_cap1Ex4Reforco;

import java.util.Scanner;

public class Capitulo1Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter an integer value:");
		int numb=sc.nextInt();
		
		while(numb !=0) {
			int square=numb*numb;
			System.out.println(square);
			System.out.print("Enter an integer value:");
			numb=sc.nextInt();
		}
		
		
		sc.close();
	}

}
