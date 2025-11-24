package LucasPires;

import java.util.Scanner;

public class LPC02 {

	public static void main(String[] args) {
		System.out.println("**************************************************");
		System.out.println("* Aluno: Lucas Pires Cabral - RA 0024413                  *");
		System.out.println("* Classe LPC02 - Par ou ímpar                    *");
		System.out.println("**************************************************");

		int n1;
		System.out.println("Verificação se o número é par ou ímpar");
		System.out.println("Digite um número inteiro: ");
		Scanner entrada = new Scanner(System.in);
		n1 = entrada.nextInt();

		if (n1 % 2 == 0) {
			System.out.println("Número digitado é par!");
		} else {
			System.out.println("Número digitado é ímpar");
		}

	}

}
