package LucasPires;

public class LPC17 {

	public static void main(String[] args) {
		System.out.println("**************************************************************");
		System.out.println("* Aluno: Lucas Pires Cabral - RA 0024413                             *");
		System.out.println("* Classe LPC17 -    Quadrado dos números de 1 a 10.          *");
		System.out.println("**************************************************************");

		System.out.println("Quadrado dos números de 1 a 10: ");

		double quadrado;
		for (int i = 1; i <= 10; i++) {
			quadrado = i * i;
			System.out.println("O quadrado de " + i + " é " + quadrado);
		}
	}

}