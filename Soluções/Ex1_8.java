package maisPraTi;

import java.util.Scanner;

/*
 * As maçãs custam R$ 0,30 cada se forem compradas menos
 * do que uma dúzia, e R$ 0,25 se forem compradas pelo menos doze.
 * Escreva um programa que leia o número de maçãs compradas,
 * calcule e escreva o valor total da compra.
 */

public class Ex1_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas maças você irá comprar? ");
		int macas = sc.nextInt();
		
		if(macas >= 12) {
			double total = macas * 0.25;
			System.out.printf("Você pagará %.2f ", total);
		} else {
			double total = macas * 0.30;
			System.out.printf("Você pagará %.2f ", total);
		}
		sc.close();
	}
}
