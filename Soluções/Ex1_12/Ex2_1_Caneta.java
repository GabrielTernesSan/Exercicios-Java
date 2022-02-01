package internet;

/*
 * Implementar uma classe Caneta que deve possuir como características marca, cor e tamanho. Nesta classe
 * devem ser implementados os métodos construtores, getters, setters e toString. Em uma outra classe
 * chamada CanetaTeste deverá ser criado um objeto do tipo Caneta, atribuir valores e exibir os dados deste
 * objeto.
 */

import tests.CanetaTeste;

public class Ex2_1_Caneta {
	public static void main(String[] args) {
		CanetaTeste caneta = new CanetaTeste();
		
		caneta.setCor("Preta");
		caneta.setMarca("Bic");
		caneta.setTamanho("Normal");
		
		System.out.println(caneta.getCor());
		System.out.println(caneta.getMarca());
		System.out.println(caneta.getTamanho());
		System.out.println(caneta);
	}
}
