package LucasPires;

import java.util.Scanner;

public class LPC23 {

	public static void main(String[] args) {
		System.out.println("**************************************************************");
		System.out.println("* Aluno: Lucas Pires Cabral - RA 0024413                             *");
		System.out.println("* Classe LPC23 -      Senha correta                          *");
		System.out.println("**************************************************************");

		System.out.println("Digite abaixo a senha para entrar.");

		Scanner entrada = new Scanner(System.in);

		String senhaCorreta = "12345";
		String senhaDigitada = "";

		while (!senhaDigitada.equals(senhaCorreta)) {
			System.out.print("Digite a senha: ");
			senhaDigitada = entrada.nextLine();

			if (!senhaDigitada.equals(senhaCorreta)) {
				System.out.println();
				System.out.println("Senha incorreta! Tente novamente. ");
			}
		}

		System.out.println();
		System.out.println("Senha Correta! Acesso concedido.");
	}
}