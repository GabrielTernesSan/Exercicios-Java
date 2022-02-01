package internet;

import tests.LampadaTeste;

/*
 * Implementar uma classe Lampada que deve possuir como caracter�sticas tipo (led, fluorescente,...), voltagem,
 * cor, marca, pre�o, pot�ncia, status(boolean). Nesta classe devem ser implementados os m�todos
 * construtores, getters, setters, toString, ascender e apagar. Em uma outra classe chamada LampadaTeste
 * devem ser criados dois objetos do tipo Lampada, atribuir valores e exibir os dados deste objeto. O programa
 * dever� informar tamb�m qual das duas l�mpadas possui maior pot�ncia e tamb�m qual das l�mpadas � a
 * mais cara.
 */


public class Ex2_2_Lampada {
	public static void main(String[] args) {
		LampadaTeste lampada1 = new LampadaTeste("led", 220, "Branca", "Eletrolux", 7.99, 18);
		LampadaTeste lampada2 = new LampadaTeste("led", 110, "Amarela", "Positivo", 10.99, 9);
		
		String maisCara = " ";
		String maiorPotencia = " ";
		
		if(lampada1.getPreco() > lampada2.getPreco()) {
			maisCara = "lampada1";
		}else {
			maisCara = "lampada2";
		}
		
		if(lampada1.getPotencia() > lampada2.getPotencia()) {
			maiorPotencia = "lampada1";
		}else {
			maiorPotencia = "lampada2";
		}
		
		System.out.printf("A lampada mais cara � a %s e a com mais pot�ncia � a %s", maisCara, maiorPotencia);
	}
}
