package LucasPires;

import java.util.Scanner;

public class LPC40 {

	public static void main(String[] args) {
		System.out.println("***************************************************************************");
		System.out.println("* Aluno: Lucas Pires Cabral - RA 0024413                                          *");
		System.out.println("* Classe LPC40 - Ler números e mostrar o maior (até digitar negativo)     *");
		System.out.println("***************************************************************************");

		System.out.println("Este programa lê números digitados pelo usuário e mostra o maior deles.\n");
		Scanner entrada = new Scanner(System.in);
		int n;
		int maior = 0;

		do {
			System.out.print("Digite um número positivo (negativo para sair): ");
			n = entrada.nextInt();
			if (n > maior && n >= 0) {
				maior = n;
			}

		} while (n >= 0);

		if (maior == 0) {
			System.out.println("Nenhum número positivo foi digitado.");
		} else {
			System.out.println("\nO maior número digitado foi: " + maior);
		}

	}

}