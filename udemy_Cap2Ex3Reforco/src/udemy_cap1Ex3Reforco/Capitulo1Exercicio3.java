package udemy_cap1Ex3Reforco;

import java.util.Scanner;

public class Capitulo1Exercicio3 {

	public static void main(String[] args) {
	
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter two integer numbers:");
		int numb1=sc.nextInt();
		int numb2=sc.nextInt();
		
		int menor=numb1, maior=numb2;
		
		
		if (numb2<numb1) {
			menor=numb2;
			maior=numb1;	
		}
		
		int sumPar=0;
		for (int i=menor; i<=maior; i++) {
			if (i%2!=0) {
				sumPar +=i;
			}
		
		}
		System.out.println("Sum of odd numbers = "+sumPar);	
		sc.close();

	}

}


	


