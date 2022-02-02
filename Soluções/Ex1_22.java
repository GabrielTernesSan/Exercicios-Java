package internet;

import java.util.Scanner;

public class Ex1_22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe os valores correspondentes aos lados de um triângulo: ");
		System.out.print("A: ");
		int a = sc.nextInt();
		System.out.print("B: ");
		int b = sc.nextInt();
		System.out.print("C: ");
		int c = sc.nextInt();
		
		if(!((a < b + c) && (b < a + c) && (c < a + b)) || (a == b && a == c)) {
			if(a==b && b==c) {
				System.out.println("Triângulo equilátero");
			}else if(a==b || a==c || b==c) {
				System.out.println("Triângulo isósceles");
			}
		} else if ((a < b + c) && (b < a + c) && (c < a + b)) {
			System.out.println("Triângulo escaleno");
		} else System.out.println("Não é um triângulo");
		
		sc.close();
	}
}
