package LucasPires;

import java.util.Scanner;

public class LPC32 {

	public static void main(String[] args) {
		System.out.println("**************************************************************");
		System.out.println("* Aluno: Lucas Pires Cabral - RA 0024413                             *");
		System.out.println("* Classe LPC32 -   Tabuada de um número                      *");
		System.out.println("**************************************************************");

		int n;
		int i = 1;
		int tabuada;

		Scanner entrada = new Scanner(System.in);

		System.out.println("ESTE PROGRAMA INFORMA A TABUADA DE QUALQUER NÚMERO");
		System.out.print("Digite um número: ");
		n = entrada.nextInt();
		System.out.println();

		do {
			tabuada = n * i;
			System.out.println(n + " X " + i + " = " + tabuada);
			i++;

		} while (i <= 10);
	}

}