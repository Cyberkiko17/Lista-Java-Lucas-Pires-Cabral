package LucasPires;

import java.util.Scanner;

public class LPC10 {

	public static void main(String[] args) {
		System.out.println("**************************************************");
		System.out.println("* Aluno: Lucas Pires Cabral - RA 0024413                 *");
		System.out.println("* Classe LPC10 -  Ano bissexto                   *");
		System.out.println("**************************************************");

		System.out.println("Verificação se o ano é bissexto ou não");

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o ano: ");
		int ano = entrada.nextInt();

		if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
			System.out.println(ano + " É um ano bissexto!");
		} else {
			System.out.println(ano + " NÃO é um ano bissexto");
		}

	}

}