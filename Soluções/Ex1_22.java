package internet;

import java.util.Scanner;

public class Ex1_22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os valores correspondentes aos lados de um tri�ngulo: ");
		System.out.print("A: ");
		int a = sc.nextInt();
		System.out.print("B: ");
		int b = sc.nextInt();
		System.out.print("C: ");
		int c = sc.nextInt();
		
		if(!((a < b + c) && (b < a + c) && (c < a + b)) || (a == b && a == c)) {
			if(a==b && b==c) {
				System.out.println("Tri�ngulo equil�tero");
			}else if(a==b || a==c || b==c) {
				System.out.println("Tri�ngulo is�sceles");
			}
		} else if ((a < b + c) && (b < a + c) && (c < a + b)) {
			System.out.println("Tri�ngulo escaleno");
		} else System.out.println("N�o � um tri�ngulo");
		
		sc.close();
	}
}
