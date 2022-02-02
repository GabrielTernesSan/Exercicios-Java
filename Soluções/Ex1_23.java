package internet;

import java.util.Scanner;

public class Ex1_23 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um valor: ");
		int a = sc.nextInt();
		while(!validaValor(a)){
			System.out.println("Verifique o valor inserido!");
			System.out.print("Informe um valor: ");
			a = sc.nextInt();
		}
		System.out.print("Informe um valor: ");
		int b = sc.nextInt();
		while(!validaValor(b)){
			System.out.println("Verifique o valor inserido!");
			System.out.print("Informe um valor: ");
			b = sc.nextInt();
		}
		System.out.print("Informe um valor: ");
		int c = sc.nextInt();
		while(!validaValor(c)){
			System.out.println("Verifique o valor inserido!");
			System.out.print("Informe um valor: ");
			c = sc.nextInt();
		}
		
		int maior = maiorValor(a, b, c);
		int menor = menorValor(a, b, c);
		
		System.out.println("Maior valor: " + maior);
		System.out.println("Menor valor: " + menor);
		System.out.println("O menor valor lido multiplicado pelo maior: " + menor * maior);
		System.out.println("O maior valor dividido pelo menor: " + maior / menor);
		
		sc.close();
		
	}
	
	public static boolean validaValor(int num) {
		if(num < 0) {
			return false;
		}
		return true;
	}
	
	public static int maiorValor(int a, int b, int c) {
		if(a > b && a > c) {
			return a;
		} else if(b > c) {
			return b;
		}else return c;
	}
	
	public static int menorValor(int a, int b, int c) {
		if(a < b && a < c) {
			return a;
		} else if(b < c) {
			return b;
		}else return c;
	}
	
}
