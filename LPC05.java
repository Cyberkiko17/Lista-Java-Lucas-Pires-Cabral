package LucasPires;

import java.util.Scanner;

public class LPC05 {

	public static void main(String[] args) {
		System.out.println("**************************************************");
		System.out.println("* Aluno: Lucas Pires Cabral - RA 0024413                  *");
		System.out.println("* Classe LPC05 - Notas e aprovação               *");
		System.out.println("**************************************************");

		double n1, n2, n3, n4;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Verficação se você está aprovado ou não (segundo as suas notas)");
		System.out.println("Digite sua nota 1:");
		n1 = entrada.nextDouble();

		System.out.println("Digite sua nota 2:");
		n2 = entrada.nextDouble();

		System.out.println("Digite sua nota 3:");
		n3 = entrada.nextDouble();

		System.out.println("Digite sua nota 4:");
		n4 = entrada.nextDouble();

		double media = (n1 + n2 + n3 + n4) / 4;

		if (media >= 6) {
			System.out.println("Parabéns, você está APROVADO!");
			System.out.println("Sua nota foi de " + media);
		} else if (media < 6) {
			System.out.println("Infelizmente você está REPROVADO!");
			System.out.println("Sua nota foi de " + media);
		} else {
			System.out.println("Valor inválido!");
		}

	}

}
