package maisPraTi;

import java.util.Scanner;

/*
 * Escreva um programa para ler 2 valores e escrever o maior deles
 */

public class Ex1_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int n1 = sc.nextInt();
		System.out.println("Digite um segundo n�mero: ");
		int n2 = sc.nextInt();
		
		if(n1 > n2) {
			System.out.println("O n�mero 1 � o maior");
		}else System.out.println("O n�mero 2 � o maior");
		
		sc.close();
	}
}
