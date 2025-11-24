package LucasPires;

import java.util.Scanner;

public class LPC30 {

	public static void main(String[] args) {
		System.out.println("**************************************************************");
		System.out.println("* Aluno: Lucas Pires Cabral - RA 0024413                             *");
		System.out.println("* Classe LPC30 -  Menu até escolher sair                     *");
		System.out.println("**************************************************************");

		System.out.println();
		Scanner entrada = new Scanner(System.in);

		int interacao = -1;

		while (interacao != 0) {

			System.out.println("######################     MENU     ######################");
			System.out.println("#   Matrícula: 0024413                                   #");
			System.out.println("#   Usuário: Lucas Pires Cabral                       #");
			System.out.println("#   Curso: Engenharia de Software (noturno)              #");
			System.out.println("#   Semestre: 2°                                         #");
			System.out.println("#                                                        #");
			System.out.println("#   DIGITE '0' PARA SAIR DO MENU                         #");
			System.out.println("#   DIGITE QUALQUER NÚMERO PARA CONTINUAR                #");
			System.out.println("##########################################################");

			System.out.print("\nINTERAJA AQUI: ");
			interacao = entrada.nextInt();

			System.out.println();

			if (interacao != 0) {
				System.out.println("Você escolheu continuar! Voltando ao menu...\n");
			}
		}
		System.out.println("Saindo do Menu...");
		System.out.println("Programa encerrado com sucesso!");

	}

}