package internet;

import java.util.Scanner;

/*
 * Faça um algoritmo que leia a idade de uma pessoa expressa em anos, 
 * meses e dias e mostre-a expressa em dias. 
 * Leve em consideração o ano com 365 dias e o mês com 30. 
 * (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
 */

public class Ex1_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a sua idade expressa em anos, meses e dias: ");
		System.out.println("Anos: ");
		int anos = sc.nextInt();
		System.out.println("Meses: ");
		int meses = sc.nextInt();
		System.out.println("Dias: ");
		int dias = sc.nextInt();
		
		int totalDeDias = (anos * 365) + (meses * 30) + dias ;
		
		System.out.printf("Você tem %d dias de vida", totalDeDias);
		sc.close();
	}
}
