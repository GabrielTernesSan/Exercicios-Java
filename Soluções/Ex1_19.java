package internet;

import java.util.Scanner;

public class Ex1_19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o primeiro valor: ");
		int num1 = sc.nextInt();
		System.out.print("Informe o segundo valor: ");
		int num2 = sc.nextInt();
		
		maiorOuMenor(num1, num2);
		
		sc.close();
	}
	
	public static void maiorOuMenor(int num1, int num2) {
		if(num1 > num2) {
			System.out.printf("O n�mero %d � maior que o n�mero %d!", num1, num2);
		} else if(num1 < num2) {
			System.out.printf("O n�mero %d � maior que o n�mero %d!", num2, num1);
		} else System.out.printf("O n�mero %d � igual ao n�mero %d!", num2, num1);
	}
}
