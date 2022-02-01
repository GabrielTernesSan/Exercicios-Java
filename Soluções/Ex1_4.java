package internet;

import java.util.Scanner;

/*
 * Escrever um algoritmo que l�: 
 * - a porcentagem do IPI a ser acrescido no valor das pe�as
 * - o c�digo da pe�a 1, valor unit�rio da pe�a 1, quantidade de pe�as 1
 * - o c�digo da pe�a 2, valor unit�rio da pe�a 2, quantidade de pe�as 2
 * 
 * O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
 * 
 * F�rmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
 */

public class Ex1_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Percentual IPI: ");
		double ipi = sc.nextDouble();
		System.out.print("C�digo da primeira pe�a: ");
		int peca1 = sc.nextInt();
		System.out.print("Valor unit�rio da pe�a: ");
		double valor1 = sc.nextDouble();
		System.out.print("Quantidade da pe�a 1 que deseja: ");
		int quant1 = sc.nextInt();
		
		System.out.print("C�digo da primeira pe�a: ");
		int peca2 = sc.nextInt();
		System.out.print("Valor unit�rio da pe�a: ");
		double valor2 = sc.nextDouble();
		System.out.print("Quantidade da pe�a 1 que deseja: ");
		int quant2 = sc.nextInt();
		
		double totalAPagar = (valor1*quant1 + valor2*quant2)*(ipi/100 + 1);
		System.out.println("Pe�as compradas: ");
		System.out.println("C�d: " + peca1 + " x " + quant1);
		System.out.println("C�d: " + peca2 + " x " + quant2);
		System.out.println("--------------------");
		System.out.println("Total: " + totalAPagar);
		
		sc.close();
	}
}
