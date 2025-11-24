package LucasPires;

import java.util.Scanner;

public class LPC07 {

	public static void main(String[] args) {
		System.out.println("**************************************************");
		System.out.println("* Aluno: Lucas Pires Cabral - RA 0024413                   *");
		System.out.println("* Classe LPC07 -  Triângulo válido               *");
		System.out.println("**************************************************");

		int L1, L2, L3;

		System.out.println("Verificação de triângulo válido");

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o lado 1:");
		L1 = entrada.nextInt();

		System.out.println("Digite o lado 2:");
		L2 = entrada.nextInt();

		System.out.println("Digite o lado 3:");
		L3 = entrada.nextInt();

		if ((L1 < L2 + L3) && (L1 > L2 - L3)) {
			System.out.println("É um triângulo válido!");
		} else {
			System.out.println("O triângulo NÃO é válido!");
		}

	}

}
