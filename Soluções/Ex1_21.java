package internet;

import java.util.Scanner;

public class Ex1_21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o c�digo: ");
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
			System.out.println("tr�s");
			break;
		}
		default:
			System.out.println("C�digo inv�lido: " + CODIGO);
		}
		
		sc.close();
	}
}
