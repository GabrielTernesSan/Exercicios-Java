package internet;

import java.util.Scanner;

public class Ex1_25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um valor: ");
		int num = sc.nextInt();
		
		if(num > 0) {
			int A = num;
			System.out.println("A: " + A);
		} else if(num < 0) {
			int B = num;
			System.out.println("B: " + B);
		}
		
		sc.close();
	}
}
