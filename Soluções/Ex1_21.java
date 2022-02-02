package internet;

import java.util.Scanner;

public class Ex1_21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o código: ");
		int CODIGO = sc.nextInt();
		
		switch (CODIGO) {
		case 1: {
			System.out.println("um");
			break;
		}
		case 2: {
			System.out.println("dois");
			break;
		}
		case 3: {
			System.out.println("três");
			break;
		}
		default:
			System.out.println("Código inválido: " + CODIGO);
		}
		
		sc.close();
	}
}
