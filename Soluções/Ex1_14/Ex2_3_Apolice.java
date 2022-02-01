package internet;

import java.util.Scanner;

import tests.ApoliceTeste;

/*
 * Implementar uma classe Apolice com os seguintes atributos nome do segurado, 
 * idade do segurado e valor do prêmio da apólice. Nesta classe Apolice devem ser 
 * implementados os métodos:
 * 
 * imprimir () - este método não retorna valor e deverá mostrar na tela todos os atributos da classe Apolice. 
 * Para imprimir em java usa-se o comando [System.out.println(nome do atributo);]
 * 
 * calcularPremioApolice() - este método não retorna valor e deverá calcular o valor do prêmio seguindo as
 * seguintes regras: caso a idade seja maior ou igual a 18 e menor ou igual a 25 anos, use a formula
 * valorPremio+=(valorPremio*20)/100. Quando a idade for superior a 25 e menor ou igual a 26, use a formula
 * valorPremio+=(valorPremio*15)/100. Quando a idade for superior a 36 use a formula
 * valorPremio+=(valorPremio*10)/100.
 * 
 * oferecerDesconto() - este método não retorna valor, mas recebe o parâmetro cidade, que irá conter o nome da
 * cidade para o cálculo do desconto. Caso a cidade seja Curitiba, dê um desconto de no valor do premio de 20%,
 * caso seja Rio de Janeiro, dê um desconto no valor do premio de 15%, caso seja São Paulo dê um desconto no
 * valor do premio de 10% e se for Belo Horizonte dê um desconto no valor do premio de 5%.
 * 
 * Logo após implementar a classe Apolice, implemente em uma classe chamada ApoliceTeste uma sequência de
 * instruções para testar as funcionalidades da classe Apolice.
 */

public class Ex2_3_Apolice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite o nome do segurado: ");
		String nome = sc.nextLine();
		System.out.println("Digite a idade do segurado: ");
		int idade = sc.nextInt();
		System.out.println("Digite o valor do prêmio da apólice: ");
		double valorPremioApolice = sc.nextDouble();
		
		double valorPremio = calcularPremioApolice(idade, valorPremioApolice);
		
		ApoliceTeste segurado = new ApoliceTeste(nome, idade, valorPremio);
		
		System.out.println(segurado);
		
		sc.close();
	}
	
	public static double calcularPremioApolice(int idade, double valorPremio) {
		if(idade >= 18 && idade <= 25) {
			valorPremio += (valorPremio*20)/100;
		} else if(idade > 25 && idade <= 26) {
			valorPremio += (valorPremio*15)/100;
		}if(idade > 36) {
			valorPremio += (valorPremio*10)/100;
		}
		return valorPremio;
	}
}
