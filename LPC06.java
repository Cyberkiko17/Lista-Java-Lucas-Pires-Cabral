package LucasPires;

import java.util.Scanner;

public class LPC06 {

	public static void main(String[] args) {
		System.out.println("**************************************************");
		System.out.println("* Aluno: Lucas Pires Cabral - RA 0024413                  *");
		System.out.println("* Classe LPC06 - Múltiplo de 3 e/ou 5            *");
		System.out.println("**************************************************");

		System.out.println("Verificação de número múltiplo de 3 e/ou 5");

		double n1;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o número:");
		n1 = entrada.nextDouble();

		if ((n1 % 3 == 0 && n1 % 5 == 0)) {
			System.out.println("O número " + n1 + " É múltiplo de 3 e de 5!");
		} else if (n1 % 3 == 0) {
			System.out.println("O número " + n1 + " É múltiplo de 3!");
		} else if (n1 % 5 == 0) {
			System.out.println("O número " + n1 + " É múltiplo de 5!");
		} else {
			System.out.println("O número " + n1 + " NÃO é múltiplo de 3 NEM de 5!");
		}
	}

}