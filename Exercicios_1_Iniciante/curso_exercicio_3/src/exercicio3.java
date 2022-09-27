import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
		//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
		int A, B, C ,D;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o valor de A: ");
		A = leitor.nextInt();
		System.out.println("Informe o valor de B: ");
		B = leitor.nextInt();
		System.out.println("Informe o valor de C: ");
		C = leitor.nextInt();
		System.out.println("Informe o valor de D: ");
		D = leitor.nextInt();
		
		int diferenca = (A * B - C * D);
		
		System.out.println("DIFERENCA = " + diferenca);
		
		leitor.close();
	}

}
