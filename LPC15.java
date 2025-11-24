package LucasPires;

import java.util.Scanner;

public class LPC15 {

	public static void main(String[] args) {
		System.out.println("**************************************************************");
		System.out.println("* Aluno: Lucas Pires Cabral - RA 0024413                             *");
		System.out.println("* Classe LPC15 -   Fatorial de um número.                    *");
		System.out.println("**************************************************************");

		System.out.println("Este programa faz o fatorial de qualquer número");
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o número que deseja ver o fatorial: ");
		int n = entrada.nextInt();

		int fatorial = 1;

		for (int i = 1; i <= n; i++) {
			fatorial *= i;
		}

		System.out.println();
		System.out.println("O fatorial do número " + n + " é " + fatorial);
	}

}