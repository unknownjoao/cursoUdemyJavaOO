import java.util.Scanner;

public class exercicioWhile_2 {

	public static void main(String[] args) {
		// Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
		// indeterminada de pontos no sistema
		// cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O
		// algoritmo será encerrado quando pelo
		// menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem
		// alguma).

		int x, y;
		Scanner leitor = new Scanner(System.in);
		System.out.print("Insira o valor de X: ");
		x = leitor.nextInt();
		System.out.print("Insira o valor de Y: ");
		y = leitor.nextInt();

		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			} else if (x > 0 && y < 0) {
				System.out.println("quarto");
			} else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			} else if (x < 0 && y > 0) {
				System.out.println("segundo");
			}
			System.out.print("Insira o valor de X: ");
			x = leitor.nextInt();
			System.out.print("Insira o valor de Y: ");
			y = leitor.nextInt();
		}

		leitor.close();
	}

}
