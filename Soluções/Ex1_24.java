package internet;

import java.util.Scanner;

public class Ex1_24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		System.out.println("Utilize o zero para parar a opera��o!");
		
		do {
			System.out.println("Informe um n�mero: ");
			num = sc.nextInt();
			if(num > 0) {
				System.out.println("Positivo");
			} else if(num < 0){
				System.out.println("Negativo");
			} else System.out.println("Programa interrompido pelo usu�rio!");
		}while(num != 0);
		
		sc.close();
	}
}
