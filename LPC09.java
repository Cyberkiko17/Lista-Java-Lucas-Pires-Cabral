package LucasPires;

import java.util.Scanner;

public class LPC09 {

	public static void main(String[] args) {
		System.out.println("**************************************************");
		System.out.println("* Aluno: Lucas Pires Cabral - RA 0024413                 *");
		System.out.println("* Classe LPC09 -  Ordem Crescente (três números) *");
		System.out.println("**************************************************");

		System.out.println("Este programa ordena números que o usuário digitar em ordem crescente");

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite aqui o número 1: ");
		int n1 = entrada.nextInt();

		System.out.println("Digite aqui o número 2: ");
		int n2 = entrada.nextInt();

		System.out.println("Digite aqui o número 3: ");
		int n3 = entrada.nextInt();

		if (n1 <= n2 && n2 <= n3) {
			System.out.println(n1 + ", " + n2 + ", " + n3 + ".");
		} else if (n1 <= n3 && n3 <= n2) {
			System.out.println(n1 + ", " + n3 + ", " + n2 + ".");
		} else if (n2 <= n1 && n1 <= n3) {
			System.out.println(n2 + ", " + n1 + ", " + n3 + ".");
		} else if (n2 <= n3 && n3 <= n1) {
			System.out.println(n2 + ", " + n3 + ", " + n1 + ".");
		} else if (n3 <= n1 && n1 <= n2) {
			System.out.println(n3 + ", " + n1 + ", " + n2 + ".");
		} else if (n3 <= n2 && n2 <= n1) {
			System.out.println(n3 + ", " + n2 + ", " + n1 + ".");
		} else {
			System.out.println("Os números são inválidos.");
		}

	}

}