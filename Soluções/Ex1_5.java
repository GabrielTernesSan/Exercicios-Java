package internet;

import java.util.Scanner;

/*
 * Crie um algoritmo que leia o valor do salário mínimo 
 * e o valor do salário de um usuário,
 * calcule a quantidade de salários mínimos esse usuário 
 * ganha e imprima o resultado. (1SM=R$788,00)
 */

public class Ex1_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual é o salário mínimo? ");
		double salarioMinimo = sc.nextDouble();
		System.out.println("Qual é o seu salário? ");
		double salarioDoUsuario = sc.nextDouble();
		
		System.out.printf("Você ganha %.2f salários mínimos!", (salarioDoUsuario / salarioMinimo));
		
		sc.close();
	}
}
