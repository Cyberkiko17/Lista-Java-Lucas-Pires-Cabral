package LucasPires;

import java.util.Scanner;

public class LPC19 {

	public static void main(String[] args) {
		System.out.println("**************************************************************");
		System.out.println("* Aluno: Lucas Pires Cabral - RA 0024413                             *");
		System.out.println("* Classe LPC19 -     Verificar se um número é primo.         *");
		System.out.println("**************************************************************");

		System.out.println("Este programa verifica se um número é primo ou não");

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o número que você deseja descobrir se é primo:");
		int n = entrada.nextInt();

		int divisores = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				divisores++;
			}
		}
		if (divisores == 2) {
			System.out.println("É um número primo!");
		} else {
			System.out.println("NÃO é um número primo!");
		}
	}
}