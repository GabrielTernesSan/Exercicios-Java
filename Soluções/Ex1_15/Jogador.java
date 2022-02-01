package internet;

/*
 * Criar uma classe Jogador que tenha as propriedades nome, gols, assist�ncias. 
 * E os m�todos adicionarGol e adicionarAssistencia que receba como argumento os 
 * quantidade de gols/assist�ncias. Tamb�m criar dois m�todos para ver o n�mero 
 * de gols e assist�ncias
 */

import java.util.Scanner;

import tests.JogadorTeste;

public class Jogador {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o nome do jogador: ");
		String nome = sc.nextLine();
		System.out.print("Quantidade de gols marcados: ");
		Integer gols = sc.nextInt();
		System.out.print("Quantidade de assistencias realizadas: ");
		Integer assistencias = sc.nextInt();
		
		JogadorTeste jog1 = new JogadorTeste(nome, gols, assistencias);
		System.out.println(jog1);
		
		jog1.adicionarAssistencia(3);
		System.out.println(jog1);
		
		jog1.adicionarGol(5);
		System.out.println(jog1);
		
		sc.close();
	}
}
