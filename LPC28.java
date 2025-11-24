package LucasPires;

public class LPC28 {

	public static void main(String[] args) {
		System.out.println("**************************************************************");
		System.out.println("* Aluno: Lucas Pires Cabral - RA 0024413                             *");
		System.out.println("* Classe LPC28 -  Soma dos pares entre 1 e 100               *");
		System.out.println("**************************************************************");

		System.out.println("Soma dos números pares de 1 a 100: ");

		int i = 1;
		int soma = 0;

		while (i <= 100) {
			if (i % 2 == 0) {
				soma += i;
			}
			i++;
		}

		System.out.println(soma);

	}
}