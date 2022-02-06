package internet;

import java.util.Scanner;

public class Ex1_34 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		
		System.out.print("Digite um número entre 0 e 10: ");
		int num = sc.nextInt();
		
		while(num < 0 && num > 10) {
			System.out.print("Digite um número entre 0 e 10: ");
			num = sc.nextInt();
		}
		
		for(int i = num; i < (num + 40); i++) {
			if(i % 2 != 0) {
				System.out.println(i);
				soma += (i * i);
			}
		}
		
		System.out.println("A soma dos 20 primeiros números inteiros positivos ímpares é: " + soma);
		
		sc.close();
	}
}
