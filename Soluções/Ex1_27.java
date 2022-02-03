package internet;

import java.util.Scanner;

public class Ex1_27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe dois valores: ");
		System.out.print("Primeiro: ");
		int valor1 = sc.nextInt();
		System.out.print("Segundo: ");
		int valor2 = sc.nextInt();
		System.out.println();

		System.out.println("Operações possíveis: ");
		System.out.println("1 – Verificar se um dos números lidos é ou não múltiplo do outro");
		System.out.println("2 – Verificar se os dois números lidos são pares");
		System.out.println("3 – Verificar se a média dos dois números é maior ou igual a 7.");
		System.out.println("4 – Sair");
		System.out.print("Operação que deseja realizar: ");
		int option = sc.nextInt();
		
		switch (option) {
		case 1: {
			double restoDaDivisão = valor1 % valor2;
			if(restoDaDivisão == 0 || restoDaDivisão * valor1 == valor2 || restoDaDivisão * valor2 == valor1) {
				System.out.println("Os valores são múltiplos!");
			}else System.out.println("Os valores não são múltiplos!");
			break;
		}
		case 2: {
			double resto1 = valor1 % 2;
			double resto2 = valor2 % 2;
			if(resto1 == 0) {
				System.out.printf("O valor %d é par", valor1);
			}else System.out.printf("O valor %d é impar", valor1);
			System.out.println();
			if(resto2 == 0) {
				System.out.printf("O valor %d é par", valor2);
			}else System.out.printf("O valor %d é impar", valor2);
			break;
		}
		case 3: {
			double result = (valor1 + valor2) / 2;
			if(result > 7) {
				System.out.printf("A média dos valores %d e %d é maior que 7: %.2f", valor1, valor2, result);
			}else System.out.printf("A média dos valores %d e %d é menor que 7: %.2f", valor1, valor2, result);
			break;
		}
		case 4: {
			System.out.println("Você encerrou o programa!");
			break;
		}
		default:
			System.out.println("Opção inválida!");
		}
		
		sc.close();
	}
}
