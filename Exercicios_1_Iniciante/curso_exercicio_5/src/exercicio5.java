import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
		//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		
		Locale.setDefault(Locale.US);
		
		Scanner leitor = new Scanner(System.in);
		System.out.print("Código da primeira peça: ");
		int pc1 = leitor.nextInt();
		System.out.print("Quantidade de peças: ");
		int quant1 = leitor.nextInt();
		System.out.print("Preço de cada peça: ");
		double preco1 = leitor.nextDouble();
		
		System.out.print("Código da segunda peça: ");
		int pc2 = leitor.nextInt();
		System.out.print("Quantidade de peças: ");
		int quant2 = leitor.nextInt();
		System.out.print("Preço de cada peça: ");
		double preco2 = leitor.nextDouble();
		
		double conta = quant1 * preco1 + quant2 * preco2;
		
		System.out.printf("VALOR A PAGAR = %.2f", conta);
		
		leitor.close();
	}

}
