package internet;

import java.util.Scanner;

public class Ex1_41 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char opcao = 'N';
		
		while(opcao == 'N') {
			double n = sc.nextDouble();
			
			if(n == 0.3) {
				System.out.println("Empresas do 1º grupo suspenda suas atividades!");
			} else if(n == 0.4) {
				System.out.println("Empresas do 1º e do 2º grupo suspenda suas atividades!");
			} else if(n == 0.5) {
				System.out.println("Todas as empresas devem suspender suas atividades!");
			}
			
			System.out.println("Deseja encerrar o programa?");
			opcao = sc.next().charAt(0);
			if(opcao == 'S') {
				break;
			}
		}
		sc.close();
	}
}
