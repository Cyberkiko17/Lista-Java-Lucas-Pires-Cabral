package LucasPires;

import java.util.Scanner;

public class LPC37 {

	public static void main(String[] args) {
		System.out.println("**************************************************************");
		System.out.println("* Aluno: Lucas Pires Cabral - RA 0024413                             *");
		System.out.println("* Classe LPC37 -  Soma até o número ser múltiplo de 10       *");
		System.out.println("**************************************************************");

		Scanner entrada = new Scanner(System.in);

		int soma = 0;
		int n;

		do {
			System.out.print("Digite um número múltiplo de 10: ");
			n = entrada.nextInt();

			if (n % 10 != 0) {
				soma += n;
			} else if (n % 10 == 0) {
				System.out.println("PARABÉNS, O NÚMERO QUE VOCÊ DIGITOU (" + n + ") É MÚLTIPLO DE 10!\n");
			}

		} while (n % 10 != 0);
		System.out.println("Soma dos números NÃO múltiplos de 10 que você digitou: " + soma);

	}

}