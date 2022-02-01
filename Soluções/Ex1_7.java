package maisPraTi;

import java.util.Scanner;

/*
 * Escreva um programa para ler 2 valores e escrever o maior deles
 */

public class Ex1_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int n1 = sc.nextInt();
		System.out.println("Digite um segundo número: ");
		int n2 = sc.nextInt();
		
		if(n1 > n2) {
			System.out.println("O número 1 é o maior");
		}else System.out.println("O número 2 é o maior");
		
		sc.close();
	}
}
