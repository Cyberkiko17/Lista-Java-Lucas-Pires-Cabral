package LucasPires;

import java.util.Scanner;

public class LPC08 {

	public static void main(String[] args) {
		System.out.println("**************************************************");
		System.out.println("* Aluno: Lucas Pires Cabral - RA 0024413                  *");
		System.out.println("* Classe LPC08 -  Login simples                  *");
		System.out.println("**************************************************");

		System.out.println("Faça seu login abaixo:");
		System.out.println();
		System.out.println("DICA: Usuário = 'Lucas'");
		System.out.println("      Senha = '12345'");
		Scanner entrada = new Scanner(System.in);

		System.out.println();
		System.out.println("Usuário: ");
		String u = entrada.nextLine();

		System.out.println("Senha: ");
		String s = entrada.nextLine();

		if (u.equals("Lucas") && s.equals("12345")) {
			System.out.println("Login OK! Bem-vindo, " + u + "!");
		} else {
			System.out.println("Usuário ou senha incorretos.");
		}
	}

}