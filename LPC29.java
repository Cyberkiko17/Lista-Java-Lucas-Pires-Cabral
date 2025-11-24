package LucasPires;

import java.util.Scanner;

public class LPC29 {

	public static void main(String[] args) {
		System.out.println("**************************************************************");
		System.out.println("* Aluno: Lucas Pires Cabral - RA 0024413                             *");
		System.out.println("* Classe LPC29 -  Contar dígitos de um número                *");
		System.out.println("**************************************************************");

		System.out.println("Este programa informa quantos dígitos qualquer número positivo possui");

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int n = entrada.nextInt();

		int contador = 0;

		if (n == 0) {
			contador = 1;
		} else {
			while (n > 0) {
				n = n / 10;
				contador++;
			}
		}
		if (contador > 1) {
			System.out.println("\nO número digitado tem " + contador + " dígitos");
		} else {
			System.out.println("\nO número digitado tem " + contador + " dígito");
		}
	}
}