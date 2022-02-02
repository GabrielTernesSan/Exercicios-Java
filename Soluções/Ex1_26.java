package internet;

import java.util.Scanner;

public class Ex1_26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 – Adição");
		System.out.println("2 – Subtração");
		System.out.println("3 – Multiplicação");
		System.out.println("4 – Divisão");
		System.out.println("Opção: ");
		int opcao = sc.nextInt();
		System.out.println();
		System.out.println("Informe os valores que serão utilizados na operação: ");
		System.out.println("Valor 1:");
		double valor1 = sc.nextDouble();
		System.out.println("Valor 2:");
		double valor2 = sc.nextDouble();
		
		switch (opcao) {
		case 1: {
			System.out.println("Soma: " + (valor1 + valor2));
			break;
		}
		case 2: {
			System.out.println("Subtração: " + (valor1 - valor2));
			break;
		}
		case 3: {
			System.out.println("Multiplicação: " + (valor1 * valor2));
			break;
		}
		case 4: {
			System.out.println("Divisão: " + (valor1 / valor2));
			break;
		}
		default:
			System.out.println("Unexpected value: " + opcao);
		}
		
		sc.close();
	}
}
