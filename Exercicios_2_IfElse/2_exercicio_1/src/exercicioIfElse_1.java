import java.util.Scanner;

public class exercicioIfElse_1 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		int n1 = leitor.nextInt();
		
		if (n1 < 0) {
			System.out.println("NEGATIVO");
		} else if(n1 > 0 || n1 == 0) {
			System.out.println("NÃO NEGATIVO");
		}
	}

}
