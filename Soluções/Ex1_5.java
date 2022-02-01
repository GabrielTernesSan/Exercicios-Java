package internet;

import java.util.Scanner;

/*
 * Crie um algoritmo que leia o valor do sal�rio m�nimo 
 * e o valor do sal�rio de um usu�rio,
 * calcule a quantidade de sal�rios m�nimos esse usu�rio 
 * ganha e imprima o resultado. (1SM=R$788,00)
 */

public class Ex1_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual � o sal�rio m�nimo? ");
		double salarioMinimo = sc.nextDouble();
		System.out.println("Qual � o seu sal�rio? ");
		double salarioDoUsuario = sc.nextDouble();
		
		System.out.printf("Voc� ganha %.2f sal�rios m�nimos!", (salarioDoUsuario / salarioMinimo));
		
		sc.close();
	}
}
