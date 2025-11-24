package LucasPires;

import java.util.Scanner;

public class LPC03 {

	public static void main(String[] args) {
		System.out.println("**************************************************");
		System.out.println("* Aluno: Lucas Pires Cabral - RA 0024413                 *");
		System.out.println("* Classe LPC03 - Maior de dois números           *");
		System.out.println("**************************************************");

		int n1, n2;

		System.out.println("Verificação qual número é maior");
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite n1: ");
		n1 = entrada.nextInt();

		System.out.println("Digite n2: ");
		n2 = entrada.nextInt();

		if (n1 > n2) {
			System.out.println("n1 é maior que n2!");
		} else if (n1 < n2) {
			System.out.println("n2 é maior que n1!");
		} else {
			System.out.println("n1 e n2 são iguais!");
		}
	}

}