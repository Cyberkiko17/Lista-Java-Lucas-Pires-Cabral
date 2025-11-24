package LucasPires;

import java.util.Scanner;

public class LPC26 {

	public static void main(String[] args) {
		System.out.println("**************************************************************");
		System.out.println("* Aluno: Lucas Pires Cabral - RA 0024413                             *");
		System.out.println("* Classe LPC26 -      Número primo com while.                *");
		System.out.println("**************************************************************");

		System.out.println("Este programa mostra se um número é primo ou não");

		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um número: ");

		int n = entrada.nextInt();
		System.out.println();

		int i = 2; // = 2 porque números menores ou iguais a 1 não são primos, então testaremos do
					// 2 até o valor antecessor de "n"
		int divisores = 0; // se tiver divisores após o número 2 ele não é um número primo

		while (i < n) { // vai rodar X vezes até chegar ao número antecessor de "n"
			if (n % i == 0) { // testando se "n" é divisível pelos próximos números
				divisores++; // aqui ele adiciona +1 ao n° de divisores de "n"
			}
			i++; // irá rodar o loop até cumprir a condição (i < n)
		}

		if (divisores == 0 && n > 1) { // se não houver mais divisores de "n" além do 1 e ele mesmo e,ao mesmo tempo,
										// "n" for maior que 1 ele É PRIMO
			System.out.println(n + " É um número primo!");
		} else {
			System.out.println(n + " NÃO é um número primo!"); // se não cumprir a condição acima, ele NÃO É PRIMO
		}
	}
}