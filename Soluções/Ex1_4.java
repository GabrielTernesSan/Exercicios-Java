package internet;

import java.util.Scanner;

/*
 * Escrever um algoritmo que lê: 
 * - a porcentagem do IPI a ser acrescido no valor das peças
 * - o código da peça 1, valor unitário da peça 1, quantidade de peças 1
 * - o código da peça 2, valor unitário da peça 2, quantidade de peças 2
 * 
 * O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
 * 
 * Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
 */

public class Ex1_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Percentual IPI: ");
		double ipi = sc.nextDouble();
		System.out.print("Código da primeira peça: ");
		int peca1 = sc.nextInt();
		System.out.print("Valor unitário da peça: ");
		double valor1 = sc.nextDouble();
		System.out.print("Quantidade da peça 1 que deseja: ");
		int quant1 = sc.nextInt();
		
		System.out.print("Código da primeira peça: ");
		int peca2 = sc.nextInt();
		System.out.print("Valor unitário da peça: ");
		double valor2 = sc.nextDouble();
		System.out.print("Quantidade da peça 1 que deseja: ");
		int quant2 = sc.nextInt();
		
		double totalAPagar = (valor1*quant1 + valor2*quant2)*(ipi/100 + 1);
		System.out.println("Peças compradas: ");
		System.out.println("Cód: " + peca1 + " x " + quant1);
		System.out.println("Cód: " + peca2 + " x " + quant2);
		System.out.println("--------------------");
		System.out.println("Total: " + totalAPagar);
		
		sc.close();
	}
}
