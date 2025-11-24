package LucasPires;

import java.util.Scanner;

public class LPC04 {

	public static void main(String[] args) {
		System.out.println("**************************************************");
		System.out.println("* Aluno: Lucas Pires Cabral - RA 0024413                    *");
		System.out.println("* Classe LPC04 - Pode votar?                     *");
		System.out.println("**************************************************");

		int n1;

		System.out.println("Verificação se pode votar ou não");

		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a sua idade: ");
		n1 = entrada.nextInt();

		if (n1 >= 16) {
			System.out.println("Você PODE votar!");
		} else if (n1 < 16) {
			System.out.println("Você NÃO pode votar!");
		} else if (n1 < 0) {
			System.out.println("Idade inválida!");
		}
	}
}
