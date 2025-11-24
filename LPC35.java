package LucasPires;

import java.util.Scanner;

public class LPC35 {

	public static void main(String[] args) {
		System.out.println("**************************************************************");
		System.out.println("* Aluno: Lucas Pires Cabral - RA 0024413                             *");
		System.out.println("* Classe LPC35 -     Número positivo obrigatório             *");
		System.out.println("**************************************************************");

		Scanner entrada = new Scanner(System.in);
		int n;

		do {
			System.out.print("Digite um número positivo: ");
			n = entrada.nextInt();
			if (n <= 0) {
				System.out.println("Erro! Digite um número maior que 0.\n");
			}

		} while (n <= 0);

		System.out.println("\nPARABÉNS, VOCÊ CONSEGUIU!");
		System.out.println("PROGRAMA ENCERRADO...");

	}

}