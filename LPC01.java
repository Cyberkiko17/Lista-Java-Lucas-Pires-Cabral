package LucasPires;

import java.util.Scanner;

public class LPC01 {

	public static void main(String[] args) {
		System.out.println("**************************************************");
		System.out.println("* Aluno: Lucas Pires Cabral - RA 0024413                 *");
		System.out.println("* Classe LPC01 - Número positivo ou negativo     *");
		System.out.println("**************************************************");

		int n1;

		System.out.println("Verificação se o número é positivo ou negativo");
		System.out.println("Digite um número inteiro: ");
		Scanner entrada = new Scanner(System.in);
		
		n1 = entrada.nextInt();
		if (n1 > 0) {
			System.out.println("Número digitado é positivo");
		} else if (n1 < 0) {
			System.out.println("Número digitado é negativo");
		} else {
			System.out.println("Número inválido!");
		}

	}

}
