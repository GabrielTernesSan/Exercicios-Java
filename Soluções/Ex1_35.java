package internet;

import java.util.Scanner;

public class Ex1_35 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int maior = 0;
		int menor = 1000;
		
		while(num >= 0){
			num = sc.nextInt();
			
			if(num > maior) {
				maior = num;
			}
			if(num < menor) {
				menor = num;
			}
			if(num < 0) {
				break;
			}
			System.out.println("O maior é: " + maior);
			System.out.println("O menor é: " + menor);
		}
		
		sc.close();
	}
}
