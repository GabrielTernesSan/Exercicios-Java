package internet;

import tests.LampadaTeste;

/*
 * Implementar uma classe Lampada que deve possuir como características tipo (led, fluorescente,...), voltagem,
 * cor, marca, preço, potência, status(boolean). Nesta classe devem ser implementados os métodos
 * construtores, getters, setters, toString, ascender e apagar. Em uma outra classe chamada LampadaTeste
 * devem ser criados dois objetos do tipo Lampada, atribuir valores e exibir os dados deste objeto. O programa
 * deverá informar também qual das duas lâmpadas possui maior potência e também qual das lâmpadas é a
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
		
		System.out.printf("A lampada mais cara é a %s e a com mais potência é a %s", maisCara, maiorPotencia);
	}
}
