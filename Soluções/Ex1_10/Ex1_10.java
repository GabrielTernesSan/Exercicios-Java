package maisPraTi;

import java.util.Scanner;

/*
 * Escreva um algoritmo que calcule a m�dia aritm�tica das 3 notas dos
 * alunos de uma classe. O algoritmo dever� ler, al�m das notas, o c�digo
 * do aluno e dever� ser encerrado quando o c�digo for igual a zero.
 */

public class Ex1_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos alunos deseja registrar? ");
		int alunos = sc.nextInt();
		
		Ex1_4Aclasse[] vetorDeAlunos = new Ex1_4Aclasse[alunos];
		
		for(int i = 0; i < vetorDeAlunos.length; i++) {
			sc.nextLine();
			System.out.println("Nome do Aluno: ");
			String nome = sc.nextLine();
			System.out.println("N�mero de matricula do Aluno: ");
			int matricula = sc.nextInt();
			if(matricula == 0) {
				break;
			}
			System.out.println("Digite a 1 nota: ");
			double nota1 = sc.nextDouble();
			System.out.println("Digite a 2 nota: ");
			double nota2 = sc.nextDouble();
			System.out.println("Digite a 3 nota: ");
			double nota3 = sc.nextDouble();
			
			double media = (nota1 + nota2 + nota3) / 3;
			
			vetorDeAlunos[i] = new Ex1_4Aclasse(nome, matricula, nota1, nota2, nota3, media);
		}
		
		System.out.println();
		System.out.println("Alunos");
		for(int i = 0; i < vetorDeAlunos.length; i++) {
			System.out.println(vetorDeAlunos[i]);
		}
		
		sc.close();
	}
}
