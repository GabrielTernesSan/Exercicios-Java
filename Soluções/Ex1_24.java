package internet;

import java.util.Scanner;

public class Ex1_24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		System.out.println("Utilize o zero para parar a operação!");
		
		do {
			System.out.println("Informe um número: ");
			num = sc.nextInt();
			if(num > 0) {
				System.out.println("Positivo");
			} else if(num < 0){
				System.out.println("Negativo");
			} else System.out.println("Programa interrompido pelo usuário!");
		}while(num != 0);
		
		sc.close();
	}
}
