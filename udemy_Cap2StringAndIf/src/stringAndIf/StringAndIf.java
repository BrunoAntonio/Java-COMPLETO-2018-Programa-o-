package stringAndIf;

import java.util.Scanner;

public class StringAndIf {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Insira 3 n�meros inteiros");
		int numb1 =sc.nextInt();
		int numb2 =sc.nextInt();
		int numb3 =sc.nextInt();
		
		if (numb1>numb2 && numb1>numb3) {
			System.out.println("O maior n�mero �"+numb1);
		}
		else if (numb2>numb3) {
			System.out.println("O maior n�mero �"+numb2);
		}
		else {
			System.out.println("O maior n�mero �: " +numb3);
		}
		
		sc.close();
		
	}

}
