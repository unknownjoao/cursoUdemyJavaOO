import java.util.Scanner;

public class exercicioWhile {

	public static void main(String[] args) {
		// Escreva um programa que repita a leitura de uma senha até que ela seja
		// válida. Para cada leitura de senha
		// incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for
		// informada corretamente deve ser
		// impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que
		// a senha correta é o valor 2002

		int senha;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe a senha: ");
		senha = leitor.nextInt();

		while (senha != 2002) {
			System.out.println("Senha Inválida");
			senha = leitor.nextInt();
		}
		System.out.println("Acesso Permitido");

		leitor.close();
	}
}
