package internet;

import java.util.Scanner;

public class NumeroValido {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		int numero1 = sc.nextInt();
		String status = valorValidado(numero1);
		
		System.out.println(status);
		
		sc.close();
	}
	
	public static String valorValidado(int num) {
		if(num >= 0 && num <= 9){
			return "Valor v�lido";
		}else return "Valor inv�lido";
	}
}
