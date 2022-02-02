package internet;

import java.util.Scanner;

public class SenhaForte {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma senha: ");
		String senha = sc.nextLine();
		
		int retorno = validaComplexidade(senha);
		
		System.out.println(retorno);
		
		sc.close();
	}

	public static int validaComplexidade(String senha) {
		if (senha.length() < 8 || senha.length() > 32)
			return 0;

		boolean achouNumero = false;
		boolean achouMaiuscula = false;
		boolean achouMinuscula = false;
		boolean achouSimbolo = false;
		for (char c : senha.toCharArray()) {
			if (c >= '0' && c <= '9') {
				achouNumero = true;
			} else if (c >= 'A' && c <= 'Z') {
				achouMaiuscula = true;
			} else if (c >= 'a' && c <= 'z') {
				achouMinuscula = true;
			} else {
				achouSimbolo = true;
			}
		}
		
		if(achouNumero && achouMaiuscula && achouMinuscula && !achouSimbolo) {
			return 1;
		}else {
			return 0;
		}

	}
}
