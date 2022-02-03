package internet;

import java.util.Scanner;

public class Ex1_28 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe sua altura: ");
		double altura = sc.nextDouble();
		System.out.print("Informe seu sexo (M / F): ");
		String sexo = sc.next();
		
		if(sexo.equals("M") || sexo.equals("Masculino")) {
			double pesoIdeal = (72.7*altura) - 58;
			System.out.printf("Seu peso ideal: %.2f kg", pesoIdeal);
		}else if(sexo.equals("F") || sexo.equals("Feminino")) {
			double pesoIdeal = (62.1 * altura) - 44;
			System.out.printf("Seu peso ideal: %.2f kg", pesoIdeal);
		}else System.out.println("Sexo inválido!");
		
		sc.close();
	}
}
