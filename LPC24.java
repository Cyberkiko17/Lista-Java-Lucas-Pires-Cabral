package LucasPires;

import java.util.Scanner;

public class LPC24 {

	public static void main(String[] args) {
		System.out.println("**************************************************************");
		System.out.println("* Aluno: Lucas Pires Cabral - RA 0024413                             *");
		System.out.println("* Classe LPC24 -      Verificar se um número é positivo.     *");
		System.out.println("**************************************************************");

		System.out.println("Este programa verifica se um número é positivo");

		Scanner entrada = new Scanner(System.in);
		System.out.print("\nDigite um número: ");
		int n = entrada.nextInt();

		while (n <= 0) {
			System.out.println();
			System.out.print("Este NÃO é um número positivo! \nDigite outro número: ");
			n = entrada.nextInt();
		}
		System.out.println();
		System.out.println("\nEste número É positivo!");

	}
}