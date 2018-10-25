package whileAndFor;

import java.util.Scanner;

public class WhileAndFor {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Insira N números inteiros");
		
		int n=sc.nextInt(); 
		
		while(n <=0 ) {
			System.out.println("Insira um número inteiro possitivo");
			n =sc.nextInt();
		}
		
		int higher = 0 ;
		for(int i=1;i<=n;i++) {
			System.out.print("Insira o numero: "+i);
			int x=sc.nextInt();
			if(x>higher) {
				higher=x;
			}
		}
		
		System.out.println("O número mais alto é:" +higher);
		
		sc.close();
	}

}

