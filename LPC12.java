package LucasPires;

import java.util.Scanner;

public class LPC12 {

	public static void main(String[] args) {
		System.out.println("**************************************************");
		System.out.println("* Aluno: Lucas Pires Cabral - RA 0024413                 *");
		System.out.println("* Classe LPC12 -  Tabuada de um número.          *");
		System.out.println("**************************************************");

		System.out.println("Este programa te entrega a tabuada completa de 1 a 10 de qualquer número de sua escolha");

		Scanner entrada = new Scanner(System.in);

		int tabuada, resultado;

		System.out.println("Digite aqui o número que você queira ver a tabuada: ");
		int numero = entrada.nextInt();

		for (tabuada = 0; tabuada <= 10; tabuada++) {
			resultado = numero * tabuada;
			System.out.println(numero + " X " + tabuada + " = " + resultado);
		}
	}

}