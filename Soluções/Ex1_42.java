package internet;

import java.util.Scanner;

public class Ex1_42 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade = sc.nextInt();
		
		if(idade >= 5 && idade <= 7) {
			System.out.println("Infantil A");
		} else if(idade >= 8 && idade <= 11) {
			System.out.println("Infantil B");
		} else if(idade >= 12 && idade <= 113) {
			System.out.println("Juvenil A");
		} else if(idade >= 14 && idade <= 17) {
			System.out.println("Juvenil B");
		} else if(idade >= 18) {
			System.out.println("Maiores de 18");
		} else {
			System.out.println("A criança não tem idade para ser um atleta");
		}
		sc.close();
	}
}
