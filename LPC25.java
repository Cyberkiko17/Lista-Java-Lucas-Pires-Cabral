package LucasPires;

import java.util.Scanner;

public class LPC25 {

	public static void main(String[] args) {
		System.out.println("**************************************************************");
		System.out.println("* Aluno: Lucas Pires Cabral - RA 0024413                             *");
		System.out.println("* Classe LPC25 -      Tabuada com while.                     *");
		System.out.println("**************************************************************");

		System.out.println("Este programa mostra a tabuada de qualquer número");

		Scanner entrada = new Scanner(System.in);
		System.out.print("\nDigite de qual número você quer ver a tabuada: ");
		int n = entrada.nextInt();
		System.out.println();

		int i = 1;

		while (i <= 10) {
			int resultado = n * i;
			System.out.println(n + " X " + i + " = " + resultado);
			i++;
		}
	}

}