package LucasPires;

import java.util.Scanner;

public class LPC39 {

	public static void main(String[] args) {
		System.out.println("**************************************************************");
		System.out.println("* Aluno: Lucas Pires Cabral - RA 0024413                             *");
		System.out.println("* Classe LPC39 -   Validar número entre 1 e 5                *");
		System.out.println("**************************************************************");

		Scanner entrada = new Scanner(System.in);
		int n;

		do {
			System.out.print("\nDigite um número entre 1 e 5: ");
			n = entrada.nextInt();
			if (n < 1 || n > 5) {
				System.out.println("Erro! Número deve ser entre 1 e 5.\n");
			}

		} while (n < 1 || n > 5);

		System.out.println("\nPARABÉNS, VOCÊ CONSEGUIU!");
		System.out.println("PROGRAMA ENCERRADO...");

	}

}