package LucasPires;

public class LPC13 {

	public static void main(String[] args) {
		System.out.println("**************************************************************");
		System.out.println("* Aluno: Lucas Pires Cabral - RA 0024413                             *");
		System.out.println("* Classe LPC13 -   Soma dos 100 primeiros números naturais.  *");
		System.out.println("**************************************************************");

		int soma = 0;

		for (int i = 1; i <= 100; i++) {
			soma += i;

		}
		System.out.println("Soma dos números de 1 a 100 é de " + soma);

	}

}