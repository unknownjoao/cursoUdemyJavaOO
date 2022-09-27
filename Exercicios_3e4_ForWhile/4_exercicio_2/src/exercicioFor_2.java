import java.util.Scanner;

public class exercicioFor_2 {

	public static void main(String[] args) {
		// Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X
		// que serão lidos em seguida.
		// Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos
		// estão fora do intervalo, mostrando
		// essas informações conforme exemplo (use a palavra "in" para dentro do
		// intervalo, e "out" para fora do intervalo).

		Scanner leitor = new Scanner(System.in);

		System.out.println("Insira um valor inteiro: ");
		int N = leitor.nextInt();

		int in = 0;
		int out = 0;

		for (int i = 0; i < N; i++) {
			int x = leitor.nextInt();

			if (x >= 10 && x <= 20) {
				in += 1;
			} else {
				out += 1;
			}

		}

		System.out.println(in + " in");
		System.out.println(out + " out");

		leitor.close();
	}

}
