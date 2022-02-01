package internet;

import java.util.Scanner;

import tests.ApoliceTeste;

/*
 * Implementar uma classe Apolice com os seguintes atributos nome do segurado, 
 * idade do segurado e valor do pr�mio da ap�lice. Nesta classe Apolice devem ser 
 * implementados os m�todos:
 * 
 * imprimir () - este m�todo n�o retorna valor e dever� mostrar na tela todos os atributos da classe Apolice. 
 * Para imprimir em java usa-se o comando [System.out.println(nome do atributo);]
 * 
 * calcularPremioApolice() - este m�todo n�o retorna valor e dever� calcular o valor do pr�mio seguindo as
 * seguintes regras: caso a idade seja maior ou igual a 18 e menor ou igual a 25 anos, use a formula
 * valorPremio+=(valorPremio*20)/100. Quando a idade for superior a 25 e menor ou igual a 26, use a formula
 * valorPremio+=(valorPremio*15)/100. Quando a idade for superior a 36 use a formula
 * valorPremio+=(valorPremio*10)/100.
 * 
 * oferecerDesconto() - este m�todo n�o retorna valor, mas recebe o par�metro cidade, que ir� conter o nome da
 * cidade para o c�lculo do desconto. Caso a cidade seja Curitiba, d� um desconto de no valor do premio de 20%,
 * caso seja Rio de Janeiro, d� um desconto no valor do premio de 15%, caso seja S�o Paulo d� um desconto no
 * valor do premio de 10% e se for Belo Horizonte d� um desconto no valor do premio de 5%.
 * 
 * Logo ap�s implementar a classe Apolice, implemente em uma classe chamada ApoliceTeste uma sequ�ncia de
 * instru��es para testar as funcionalidades da classe Apolice.
 */

public class Ex2_3_Apolice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Digite o nome do segurado: ");
		String nome = sc.nextLine();
		System.out.println("Digite a idade do segurado: ");
		int idade = sc.nextInt();
		System.out.println("Digite o valor do pr�mio da ap�lice: ");
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
