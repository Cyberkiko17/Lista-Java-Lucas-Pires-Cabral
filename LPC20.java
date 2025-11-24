package LucasPires;

import java.util.Scanner;

public class LPC20 {

	public static void main(String[] args) {
		System.out.println("**************************************************************");
		System.out.println("* Aluno: Lucas Pires Cabral - RA 0024413                             *");
		System.out.println("* Classe LPC20 -     Números de Fibonacci (n termos).        *");
		System.out.println("**************************************************************");

		System.out.println("Este programa mostra os números de Fibonacci de qualquer número");

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite aqui quantos termos deseja: ");
		int n = entrada.nextInt();

		int a = 0;
		int b = 1;

		System.out.println("Os números de Fibonacci com " + n + " termos são ");

		for (int i = 1; i <= n; i++) {
			System.out.print(a + " ");
			int proximo = a + b;
			a = b;
			b = proximo;
		}
	}

}