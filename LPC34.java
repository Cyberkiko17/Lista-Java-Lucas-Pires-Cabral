package LucasPires;

import java.util.Scanner;

public class LPC34 {

	public static void main(String[] args) {
		System.out.println("**************************************************************");
		System.out.println("* Aluno: Lucas Pires Cabral - RA 0024413                             *");
		System.out.println("* Classe LPC34 -    Pedir senha até acertar                  *");
		System.out.println("**************************************************************");

		int senha = 1111;
		int n;
		Scanner entrada = new Scanner(System.in);

		do {
			System.out.print("Digite a senha (APENAS NÚMEROS): ");
			n = entrada.nextInt();
			System.out.println("Senha incorreta! Tente novamente.\n");
		} while (n != senha);

		System.out.println("Acesso liberado!");

	}

}