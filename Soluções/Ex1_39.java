package internet;

import java.util.Scanner;

public class Ex1_39 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String opcao = "N";
		
		while(opcao.equals("N")) {
			int salarioTotal = 0;
			int E = 0;
			System.out.print("Código do operário: ");
			int C = sc.nextInt();
			System.out.print("Números de horas trabalhadas: ");
			int N = sc.nextInt();
			if(N > 50) {
				int salario = N * 10;
				N -= 50;
				E = N * 20;
				salarioTotal = salario + E;
			}else salarioTotal = N * 10;
			
			System.out.println("Salario total: " + salarioTotal);
			System.out.println("Salario excedente: " + E);
			
			System.out.println("Deseja encerrar a aplicação? (S; N)");
			opcao = sc.next();
		}
		
		sc.close();
	}
}
