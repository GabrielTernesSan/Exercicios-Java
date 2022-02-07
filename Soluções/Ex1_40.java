package internet;

import java.util.Scanner;

public class Ex1_40 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char opcao = 'N';
		
		while(opcao == 'N') {
			int n = sc.nextInt();
			if(n % 2 == 0) {
				System.out.println("Par!");
			} else System.out.println("Ímpar!");
			if(n > 0) {
				System.out.println("Positivo!");
			}else System.out.println("Negativo!");
			
			System.out.print("Deseja encerrar o programa? ");
			opcao = sc.next().charAt(0);
			
			if(opcao == 'S') {
				break;
			}
		}
		sc.close();
	}
}
