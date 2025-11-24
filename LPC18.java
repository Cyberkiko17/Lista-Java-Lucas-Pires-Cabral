package LucasPires;

public class LPC18 {

	public static void main(String[] args) {
		System.out.println("**************************************************************");
		System.out.println("* Aluno: Lucas Pires Cabral - RA 0024413                             *");
		System.out.println("* Classe LPC18 -     Múltiplos de 3 entre 1 e 30.            *");
		System.out.println("**************************************************************");

		System.out.println("Múltiplos de 3 entre 1 e 30 são: ");

		for (int i = 1; i <= 30; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}

	}

}