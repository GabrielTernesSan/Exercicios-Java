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

		System.out.println("Opera��es poss�veis: ");
		System.out.println("1 � Verificar se um dos n�meros lidos � ou n�o m�ltiplo do outro");
		System.out.println("2 � Verificar se os dois n�meros lidos s�o pares");
		System.out.println("3 � Verificar se a m�dia dos dois n�meros � maior ou igual a 7.");
		System.out.println("4 � Sair");
		System.out.print("Opera��o que deseja realizar: ");
		int option = sc.nextInt();
		
		switch (option) {
		case 1: {
			double restoDaDivis�o = valor1 % valor2;
			if(restoDaDivis�o == 0 || restoDaDivis�o * valor1 == valor2 || restoDaDivis�o * valor2 == valor1) {
				System.out.println("Os valores s�o m�ltiplos!");
			}else System.out.println("Os valores n�o s�o m�ltiplos!");
			break;
		}
		case 2: {
			double resto1 = valor1 % 2;
			double resto2 = valor2 % 2;
			if(resto1 == 0) {
				System.out.printf("O valor %d � par", valor1);
			}else System.out.printf("O valor %d � impar", valor1);
			System.out.println();
			if(resto2 == 0) {
				System.out.printf("O valor %d � par", valor2);
			}else System.out.printf("O valor %d � impar", valor2);
			break;
		}
		case 3: {
			double result = (valor1 + valor2) / 2;
			if(result > 7) {
				System.out.printf("A m�dia dos valores %d e %d � maior que 7: %.2f", valor1, valor2, result);
			}else System.out.printf("A m�dia dos valores %d e %d � menor que 7: %.2f", valor1, valor2, result);
			break;
		}
		case 4: {
			System.out.println("Voc� encerrou o programa!");
			break;
		}
		default:
			System.out.println("Op��o inv�lida!");
		}
		
		sc.close();
	}
}
