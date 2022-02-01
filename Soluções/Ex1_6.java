package internet;

import java.util.Scanner;

/*
 * Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
 * antecessor e seu sucessor.
 */

public class Ex1_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num = sc.nextInt();
		
		System.out.printf("O antecessor de %d é %d e o sucessor é %d", num, (num - 1), (num + 1));
		
		sc.close();
	}
}
