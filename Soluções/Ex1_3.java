package internet;

import java.util.Scanner;

/*
 * Informar um saldo e imprimir o saldo com reajuste de 1%.
 */

public class Ex1_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seu saldo: ");
		double saldo = sc.nextDouble();
		double saldoReajustado = saldo + (saldo * 0.01);
		
		System.out.printf("Seu saldo com reajuste de 1 por cento: %.2f", saldoReajustado);
		
		sc.close();
	}
}
