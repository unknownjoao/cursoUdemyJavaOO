import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor: ");
		int n1 = leitor.nextInt();
		
		System.out.println("Informe o segundo valor: ");
		int n2 = leitor.nextInt();
		
		int soma = n1 + n2;
		
		System.out.println("SOMA = " + soma);
		
		leitor.close();
	}

}
