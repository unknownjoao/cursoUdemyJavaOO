import java.util.Scanner;

public class exercicioFor_6 {

	public static void main(String[] args) {
		// Ler um número inteiro N e calcular todos os seus divisores.

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira um valor inteiro: ");
		int N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			if(N % i == 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}
