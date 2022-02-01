package maisPraTi;

import java.util.Scanner;

/*
 * Um programa que leia o salário bruto de um funcionário e mostre o
 * valor liquido.
 * Se o salário for menor que R$1.100, o desconto de INSS é 6%
 * Até R$2.500, 8%
 * Até R$4.800 10%
 * Maior que R$ 4.800 15%
 */

public class Ex1_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seu salário bruto: ");
		double salario = sc.nextDouble();
		
		if(salario <= 1100.00) {
			double liquido = salario * 0.06;
			System.out.printf("Seu salario liquido é: %.2f", (salario - liquido));
		} else if(salario > 1100.00 && salario <= 2500.00) {
			double liquido = salario * 0.08;
			System.out.printf("Seu salario liquido é: %.2f", (salario - liquido));
		}else if(salario > 2500.00 && salario <= 4800.00) {
			double liquido = salario * 0.1;
			System.out.printf("Seu salario liquido é: %.2f", (salario - liquido));
		} else {
			double liquido = salario * 0.15;
			System.out.printf("Seu salario liquido é: %.2f", (salario - liquido));
		}
		
		sc.close();
	}
}
