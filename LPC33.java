package LucasPires;

import java.util.Scanner;

public class LPC33 {

	public static void main(String[] args) {
		System.out.println("**************************************************************");
		System.out.println("* Aluno: Lucas Pires Cabral - RA 0024413                             *");
		System.out.println("* Classe LPC33 -    Menu com opção de sair                   *");
		System.out.println("**************************************************************");

		Scanner entrada = new Scanner(System.in);
		int n;

		System.out.println();

		do {
			System.out.println("######################     MENU     ######################");
			System.out.println("#                                                        #");
			System.out.println("#   1 - Mensagem                                         #");
			System.out.println("#   2 - Sair                                             #");
			System.out.println("#                                                        #");
			System.out.println("#                                                        #");
			System.out.println("#                                                        #");
			System.out.println("#                                                        #");
			System.out.println("##########################################################");
			System.out.print("Escolha uma opção: ");
			n = entrada.nextInt();

			if (n == 1) {
				System.out.println("Você escolheu a mensagem!\n");
				System.out.println();
			} else
				System.out.println("Digite apenas '1' ou '2'\n");
			System.out.println();

		} while (n != 2);

		System.out.println("\nSaindo do programa...");
	}

}