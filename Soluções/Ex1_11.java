package maisPraTi;

import java.util.Scanner;

/*
 * Escreva um algoritmo que leia 10 valores e encontre o maior e o
 * menor deles. Mostre o resultado.
 */

public class Ex1_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero = 0;
		int maior = 0;
		int menor = 10000;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite um valor: ");
			numero = sc.nextInt();
			if(numero > maior) {
				maior = numero;
			}
			if(numero < menor) {
				menor = numero;
			}
		}
		
		System.out.println("Maior: " + maior);
		System.out.println("Menor: " + menor);
		
		sc.close();
	}
}
