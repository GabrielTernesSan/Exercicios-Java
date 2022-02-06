package internet;

import java.util.Scanner;

public class Ex1_37 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maior = 0;
		int menor = 1000;
		double soma = 0;
		
		for (int i = 0; i < 10; i++) {
			int num = sc.nextInt();
			if(num > maior) {
				maior = num;
			}
			if(num < menor) {
				menor = num;
			}
			soma += num;
		}
		double media = soma / 10;
		
		System.out.println(maior);
		System.out.println(menor);
		System.out.println(media);
		sc.close();
	}
}
