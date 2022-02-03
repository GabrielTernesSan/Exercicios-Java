package internet;

import java.util.Scanner;

public class Ex1_30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int fatorial = 1;
		
		System.out.print("Quantos números deseja processar? ");
		int nums  = sc.nextInt();
		
		for(int i = 0; i < nums; i++) {
			System.out.print("Número a ser processado: ");
			int num = sc.nextInt();
			for(int j = 1; j <= num; j++) {
				fatorial *= j;
			}
			System.out.printf("O fatorial de %d é %d", num, fatorial);
			System.out.println();
		}
		
		sc.close();
	}
}
