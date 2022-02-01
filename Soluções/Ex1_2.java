package internet;

/*
 * Fazer um programa que imprima a média aritmética dos números 8,9 e 7.
 * A média dos números 4, 5 e 6. A soma das duas médias. A média das médias.
 */

public class Ex1_2 {
	public static void main(String[] args) {
		int num1 = 7;
		int num2 = 8;
		int num3 = 9;
		double media1 = 0.0;
		int num4 = 4;
		int num5 = 5;
		int num6 = 6;
		double media2 = 0.0;
		
		double somaDasMedias = 0.0;
		double mediaDasMedias = 0.0;
		
		media1 = (num1 + num2 + num3) /3;
		media2 = (num4 + num5 + num6) /3;
		
		somaDasMedias = media1 + media2;
		
		mediaDasMedias = somaDasMedias / 2;
		
		System.out.printf("A média dos números 7,8,9 é: %.2f%n", media1);
		System.out.printf("A média dos números 4, 5, 6 é: %.2f%n", media2);
		System.out.printf("A soma destas médias é: %.2f%n", somaDasMedias);
		System.out.printf("A média das médias é: %.2f", mediaDasMedias);
		
	}
}
