package LucasPires;

import java.util.Scanner;

public class LPC22 {

	public static void main(String[] args) {
		System.out.println("**************************************************************");
		System.out.println("* Aluno: Lucas Pires Cabral - RA 0024413                             *");
		System.out.println("* Classe LPC22 -      Soma de números até digitar zero.      *");
		System.out.println("**************************************************************");

		System.out.println("Este programa mostra a soma dos números que você digitar e mostra o resultado quando digitar 0");

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");

		int n = entrada.nextInt();

		int soma = 0;

		while (n != 0) {

			soma += n;
			System.out.println("Digite outro número para somar (0 para saber o resultado): ");
			n = entrada.nextInt();

		}

		System.out.println("O resultado da soma é " + soma);

	}

}