package LucasPires;

public class LPC14 {

	public static void main(String[] args) {
		System.out.println("**************************************************************");
		System.out.println("* Aluno: Lucas Pires Cabral - RA 0024413                             *");
		System.out.println("* Classe LPC14 -   Números pares de 0 a 50.                  *");
		System.out.println("**************************************************************");

		System.out.println("Números pares de 0 a 50: ");

		for (int n = 0; n <= 50; n++) {
			if (n % 2 == 0) {
				System.out.print(" " +n);
			}
		}

	}

}