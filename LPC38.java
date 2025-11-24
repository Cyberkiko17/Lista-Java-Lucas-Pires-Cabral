package LucasPires;

import java.util.Scanner;

public class LPC38 {

	public static void main(String[] args) {
		System.out.println("**************************************************************");
		System.out.println("* Aluno: Lucas Pires Cabral - RA 0024413                             *");
		System.out.println("* Classe LPC38 -   Confirmar saída com 's'                   *");
		System.out.println("**************************************************************");

		Scanner entrada = new Scanner(System.in);
		String sair = "s";
		String msg = "m";
		String n;

		System.out.println();

		do {
			System.out.println();
			System.out.println("######################     MENU     ######################");
			System.out.println("#                                                        #");
			System.out.println("#   DIGITE 'm' para ver a mensagem                       #");
			System.out.println("#   DIGITE 's' para sair                                 #");
			System.out.println("#                                                        #");
			System.out.println("#                                                        #");
			System.out.println("#                                                        #");
			System.out.println("#                                                        #");
			System.out.println("##########################################################");
			System.out.print("Escolha uma opção: ");
			n = entrada.nextLine();

			if (n.equals(msg)) {
				System.out.println("DEUS TE ABENÇOE, VOCÊ É UMA PESSOA ESPECIAL!\n");
			} else if (!n.equals(sair) && !n.equals(msg)) {
				System.out.println("Erro! Digite apenas 'm' ou 's'.\n");
			}

		} while (!n.equals(sair));
		System.out.println("\nSAINDO DO PROGRAMA...");
		System.out.println("OBRIGADOO!");

	}

}