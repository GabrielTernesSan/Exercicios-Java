package maisPraTi;

import java.util.Scanner;

/*
 * As ma��s custam R$ 0,30 cada se forem compradas menos
 * do que uma d�zia, e R$ 0,25 se forem compradas pelo menos doze.
 * Escreva um programa que leia o n�mero de ma��s compradas,
 * calcule e escreva o valor total da compra.
 */

public class Ex1_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas ma�as voc� ir� comprar? ");
		int macas = sc.nextInt();
		
		if(macas >= 12) {
			double total = macas * 0.25;
			System.out.printf("Voc� pagar� %.2f ", total);
		} else {
			double total = macas * 0.30;
			System.out.printf("Voc� pagar� %.2f ", total);
		}
		sc.close();
	}
}
