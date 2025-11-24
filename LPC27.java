package LucasPires;

import java.util.Scanner;

public class LPC27 {

	public static void main(String[] args) {
		System.out.println("**************************************************************");
		System.out.println("* Aluno: Lucas Pires Cabral - RA 0024413                             *");
		System.out.println("* Classe LPC27 -  Quantidade de números ímpares digitados    *");
		System.out.println("**************************************************************");

		System.out.println(
				"Este programa lê 10 números que o usuário digitar e identifica quantos deles são números ímpares ");
		System.out.println();

		Scanner entrada = new Scanner(System.in);
		int i = 1;
		int impar = 0;

		while (i <= 10) {
			System.out.print("Digite um número: ");
			int n = entrada.nextInt();
			i++;

			if (n % 2 != 0) {
				impar++;
			}
		}
		if (impar == 1) {
			System.out.print("\nExiste " + impar + " número ímpar!");
		} else {
			System.out.print("\nExistem " + impar + " números ímpares!");
		}
	}
}