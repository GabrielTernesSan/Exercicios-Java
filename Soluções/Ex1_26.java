package internet;

import java.util.Scanner;

public class Ex1_26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 � Adi��o");
		System.out.println("2 � Subtra��o");
		System.out.println("3 � Multiplica��o");
		System.out.println("4 � Divis�o");
		System.out.println("Op��o: ");
		int opcao = sc.nextInt();
		System.out.println();
		System.out.println("Informe os valores que ser�o utilizados na opera��o: ");
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
			System.out.println("Subtra��o: " + (valor1 - valor2));
			break;
		}
		case 3: {
			System.out.println("Multiplica��o: " + (valor1 * valor2));
			break;
		}
		case 4: {
			System.out.println("Divis�o: " + (valor1 / valor2));
			break;
		}
		default:
			System.out.println("Unexpected value: " + opcao);
		}
		
		sc.close();
	}
}
